package Project_02.US07;

import Utilities.BaseDriverParameter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class US07_TC01 extends BaseDriverParameter {

    @Test
    public void TC01() {
        Pom7 pom = new Pom7(driver);
        driver.get("https://techno.study/tr/");
        String homeID = driver.getWindowHandle();
        js.executeScript("arguments[0].scrollIntoView();", pom.termOfUse);
        pom.termOfUse.click();
        Set<String> tabIds = driver.getWindowHandles();
        for (String e : tabIds)
            if (!e.equals(homeID))
                driver.switchTo().window(e);
        wait.until(ExpectedConditions.urlToBe("https://techno.study/tr/terms"));
        wait.until(ExpectedConditions.visibilityOf(pom.title));
        Assert.assertFalse(pom.articles.isEmpty());
        for (WebElement articles : pom.articles) {
            Assert.assertFalse(articles.getText().isEmpty());
        }
        Assert.assertTrue(pom.title.getText().equalsIgnoreCase("kullanım şartları"));
    }
}

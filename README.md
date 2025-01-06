# TestNG Projects

This project contains user stories for the OpenMRS application and automated test scenarios for the NopCommerce application. It is designed to help understand user needs and functionality.

## OpenMRS User Stories

This section contains user stories defined for the OpenMRS application.

### US_401: Check Login Error Messages
- **Description:** As a user, I want to see an error message for invalid login attempts so that I can enhance the security of the application.
- **Acceptance Criteria:**
  - The user navigates to the homepage.
  - Clicks the [DEMO] button.
  - Clicks the [Explore OpenMRS 2] button.
  - Clicks the [Enter the OpenMRS 2 Demo] button.
  - Enters an invalid username and password.
  - Clicks the "Login" button.
  - Receives an error message.
- **Preconditions:**
  - Chrome, Safari, or Firefox browsers must be installed and running.
  - Internet access must be available.
  - Test environment: [https://openmrs.org/](https://openmrs.org/)

### US_402: Log In to the System
- **Description:** As a user, I want to be able to log in to the system so that I can utilize the features of the application.
- **Acceptance Criteria:**
  - The user can log in with a valid username and password.
- **Preconditions:**
  - Dependent on the previous story.

### US_403: Log Out of the System
- **Description:** As a user, I want to securely log out of the system so that I can ensure the application is not left open.
- **Acceptance Criteria:**
  - The user must successfully terminate the session.
- **Preconditions:**
  - The user must be logged in to the system.

### US_404: Patient Registration
- **Description:** As a user, I want to enter my information to register a patient in the system.
- **Acceptance Criteria:**
  - The user must successfully register a patient.
- **Preconditions:**
  - The user must be logged in.

### US_405: My Account
- **Description:** As a user, there should be an icon or link on the homepage to access account settings.
- **Acceptance Criteria:**
  - The user should be able to quickly access account settings.
- **Preconditions:**
  - The user must be logged in.

### US_406: Search in Patient List
- **Description:** As a doctor, I want to list and search for patients.
- **Acceptance Criteria:**
  - The doctor must be able to successfully search for patients.
- **Preconditions:**
  - The doctor must be logged in.

### US_407: Delete Patient
- **Description:** As a doctor, I want to delete a patient from the system.
- **Acceptance Criteria:**
  - The doctor must be able to successfully delete a patient from the system.
- **Preconditions:**
  - The doctor must be logged in.

### US_408: List Patients
- **Description:** As a doctor, I want to list all patients.
- **Acceptance Criteria:**
  - The doctor must be able to see the patient list.
- **Preconditions:**
  - The doctor must be logged in.

### US_409: Merge Patient Records
- **Description:** As a doctor, I want to merge two patient records that I entered previously.
- **Acceptance Criteria:**
  - The doctor must be able to successfully merge two patient records.
- **Preconditions:**
  - The doctor must be logged in.

### US_410: Wrong System Time Zone When Scheduling a Patient Appointment
- **Description:** As a user, I want to see an error message when the system time is set incorrectly while scheduling a patient appointment.
- **Acceptance Criteria:**
  - The user must receive a warning when the system time is set incorrectly.
- **Preconditions:**
  - The user must be logged in.

## NopCommerce Test Automation

This section contains automated test scenarios for the NopCommerce application.

### Test Scenarios

#### Test Case 1: Login Test
1. Go to [https://admin-demo.nopcommerce.com/login](https://admin-demo.nopcommerce.com/login).
2. Enter a valid username and password.
3. Click the Login button.
4. Confirm that you are logged in.

#### Test Case 2: Check LeftNav Menu
1. Click on the menus under the Dashboard one by one.
2. Verify that the menus open.
3. Confirm that the elements under the opened menu are present.

#### Test Case 3: Create Customer
1. Click on Customers under the Customers menu.
2. Click the "Add new" button on the opened page.
3. Fill out the form and click the "Save" button.
4. Confirm that you have successfully created a customer.

#### Test Case 4: Edit Customer
1. Click on Customers.
2. On the opened page, enter the email, first name, and last name of the customer you created in the search field.
3. Click the "Search" button.
4. Verify that your created record appears.
5. Click the "Edit" button.
6. Change any information and click the "Save" button.
7. Confirm that the update was successful.

#### Test Case 5: Delete Customer
1. Click on Customers.
2. Enter the email, first name, and last name of the customer you created in the search field.
3. Click the "Search" button.
4. Click the "Delete" button.
5. Confirm that you have successfully deleted the customer.

#### Test Case 6: Search Test
1. Enter the text "Shipments" in the search field.
2. Click on the search result.
3. Confirm that you have navigated to the "Shipments" page.

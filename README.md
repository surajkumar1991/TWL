# Katalon Studio Samples: BDD Cucumber Tests
Katalon Studio is a free and easy-to-use automated functional and regression testing platform. It provides users the ability to implement full automated testing solutions for their application projects with minimal engineering and programming skill requirements.
______
The **katalon-bdd-cucumber-tests** perform UI & API functional automation tests written in BDD Cucumber format on Jira Web Application using Katalon Studio. The examples in this project range from common to advanced test cases.
## Getting Started
These instructions will get you a copy of the project up and running on your local machine.

### Important Notes:
- **This sample project is compatiple to Katalon version 5.7 and above only.**
- katalon-bdd-cucumber-tests project airms to demonstrate how to express Test Cases (or Test Scenarios) in Cucumber format using Gherkin language. To make the test easier to understand by users, this sample project is built on top of two other sample projects:
    + [Jira UI Tests](https://github.com/katalon-studio-samples/jira-ui-tests)
    + [Jira API Tests](https://github.com/katalon-studio-samples/jira-api-tests)
- You might need to explore these two projects before starting this project for better understanding.

### Prerequisites
- [Katalon Studio](https://www.katalon.com/) - [Installation and Setup](https://docs.katalon.com/x/HwAM)
- Internet access
- Application Under Test (AUT):
     + Jira cloud: https://katalon.atlassian.net/
     + Account: demo@katalon.com/sPiHQ&YEa6ST`de+
### Setting Up
- [Check out](https://git-scm.com/book/en/v2/Git-Basics-Getting-a-Git-Repository) the code from this repository
- [Open the project](https://docs.katalon.com//display/KD/Manage+Test+Project) from Katalon Studio
### Executing a Feature
![Execute a simple feature](https://github.com/katalon-studio-samples/katalon-bdd-cucumber-tests/blob/master/Tutorials/Figures/Execute%20a%20feature.png?raw=true)
1. Expand the **Include** structure, where all the features and step definition scripts located
2. Select the **Feature** you want to execute
3. Execute the **Feature**

At the end of this README, you will find additional ways to execute automation test cases. 
## Test Features
Below is the list of all the available features in this project relating to the test scenarios as described. Simply select the test feature you want to run in Katalon Studio and execute accordingly. You can also make additional changes in these test features to get familiar with automation testing and specifically Katalon Studio. 
### Story: Verify issue information feature
```Gherkin     
@Issue_Tests
Feature: Verify issue information

Background:
  Given The Jira System is available

  @Get_By_Id
  Scenario: Verify issue information by Id
    When I get information of an issue with Id "KD-1"
    Then I get response code "200"
    And The issue information as below:
        |project_key |issue_type |priority |summary                          |
        |KD          |Bug        |Low      |REST - Create new issue using API|
        
  @Get_By_Id
  Scenario Outline: Verify issue information by Id
    When I get information of an issue with Id "<issue_key>"
    Then I get response code "200"
    And The issue information as below:
        |project_key   |issue_type   |priority   |summary   |
        |<project_key> |<issue_type> |<priority> |<summary> |
        
  Examples:
  |issue_key|project_key |issue_type |priority |summary                          |
  |KD-1     |KD          |Bug        |Low      |REST - Create new issue using API|
  |KD-2     |KD          |Bug        |Low      |Update summary from API example  |
```

## Test Cases
### Create a Test Case 
- With hard coding test data
- With encrypted test data
- With test data from GlobalVariable (Profiles)
- With data-driven approach
- With test steps calling other test cases
- With test steps calling custom keywords

### Advanced Test Cases
- Follow [Page Object Design Pattern](https://www.seleniumhq.org/docs/06_test_design_considerations.jsp#page-object-design-pattern) 
- Test cases are set up to be reusable
- Test steps are readable with BDD mindset
## Advanced Execution 
### Execute an Advanced Test Case
 ![Execute an advance test case](https://github.com/katalon-studio-samples/katalon-bdd-cucumber-tests/blob/master/Tutorials/Figures/Execute%20an%20advance%20test%20case.png?raw=true)
 The advance test cases in this example repository demonstrate how to set up the test project with Page Object Design Pattern approach to reduce the maintenance cost as well as increase the reusability of testing scripts.
1. Tests is the place where actual test cases are stored and executed.
2. Pages is the place where Page Objects are stored in Test case format. They could not be executed.
3. Select the test case you want to execute
4. Choose the browser for executing the test case
 
 ### Execute a Test Suite with Data-Driven
 ![Execute a test suite with data-driven](https://github.com/katalon-studio-samples/katalon-bdd-cucumber-tests/blob/master/Tutorials/Figures/Execute%20a%20test%20suite%20with%20data-driven.png?raw=true)
 This example demonstrates how to apply data-driven approach to test execution with Katalon Studio. 
1. Expand the Test Suites structure, where all the test suites are stored and select the test suite you want to execute
2. Select the test case you want to apply data-driven approach
3. Click Show/Hide Data Binding to open Test Data and Variable Binding feature for the selected test case
4. Add an Data Files item containing test data used in the test
5. Data Files structure, where all the data files are stored. These data files can be created from external Excel files, CSV files, or from the result of a database query.
6. Variables and Data are binding
7. Choose the browser for executing the test suite
 
 ### Execute a Test Suite Collection
 ![Execute a test suite collection](https://github.com/katalon-studio-samples/katalon-bdd-cucumber-tests/blob/master/Tutorials/Figures/Execute%20a%20test%20suite%20collection.png?raw=true)
 This example demonstrates how to execute a test suite collection.
1. Expand the Test Suites structure and select the test suite collection you want to execute
2. Test suite lists in the selected collection. 
3. A browser type is selected for each test suite in the collection
4. A execution profile is selected for each test suite in the collection
5. Execution mode. You can set to execute the test suite collection in Sequential or Parallel modes.
6. Execute the test suite collection with defined configuration.
 
## See Also
Update configurations for integration: [Jira](https://docs.katalon.com/x/7oEw), [Katalon Analytics](https://docs.katalon.com/x/KRhO)

Katalon Documentation: http://docs.katalon.com/, especially some [Tips and Tricks](https://docs.katalon.com/x/PgXR) to run a successful automation test. 

Katalon Forum: https://forum.katalon.com/

Katalon Business Support: https://www.katalon.com/support-service-options/

import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/SanitySuite')

suiteProperties.put('name', 'SanitySuite')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("/Users/akhileshpalandurkar/git/KatalonBDD2/Reports/SanitySuite/20191008_220713/execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/SanitySuite', suiteProperties, [new TestCaseBinding('Test Cases/workLifeTest/FacebockCreation', 'Test Cases/workLifeTest/FacebockCreation',  null), new TestCaseBinding('Test Cases/workLifeTest/ProfileDeletion', 'Test Cases/workLifeTest/ProfileDeletion',  null), new TestCaseBinding('Test Cases/workLifeTest/FailureTest', 'Test Cases/workLifeTest/FailureTest',  null), new TestCaseBinding('Test Cases/workLifeTest/ProfileCreationAddSkill', 'Test Cases/workLifeTest/ProfileCreationAddSkill',  null), new TestCaseBinding('Test Cases/workLifeTest/ProfileCreationEducationDetails', 'Test Cases/workLifeTest/ProfileCreationEducationDetails',  null), new TestCaseBinding('Test Cases/workLifeTest/ProfileCreationExperience', 'Test Cases/workLifeTest/ProfileCreationExperience',  null), new TestCaseBinding('Test Cases/workLifeTest/ProfileCreationPersonalDetails', 'Test Cases/workLifeTest/ProfileCreationPersonalDetails',  null), new TestCaseBinding('Test Cases/Rate users - third party', 'Test Cases/Rate users - third party',  null), new TestCaseBinding('Test Cases/Connect with users', 'Test Cases/Connect with users',  null), new TestCaseBinding('Test Cases/Endorse skills', 'Test Cases/Endorse skills',  null), new TestCaseBinding('Test Cases/Flag reviews', 'Test Cases/Flag reviews',  null), new TestCaseBinding('Test Cases/Search users', 'Test Cases/Search users',  null), new TestCaseBinding('Test Cases/Thumbing - Upvote and downvote', 'Test Cases/Thumbing - Upvote and downvote',  null), new TestCaseBinding('Test Cases/Post something', 'Test Cases/Post something',  null), new TestCaseBinding('Test Cases/Moderation of review', 'Test Cases/Moderation of review',  null), new TestCaseBinding('Test Cases/Rate users', 'Test Cases/Rate users',  null), new TestCaseBinding('Test Cases/Login success', 'Test Cases/Login success',  null), new TestCaseBinding('Test Cases/Third party profile', 'Test Cases/Third party profile',  null), new TestCaseBinding('Test Cases/workLifeTest/FacebockCreation', 'Test Cases/workLifeTest/FacebockCreation',  null), new TestCaseBinding('Test Cases/workLifeTest/RecreationofProfile', 'Test Cases/workLifeTest/RecreationofProfile',  null)])

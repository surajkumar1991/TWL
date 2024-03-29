import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://qa.thework.life/')

WebUI.setText(findTestObject('Object Repository/Rate/Page_theworklife - Find Great People To Work With/input_Forgot password_username'), 
    'worklifetest10001@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Rate/Page_theworklife - Find Great People To Work With/input_Forgot password_password'), 
    'x8UobeF0bbxd7GrPsdhkIlsTrhBxwBw1')

WebUI.click(findTestObject('Object Repository/Rate/Page_theworklife - Find Great People To Work With/button_Sign in'))

WebUI.setEncryptedText(findTestObject('Object Repository/Rate/Page_theworklife - Find Great People To Work With/input_Password does not match_password'), 
    'XU9cBalmEBp1UP+jEU2w4UUBUuNgBY4U')

WebUI.click(findTestObject('Object Repository/Rate/Page_theworklife - Find Great People To Work With/button_Sign in'))

WebUI.setText(findTestObject('Object Repository/Rate/Page_Home/input_View all_searchText'), 'user1570385143181')

WebUI.click(findTestObject('Rate/Page_Home/Search user button'))

WebUI.click(findTestObject('Rate/Page_Home/click on user to rate'))

WebUI.click(findTestObject('Rate/Page_Home/Click rate now'))

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/connect with user/Page_Search/select_Select relationshipManagerReporteeColleagueVendorClientFamilyFriends'), 
    '1', true)

not_run: WebUI.setText(findTestObject('Object Repository/connect with user/Page_Search/input_(mandatory)_company_name'), 
    'bcjsbokfj')

not_run: WebUI.click(findTestObject('Object Repository/connect with user/Page_Search/button_Next'))

WebUI.waitForElementClickable(findTestObject('Rate/Page_View Profile/span_Desire to work with again_star3'), 3)

sleep(5000)

//((JavascriptExecutor)ChromeDriver()).executeScript(“document.getElementById(‘star3’).click())
WebUI.click(findTestObject('Object Repository/Rate/Page_View Profile/span_Desire to work with again_star3'))

WebUI.click(findTestObject('Object Repository/Rate/Page_View Profile/span_Encourages work life balance_star3'))

WebUI.click(findTestObject('Object Repository/Rate/Page_View Profile/span_Dependability_star3'))

WebUI.click(findTestObject('Object Repository/Rate/Page_View Profile/span_Solution Seeker_star3'))

WebUI.click(findTestObject('Object Repository/Rate/Page_View Profile/span_Willingness to Learn_star3'))

WebUI.click(findTestObject('Object Repository/Rate/Page_View Profile/span_Enthusiasm_star3'))

WebUI.click(findTestObject('Object Repository/Rate/Page_View Profile/span_Clarity in Communication_star3'))

WebUI.click(findTestObject('Object Repository/Rate/Page_View Profile/span_Mutual Respect_star3'))

WebUI.click(findTestObject('Object Repository/Rate/Page_View Profile/button_Next'))

WebUI.waitForElementClickable(findTestObject('Rate/Page_View Profile/textarea_test recomendation test on qa enviornment for vijay test account'), 
    3)

WebUI.setText(findTestObject('Object Repository/Rate/Page_View Profile/textarea_test recomendation test on qa enviornment for vijay test account'), 
    'test recomendation test on qa enviornment for vijay test account tst test test test for recommendation test scenario vijay test')

WebUI.click(findTestObject('Object Repository/Rate/Page_View Profile/button_Submit'))

WebUI.waitForElementClickable(findTestObject('Rate/Page_View Profile/a_OK'), 3)

WebUI.click(findTestObject('Object Repository/Rate/Page_View Profile/a_OK'))

WebUI.closeBrowser()


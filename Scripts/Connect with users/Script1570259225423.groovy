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

WebUI.setText(findTestObject('Object Repository/connect with user/Page_theworklife - Find Great People To Work With/input_Forgot password_username'), 
    'worklifetest10001@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/connect with user/Page_theworklife - Find Great People To Work With/input_Forgot password_password'), 
    'XU9cBalmEBp1UP+jEU2w4UUBUuNgBY4U')

WebUI.click(findTestObject('Object Repository/connect with user/Page_theworklife - Find Great People To Work With/button_Sign in'))

WebUI.click(findTestObject('Object Repository/connect with user/Page_Home/a_connections'))

WebUI.click(findTestObject('Object Repository/connect with user/Page_Connections/div_Sort By_search'))

WebUI.sendKeys(findTestObject('Object Repository/connect with user/Page_Connections/input_Sort By_form-control ng-valid ng-not-empty ng-dirty ng-valid-parse ng-touched'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/connect with user/Page_Connections/input_Sort By_form-control ng-valid ng-not-empty ng-dirty ng-valid-parse ng-touched'), 
    'vijay')

WebUI.click(findTestObject('Object Repository/connect with user/Page_Connections/div_Sort By_search'))

WebUI.setText(findTestObject('Object Repository/connect with user/Page_Connections/input_View all_searchText'), 'vijay')

WebUI.click(findTestObject('Object Repository/connect with user/Page_Search/button_Connect'))

WebUI.selectOptionByValue(findTestObject('Object Repository/connect with user/Page_Search/select_Select relationshipManagerReporteeColleagueVendorClientFamilyFriends'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/connect with user/Page_Search/input_(mandatory)_company_name'), 'bcjsbokfj')

WebUI.click(findTestObject('Object Repository/connect with user/Page_Search/button_Next'))

WebUI.click(findTestObject('Object Repository/connect with user/Page_Search/div_Connection request sent'))

WebUI.closeBrowser()


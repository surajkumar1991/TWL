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

WebUI.setText(findTestObject('Object Repository/flag review/Page_theworklife - Find Great People To Work With/input_Forgot password_username'), 
    '')

WebUI.setText(findTestObject('Object Repository/flag review/Page_theworklife - Find Great People To Work With/input_Please enter username or email_username'), 
    'vijayvstest01@gmail.com')

WebUI.setText(findTestObject('Object Repository/flag review/Page_theworklife - Find Great People To Work With/input_Forgot password_username'), 
    'vijayvstest01@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/flag review/Page_theworklife - Find Great People To Work With/input_Forgot password_password'), 
    'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Object Repository/flag review/Page_Home/a_Suraj1569758600295makhija'))

WebUI.click(findTestObject('Object Repository/flag review/Page_View Profile/span_Report'))

WebUI.click(findTestObject('Object Repository/flag review/Page_View Profile/label_Accusatory'))

WebUI.setText(findTestObject('Object Repository/flag review/Page_View Profile/textarea_Detail your complaint_txtDetailReport'), 
    'i dont like it , i am testing flag reviews')

WebUI.click(findTestObject('Object Repository/flag review/Page_View Profile/button_Submit'))

WebUI.click(findTestObject('Object Repository/flag review/Page_View Profile/a_OK'))

WebUI.closeBrowser()


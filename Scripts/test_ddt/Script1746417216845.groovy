import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://3.17.237.109:8180/pc/PolicyCenter.do')

WebUI.setText(findTestObject('Object Repository/PC/Login Page/Page_DEV mode - 50.5.0.1714 Guidewire PolicyCenter/input_Username_Login-LoginScreen-LoginDV-us_8d37f0'), 
    'aapplegate')

WebUI.setEncryptedText(findTestObject('Object Repository/PC/Login Page/Page_DEV mode - 50.5.0.1714 Guidewire PolicyCenter/input_Password_Login-LoginScreen-LoginDV-pa_845953'), 
    'Kkxx2RTdi68=')

WebUI.click(findTestObject('Object Repository/PC/Login Page/Page_DEV mode - 50.5.0.1714 Guidewire PolicyCenter/div_LILog In'))

WebUI.click(findTestObject('Object Repository/PC/Summary Screen/Page_DEV mode - 50.5.0.1714 Guidewire Polic_7aa939/div_c_gw-icon gw-icon--expand'))

WebUI.click(findTestObject('Object Repository/PC/Summary Screen/Page_DEV mode - 50.5.0.1714 Guidewire Polic_7aa939/div_New Account'))

WebUI.setText(findTestObject('PC/New Account - Search Account - Person/Page_DEV mode - 50.5.0.1714 Guidewire Polic_686088/input_First name_NewAccount-NewAccountScree_398924'), 
    FName)

WebUI.setText(findTestObject('Object Repository/PC/New Account - Search Account - Person/Page_DEV mode - 50.5.0.1714 Guidewire Polic_686088/input_Last name_NewAccount-NewAccountScreen_48f3a6'), 
    LName)

WebUI.click(findTestObject('Object Repository/PC/New Account - Search Account - Person/Page_DEV mode - 50.5.0.1714 Guidewire Polic_686088/div_Search'))


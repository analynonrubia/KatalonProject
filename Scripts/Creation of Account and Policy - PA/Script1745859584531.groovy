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

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Page_DEV mode - 50.5.0.1714 Guidewire PolicyCenter/input_Username_Login-LoginScreen-LoginDV-us_8d37f0'), 
    'su')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_DEV mode - 50.5.0.1714 Guidewire PolicyCenter/input_Password_Login-LoginScreen-LoginDV-pa_845953'), 
    'Kkxx2RTdi68=')

WebUI.click(findTestObject('Object Repository/Page_DEV mode - 50.5.0.1714 Guidewire PolicyCenter/div_LILog In'))

WebUI.click(findTestObject('Object Repository/Page_DEV mode - 50.5.0.1714 Guidewire Polic_b92ab7/div_Actions'))

WebUI.click(findTestObject('Object Repository/Page_DEV mode - 50.5.0.1714 Guidewire Polic_b92ab7/div_New Account'))

WebUI.setText(findTestObject('Object Repository/Page_DEV mode - 50.5.0.1714 Guidewire Polic_7e1d93/input_First name_NewAccount-NewAccountScree_398924'), 
    'PA Testing')

def uniqueNumber = System.currentTimeMillis()

def lastName = 'Katalon v' + uniqueNumber

WebUI.setText(findTestObject('Object Repository/Page_DEV mode - 50.5.0.1714 Guidewire Polic_7e1d93/input_Last name_NewAccount-NewAccountScreen_48f3a6'), 
    lastName)

WebUI.click(findTestObject('Object Repository/Page_DEV mode - 50.5.0.1714 Guidewire Polic_7e1d93/div_Search'))

WebUI.click(findTestObject('Object Repository/Page_DEV mode - 50.5.0.1714 Guidewire Polic_7e1d93/div_Create New Account'))

WebUI.click(findTestObject('Object Repository/Page_DEV mode - 50.5.0.1714 Guidewire Polic_7e1d93/div_PePerson'))

WebUI.setText(findTestObject('Object Repository/Page_DEV mode - 50.5.0.1714 Guidewire Polic_065dcf/input_Address 1_CreateAccount-CreateAccount_c238dc'), 
    '123 Main Street')

WebUI.setText(findTestObject('Object Repository/Page_DEV mode - 50.5.0.1714 Guidewire Polic_065dcf/input_City_CreateAccount-CreateAccountScree_322a6f'), 
    'San Diego')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_DEV mode - 50.5.0.1714 Guidewire Polic_065dcf/select_noneBillingBusinessHomeOther'), 
    'home', true)

WebUI.click(findTestObject('Object Repository/Page_DEV mode - 50.5.0.1714 Guidewire Polic_065dcf/div_Please confirm account informationFirst_46e40d'))

WebUI.click(findTestObject('Object Repository/Page_DEV mode - 50.5.0.1714 Guidewire Polic_065dcf/span_Organization_gw-icon'))

WebUI.setText(findTestObject('Object Repository/Page_DEV mode - 50.5.0.1714 Guidewire Polic_ca9128/input_Organization Name_OrganizationSearchP_4444db'), 
    'Armstrong and Company')

WebUI.click(findTestObject('Object Repository/Page_DEV mode - 50.5.0.1714 Guidewire Polic_ca9128/div_Search'))

WebUI.click(findTestObject('Object Repository/Page_DEV mode - 50.5.0.1714 Guidewire Polic_ca9128/div_Select'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_DEV mode - 50.5.0.1714 Guidewire Polic_065dcf/select_none100-002541 Armstrong (Premier)50_ff92c4'), 
    'ProducerCode:9', true)

WebUI.click(findTestObject('Object Repository/Page_DEV mode - 50.5.0.1714 Guidewire Polic_065dcf/div_Update'))

WebUI.click(findTestObject('Object Repository/Page_DEV mode - 50.5.0.1714 Guidewire Polic_324057/div_Actions'))

WebUI.click(findTestObject('Object Repository/Page_DEV mode - 50.5.0.1714 Guidewire Polic_324057/div_New Submission'))

WebUI.click(findTestObject('Page_DEV mode - 50.5.0.1714 Guidewire Polic_20a9d4/div_Select_PA'))

WebUI.click(findTestObject('Object Repository/Page_DEV mode - 50.5.0.1714 Guidewire Polic_fe3959/div_Next'))

WebUI.click(findTestObject('Object Repository/Page_DEV mode - 50.5.0.1714 Guidewire Polic_1cc03f/div_Next'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_DEV mode - 50.5.0.1714 Guidewire Polic_88bb0c/select_Annual6 monthsOther'), 
    'Annual', true)

WebUI.click(findTestObject('Object Repository/Page_DEV mode - 50.5.0.1714 Guidewire Polic_88bb0c/div_Next'))

WebUI.click(findTestObject('Object Repository/Page_DEV mode - 50.5.0.1714 Guidewire Polic_e20efe/div_AdAdd'))

WebUI.mouseOver(findTestObject('Page_DEV mode - 50.5.0.1714 Guidewire Polic_e20efe/div_Existing Driver'))

WebUI.click(findTestObject('Object Repository/Page_DEV mode - 50.5.0.1714 Guidewire Polic_e20efe/div_Acct Creation Testing Katalon'))

WebUI.setText(findTestObject('Object Repository/Page_DEV mode - 50.5.0.1714 Guidewire Polic_e20efe/input_Date of Birth_SubmissionWizard-LOBWiz_81b200'), 
    '01/01/1990')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_DEV mode - 50.5.0.1714 Guidewire Polic_e20efe/select_noneDivorcedDomestic partnerMarriedS_976f28'), 
    'S', true)

WebUI.setText(findTestObject('Object Repository/Page_DEV mode - 50.5.0.1714 Guidewire Polic_e20efe/input_License_SubmissionWizard-LOBWizardSte_d23a2c'), 
    'DXL-123')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_DEV mode - 50.5.0.1714 Guidewire Polic_e20efe/select_noneAlabamaAlaskaArizonaArkansasCali_3a4ed4'), 
    'CA', true)

WebUI.click(findTestObject('Object Repository/Page_DEV mode - 50.5.0.1714 Guidewire Polic_e20efe/div_Roles'))

WebUI.setText(findTestObject('Object Repository/Page_DEV mode - 50.5.0.1714 Guidewire Polic_e20efe/input_Year First Licensed_SubmissionWizard-_aa4e8a'), 
    '2010')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_DEV mode - 50.5.0.1714 Guidewire Polic_e20efe/select_none012345 or more'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_DEV mode - 50.5.0.1714 Guidewire Polic_e20efe/select_none012345 or more_1'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_DEV mode - 50.5.0.1714 Guidewire Polic_e20efe/select_none012345 or more_1_2'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_DEV mode - 50.5.0.1714 Guidewire Polic_e20efe/select_none012345 or more_1_2_3'), 
    '0', true)

WebUI.click(findTestObject('Object Repository/Page_DEV mode - 50.5.0.1714 Guidewire Polic_e20efe/div_Driver DetailsAdAddNPNew PersonFAFrom A_197a56'))

WebUI.click(findTestObject('Object Repository/Page_DEV mode - 50.5.0.1714 Guidewire Polic_e20efe/input_Go to Contact_SubmissionWizard-LOBWiz_72664a'))

WebUI.click(findTestObject('Object Repository/Page_DEV mode - 50.5.0.1714 Guidewire Polic_e20efe/div_Retrieve MVR'))

WebUI.click(findTestObject('Object Repository/Page_DEV mode - 50.5.0.1714 Guidewire Polic_e20efe/div_Next'))

WebUI.click(findTestObject('Object Repository/Page_DEV mode - 50.5.0.1714 Guidewire Polic_8ae313/div_Create Vehicle'))

WebUI.setText(findTestObject('Page_DEV mode - 50.5.0.1714 Guidewire Polic_8ae313/input__SubmissionWizard-LOBWizardStepGroup-_e06a00'), 
    '2000')

WebUI.setText(findTestObject('Object Repository/Page_DEV mode - 50.5.0.1714 Guidewire Polic_8ae313/input_Vehicle Identification Number_Submiss_28f117'), 
    'KNDPBCAC2E7676919')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_DEV mode - 50.5.0.1714 Guidewire Polic_8ae313/select_noneAlabamaAlaskaArizonaArkansasCali_3a4ed4'), 
    'CA', true)

WebUI.click(findTestObject('Object Repository/Page_DEV mode - 50.5.0.1714 Guidewire Polic_8ae313/div_AdAdd'))

WebUI.click(findTestObject('Object Repository/Page_DEV mode - 50.5.0.1714 Guidewire Polic_8ae313/div_Acct Creation Testing Katalon'))

WebUI.click(findTestObject('Object Repository/Page_DEV mode - 50.5.0.1714 Guidewire Polic_8ae313/div_Next'))

WebUI.click(findTestObject('Object Repository/Page_DEV mode - 50.5.0.1714 Guidewire Polic_0cb407/div_Next'))

WebUI.click(findTestObject('Object Repository/Page_DEV mode - 50.5.0.1714 Guidewire Polic_057dc0/div_Next'))

WebUI.click(findTestObject('Object Repository/Page_DEV mode - 50.5.0.1714 Guidewire Polic_a1bc06/div_Quote'))

WebUI.click(findTestObject('Object Repository/Page_DEV mode - 50.5.0.1714 Guidewire Polic_e83e4e/div_Bind Options'))

WebUI.click(findTestObject('Object Repository/Page_DEV mode - 50.5.0.1714 Guidewire Polic_e83e4e/div_Issue Policy'))

WebUI.acceptAlert()

WebUI.verifyTextPresent('Submission Bound', true)


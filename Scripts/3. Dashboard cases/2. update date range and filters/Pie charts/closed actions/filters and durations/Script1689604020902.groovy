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

WebUI.navigateToUrl('https://adc-admin.techwards.org/')

WebUI.setText(findTestObject('Object Repository/ADC Co/update date range and filters/pie charts/closed actions/Page_Admin Panel/input_Employee ID_empId'), 
    'emp010')

WebUI.click(findTestObject('Object Repository/ADC Co/update date range and filters/pie charts/closed actions/Page_Admin Panel/button_Next'))

WebUI.setEncryptedText(findTestObject('Object Repository/ADC Co/update date range and filters/pie charts/closed actions/Page_Admin Panel/input_Password_newPassword'), 
    'Dpxl7+fjsHaPnN5Bh9tNqA==')

WebUI.click(findTestObject('Object Repository/ADC Co/update date range and filters/pie charts/closed actions/Page_Admin Panel/button_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/ADC Co/update date range and filters/pie charts/closed actions/Page_Admin Panel/span_Showing data for closed actions on tim_012021'), 
    'Showing data for closed actions on time and after due date')

WebUI.click(findTestObject('Object Repository/ADC Co/update date range and filters/pie charts/closed actions/Page_Admin Panel/button_Last 7 days'))

WebUI.click(findTestObject('Object Repository/ADC Co/update date range and filters/pie charts/closed actions/Page_Admin Panel/li_1 year'))

WebUI.click(findTestObject('Object Repository/ADC Co/update date range and filters/pie charts/closed actions/Page_Admin Panel/div_Last 7 days_MuiBackdrop-root MuiBackdro_f20361'))

WebUI.click(findTestObject('Object Repository/ADC Co/update date range and filters/pie charts/closed actions/Page_Admin Panel/text_Closed On Time'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/ADC Co/update date range and filters/pie charts/closed actions/Page_Admin Panel/text_Closed On Time'))

WebUI.click(findTestObject('Object Repository/ADC Co/update date range and filters/pie charts/closed actions/Page_Admin Panel/text_Closed After Due Date'))

WebUI.click(findTestObject('Object Repository/ADC Co/update date range and filters/pie charts/closed actions/Page_Admin Panel/button_1 year'))

WebUI.click(findTestObject('Object Repository/ADC Co/update date range and filters/pie charts/closed actions/Page_Admin Panel/li_6 months'))

WebUI.click(findTestObject('Object Repository/ADC Co/update date range and filters/pie charts/closed actions/Page_Admin Panel/li_3 months'))

WebUI.click(findTestObject('Object Repository/ADC Co/update date range and filters/pie charts/closed actions/Page_Admin Panel/li_Last month'))

WebUI.click(findTestObject('Object Repository/ADC Co/update date range and filters/pie charts/closed actions/Page_Admin Panel/div_Last 7 days_MuiBackdrop-root MuiBackdro_f20361'))

WebUI.closeBrowser()


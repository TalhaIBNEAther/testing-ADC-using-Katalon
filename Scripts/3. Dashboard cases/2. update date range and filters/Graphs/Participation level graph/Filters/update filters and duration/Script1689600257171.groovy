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

WebUI.setText(findTestObject('Object Repository/ADC Co/update date range and filters/graphs/participation level graph/Page_Admin Panel/input_Employee ID_empId'), 
    'emp010')

WebUI.sendKeys(findTestObject('Object Repository/ADC Co/update date range and filters/graphs/participation level graph/Page_Admin Panel/input_Employee ID_empId'), 
    Keys.chord(Keys.ENTER))

WebUI.setEncryptedText(findTestObject('Object Repository/ADC Co/update date range and filters/graphs/participation level graph/Page_Admin Panel/input_Password_newPassword'), 
    'Dpxl7+fjsHaPnN5Bh9tNqA==')

WebUI.sendKeys(findTestObject('Object Repository/ADC Co/update date range and filters/graphs/participation level graph/Page_Admin Panel/input_Password_newPassword'), 
    Keys.chord(Keys.ENTER))

WebUI.verifyElementText(findTestObject('Object Repository/ADC Co/update date range and filters/graphs/participation level graph/Page_Admin Panel/p_Participation Level'), 
    'Participation Level')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/ADC Co/update date range and filters/graphs/participation level graph/Page_Admin Panel/p_Filters'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/ADC Co/update date range and filters/graphs/participation level graph/Page_Admin Panel/p_Hazard'))

WebUI.click(findTestObject('Object Repository/ADC Co/update date range and filters/graphs/participation level graph/Page_Admin Panel/input_Apply_Chemical'))

WebUI.click(findTestObject('Object Repository/ADC Co/update date range and filters/graphs/participation level graph/Page_Admin Panel/button_Apply'))

WebUI.click(findTestObject('Object Repository/ADC Co/update date range and filters/graphs/participation level graph/Page_Admin Panel/button_Last 7 days'))

WebUI.verifyElementText(findTestObject('Object Repository/ADC Co/update date range and filters/graphs/participation level graph/Page_Admin Panel/li_1 year'), 
    '1 year')

WebUI.click(findTestObject('Object Repository/ADC Co/update date range and filters/graphs/participation level graph/Page_Admin Panel/li_1 year'))

WebUI.verifyElementPresent(findTestObject('Object Repository/ADC Co/update date range and filters/graphs/participation level graph/Page_Admin Panel/svg_Chemical_MuiSvgIcon-root MuiSvgIcon-fon_06c928'), 
    0)

WebUI.click(findTestObject('Object Repository/ADC Co/update date range and filters/graphs/participation level graph/Page_Admin Panel/svg_Chemical_MuiSvgIcon-root MuiSvgIcon-fon_06c928'))

WebUI.closeBrowser()


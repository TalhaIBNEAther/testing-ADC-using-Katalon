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

WebUI.callTestCase(findTestCase('1. Login cases/correct ID and Password/enter correct ID and password'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/ADC Co/Locations dropdown on landing page/location is searchable/Page_Admin Panel/h5_Dashboard'), 
    'Dashboard')

WebUI.setText(findTestObject('Object Repository/ADC Co/Locations dropdown on landing page/location is searchable/Page_Admin Panel/input_Dashboard_rt'), 
    'dha')

WebUI.takeScreenshotAsCheckpoint('location set to DHA')

WebUI.sendKeys(findTestObject('Object Repository/ADC Co/Locations dropdown on landing page/location is searchable/Page_Admin Panel/input_Dashboard_rt'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/ADC Co/Locations dropdown on landing page/location is searchable/Page_Admin Panel/input_Dashboard_rt'), 
    '')

WebUI.click(findTestObject('Object Repository/ADC Co/Locations dropdown on landing page/location is searchable/Page_Admin Panel/div_'))

WebUI.setText(findTestObject('Object Repository/ADC Co/Locations dropdown on landing page/location is searchable/Page_Admin Panel/input_Dashboard_rt'), 
    'navi mumbai maharashtra')

WebUI.takeScreenshotAsCheckpoint('Location set to MUMBAI')

WebUI.sendKeys(findTestObject('Object Repository/ADC Co/Locations dropdown on landing page/location is searchable/Page_Admin Panel/input_Dashboard_rt'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/ADC Co/Locations dropdown on landing page/location is searchable/Page_Admin Panel/div_'))

WebUI.click(findTestObject('Object Repository/ADC Co/Locations dropdown on landing page/location is searchable/Page_Admin Panel/input_Dashboard_rt'))

WebUI.click(findTestObject('Object Repository/ADC Co/Locations dropdown on landing page/location is searchable/Page_Admin Panel/svg_Dashboard_MuiSvgIcon-root MuiSvgIcon-fo_2ae6f6'))

WebUI.setText(findTestObject('Object Repository/ADC Co/Locations dropdown on landing page/location is searchable/Page_Admin Panel/input_Dashboard_rt'), 
    'clifton')

WebUI.takeScreenshotAsCheckpoint('Location set to CLIFTON')

WebUI.sendKeys(findTestObject('Object Repository/ADC Co/Locations dropdown on landing page/location is searchable/Page_Admin Panel/input_Dashboard_rt'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/ADC Co/Locations dropdown on landing page/location is searchable/Page_Admin Panel/svg_Dashboard_MuiSvgIcon-root MuiSvgIcon-fo_2ae6f6_1'))

WebUI.closeBrowser()


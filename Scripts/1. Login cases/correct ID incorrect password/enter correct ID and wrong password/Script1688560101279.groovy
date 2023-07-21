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

WebUI.setText(findTestObject('Object Repository/ADC Co/Login Cases/correct id wrong password/Page_Admin Panel/input_Employee ID_empId'), 
    'emp010')

WebUI.click(findTestObject('Object Repository/ADC Co/Login Cases/correct id wrong password/Page_Admin Panel/button_Next'))

WebUI.setEncryptedText(findTestObject('Object Repository/ADC Co/Login Cases/correct id wrong password/Page_Admin Panel/input_Password_newPassword'), 
    'jcG2l86+9SCn3pxFrmeN2GMIxmt+A1Y4jRVTDCU+7+U=')

WebUI.click(findTestObject('Object Repository/ADC Co/Login Cases/correct id wrong password/Page_Admin Panel/button_Submit'))

WebUI.rightClick(findTestObject('Object Repository/ADC Co/Login Cases/correct id wrong password/Page_Admin Panel/div_The employee ID andor password is invalid'))

WebUI.verifyElementText(findTestObject('Object Repository/ADC Co/Login Cases/correct id wrong password/Page_Admin Panel/div_The employee ID andor password is invalid'), 
    'The employee ID and/or password is invalid')

WebUI.takeScreenshotAsCheckpoint('wrong id or password')

WebUI.closeBrowser()


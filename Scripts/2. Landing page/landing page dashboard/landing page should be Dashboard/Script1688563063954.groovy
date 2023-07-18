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

not_run: WebUI.openBrowser('')

not_run: WebUI.navigateToUrl('https://adc-admin.techwards.org/')

not_run: WebUI.setText(findTestObject('Object Repository/ADC Co/Landing page/landing page Dashboard/input_Employee ID_empId'), 
    'emp010')

not_run: WebUI.click(findTestObject('Object Repository/ADC Co/Landing page/landing page Dashboard/button_Next'))

not_run: WebUI.setEncryptedText(findTestObject('Object Repository/ADC Co/Landing page/landing page Dashboard/input_Password_newPassword'), 
    'Dpxl7+fjsHaPnN5Bh9tNqA==')

not_run: WebUI.click(findTestObject('Object Repository/ADC Co/Landing page/landing page Dashboard/button_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/ADC Co/Landing page/landing page Dashboard/h5_Dashboard'), 'Dashboard')

not_run: WebUI.closeBrowser()


import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class LoginADCKeyword {

	@Keyword
	def login() {
		WebUI.openBrowser('')
		
		WebUI.navigateToUrl('https://adc-admin.techwards.org/')

		WebUI.setText(findTestObject('Object Repository/ADC Co/Login Cases/correct id and password/input_Employee ID_empId'), 'emp010')

		WebUI.click(findTestObject('Object Repository/ADC Co/Login Cases/correct id and password/button_Next'))

		WebUI.setEncryptedText(findTestObject('Object Repository/ADC Co/Login Cases/correct id and password/input_Password_newPassword'),
				'Dpxl7+fjsHaPnN5Bh9tNqA==')

		WebUI.click(findTestObject('Object Repository/ADC Co/Login Cases/correct id and password/button_Submit'))

		WebUI.verifyElementPresent(findTestObject('Object Repository/ADC Co/Login Cases/correct id and password/img'), 0)
	}
}

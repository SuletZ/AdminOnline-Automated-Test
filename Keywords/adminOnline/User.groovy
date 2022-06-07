package adminOnline

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

public class User {

	/**
	 * Login
	 * @param username to login to AdminOnline
	 * @param password to login to AdminOnline
	 */
	@Keyword
	def login(String username, String password) {
		WebUI.openBrowser(GlobalVariable.URL)
		WebUI.verifyMatch(WebUI.getWindowTitle(), 'Test System AdminOnline', false)
		WebUI.sendKeys(findTestObject('Login Home Page/Input_Username'), username)
		WebUI.sendKeys(findTestObject('Login Home Page/Input_Password'), password)
		WebUI.click(findTestObject('Login Home Page/Button_Submit'))
	}
}

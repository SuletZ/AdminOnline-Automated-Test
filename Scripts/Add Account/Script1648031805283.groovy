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

WebUI.click(findTestObject('Page_Main Dashboard/Menu/button_New Account'))

WebUI.click(findTestObject('Add Account Page/input_Account Surname'))

WebUI.sendKeys(findTestObject('Add Account Page/input_Account Surname'), GlobalVariable.TestUserSurname)

WebUI.click(findTestObject('Add Account Page/Button_Add Person'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Add Account Page/input_Responsible_Name'), GlobalVariable.TestUserName)

WebUI.sendKeys(findTestObject('Add Account Page/input_Responsible_Surname'), GlobalVariable.TestUserSurname)

WebUI.sendKeys(findTestObject('Add Account Page/input_ID Number_id_number'), '7612140114088')

WebUI.sendKeys(findTestObject('Add Account Page/input_Responsible_Email'), '1Test@iits.co.za')

WebUI.sendKeys(findTestObject('Add Account Page/input_Cell Number'), '0833268624')

WebUI.click(findTestObject('Add Account Page/dropdown_Send Statement'))

WebUI.click(findTestObject('Add Account Page/dropdown option_Send By Email'))

WebUI.click(findTestObject('Add Account Page/Check_Communicator'))

WebUI.delay(3)


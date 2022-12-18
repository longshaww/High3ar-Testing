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

WebUI.navigateToUrl('https://high3ar.club/account/register')

WebUI.setText(findTestObject('Object Repository/RegisterComponents/input_To ti khon_name'), 'Trần Thanh Long')

WebUI.setText(findTestObject('Object Repository/RegisterComponents/input_To ti khon_address'), '219/2f âu dương lân p2 q8')

WebUI.setText(findTestObject('Object Repository/RegisterComponents/input_To ti khon_phoneNumber'), '0938131201')

WebUI.setText(findTestObject('Object Repository/RegisterComponents/input_N_dateOfBirth'), '12/13/2001')

WebUI.setText(findTestObject('Object Repository/RegisterComponents/input_N_email'), 'at400123@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/RegisterComponents/input_N_password'), 'qeJ0sjJnwEs=')

WebUI.click(findTestObject('Object Repository/RegisterComponents/buttonDki'))

WebUI.verifyElementText(findTestObject('Utils/thongBao'), 'Tăng Độ Bảo Mật Cho Tài Khoản, ( > 6 kí tự)')

WebUI.closeBrowser()


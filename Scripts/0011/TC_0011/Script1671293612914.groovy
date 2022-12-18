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

WebUI.navigateToUrl('https://high3ar.club/')

WebUI.click(findTestObject('Object Repository/LogoutComponents/i_M gim gi_bx bx-user'))

WebUI.setText(findTestObject('Object Repository/LogoutComponents/input_Nhp email v mt khu ca bn_exampleDropd_db6b01'), 'test.long@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/LogoutComponents/input_Nhp email v mt khu ca bn_exampleDropd_684f84'), 
    'tzH6RvlfSTg=')

WebUI.sendKeys(findTestObject('Object Repository/LogoutComponents/input_Nhp email v mt khu ca bn_exampleDropd_684f84'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/LogoutComponents/div_t'))

WebUI.click(findTestObject('Object Repository/LogoutComponents/span_ng xut'))

WebUI.verifyElementText(findTestObject('Utils/thongBao'), 'Đăng xuất thành công')

WebUI.closeBrowser()


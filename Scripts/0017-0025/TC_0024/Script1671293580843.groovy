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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://high3ar.club/account/resetPassword')

WebUI.setText(findTestObject('ForgotPasswordComponents/input_Qun Mt Khu_email'), 'at400123@gmail.com')

WebUI.click(findTestObject('ForgotPasswordComponents/buttonQuenMatKhau'))

WebUI.navigateToUrl('https://high3ar.club/account/verifyOTPForgetPassword?email=at400123%40gmail.com')

WebUI.setText(findTestObject('ForgotPasswordComponents/input_Nhp M OTP_otp'), '1234')

WebUI.click(findTestObject('ForgotPasswordComponents/buttonXacThucOTP'))

WebUI.verifyElementText(findTestObject('Utils/thongBao'), 'Xác thực thành công')

WebUI.navigateToUrl('https://high3ar.club/account/resetNewPassword?email=at400123%40gmail.com&code=7261925973c9bf0a74d85ae968a57e5f')

WebUI.verifyElementText(findTestObject('ForgotPasswordComponents/DatLaiMatKhauText'), 'Đặt Lại Mật Khẩu')

WebUI.setText(findTestObject('ForgotPasswordComponents/input_t Li Mt Khu_newPassword'), 'Jimmyvip01')

WebUI.setText(findTestObject('ForgotPasswordComponents/input_t Li Mt Khu_verifyPassword'), 'Jimmyvip01')

WebUI.verifyElementText(findTestObject('Utils/thongBao'), 'Đổi mật khẩu thành công')

WebUI.closeBrowser()


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

WebUI.navigateToUrl('https://high3ar.club/')

WebUI.click(findTestObject('Object Repository/HomeComponents/popOverLogin'))

WebUI.setText(findTestObject('Object Repository/HomeComponents/inputEmail'), 'test.long@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/HomeComponents/inputMatKhau'), 'tzH6RvlfSTg=', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HomeComponents/buttonDangNhap'))

WebUI.verifyElementText(findTestObject('Utils/thongBao'), 'Đăng nhập thành công')

WebUI.click(findTestObject('ChangeAccountInfoComponents/accountPopUp'))

WebUI.click(findTestObject('UserManagementComponents/quanLyLink'))

WebUI.click(findTestObject('ChangeAccountInfoComponents/accountPopUp'))

WebUI.click(findTestObject('VoucherManagementComponents/li_Voucher'))

WebUI.click(findTestObject('VoucherManagementComponents/a_Create'))

WebUI.setText(findTestObject('VoucherManagementComponents/discountInput'), '10')

WebUI.setText(findTestObject('VoucherManagementComponents/input_Ngy bt u_mui-3'), '18/12/2022')

WebUI.setText(findTestObject('VoucherManagementComponents/input_Ngy kt thc_mui-4'), '01/01/2023')

WebUI.setText(findTestObject('VoucherManagementComponents/input_S tin gim ti a_maxDiscount'), '100')

WebUI.setText(findTestObject('VoucherManagementComponents/input_S tin tha mn iu kin_qualifyAmount'), '500')

WebUI.setText(findTestObject('VoucherManagementComponents/input_S lng_qty'), '5')

WebUI.click(findTestObject('VoucherManagementComponents/button_Create'))

WebUI.verifyElementText(findTestObject('Utils/thongBao'), 'Tạo voucher thành công')

WebUI.closeBrowser()


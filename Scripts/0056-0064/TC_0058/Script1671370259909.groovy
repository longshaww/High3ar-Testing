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

WebUI.navigateToUrl('https://high3ar.club/product/6232fbf301830a245b8d7528')

WebUI.click(findTestObject('CartComponents/sizeMRadio'))

WebUI.click(findTestObject('CartComponents/buttonThemVaoGioHang'))

WebUI.verifyElementText(findTestObject('Utils/thongBao'), 'Thêm vào giỏ hàng thành công')

WebUI.navigateToUrl('https://high3ar.club/checkout')

WebUI.setText(findTestObject('CheckoutComponents/input_ng nhp_nameCustomer'), 'Ngoc Phu Pham')

WebUI.setText(findTestObject('CheckoutComponents/input_ng nhp_email'), 'ngocphupham682001@gmail')

WebUI.setText(findTestObject('CheckoutComponents/input_ng nhp_phoneNumber'), '0786053698')

WebUI.setText(findTestObject('CheckoutComponents/input_ng nhp_address'), '23/2 Nguyen Thi Minh Khai')

WebUI.selectOptionByLabel(findTestObject('CheckoutComponents/selectTinhThanhPho'), 'Thành phố Hồ Chí Minh', false)

WebUI.selectOptionByLabel(findTestObject('CheckoutComponents/selectQuanHuyen'), 'Quận 8', false)

WebUI.selectOptionByLabel(findTestObject('CheckoutComponents/selectPhuongXa'), 'Phường 02', false)

WebUI.click(findTestObject('CheckoutComponents/button_Tip tc n phng thc thanh ton'))

WebUI.verifyElementVisible(findTestObject('CheckoutComponents/phuongThucThanhToanText'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('CheckoutComponents/thanhToanOnlineRadio'))

WebUI.click(findTestObject('CheckoutComponents/buttonHoanTatDatHang'))

WebUI.waitForElementVisible(findTestObject('OnlinePaymentComponents/buttonPayNow'), 0)

WebUI.setText(findTestObject('OnlinePaymentComponents/soTheInput'), '4242424242424242')

WebUI.setText(findTestObject('OnlinePaymentComponents/cvcInput'), '333')

WebUI.setText(findTestObject('OnlinePaymentComponents/ngayHetHanInput'), '')

WebUI.selectOptionByLabel(findTestObject('OnlinePaymentComponents/quocGiaSelect'), 'Việt Nam', false)

WebUI.click(findTestObject('OnlinePaymentComponents/buttonPayNow'))

WebUI.verifyElementPresent(findTestObject('OnlinePaymentComponents/soTheQuyViKhongDayDuThongBao'), 0)


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

WebUI.navigateToUrl('https://demoqa.com/register')

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/inputfirstname (1)'), 'Test')

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/inputlastname (1)'), 'User Pass')

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/inputuserName (1)'), 'userpass123')

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/div_recaptcha-checkbox-border (1)'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/img_rc-image-tile-33'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/img_rc-image-tile-33'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/img_rc-image-tile-33'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/img_rc-image-tile-33'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/button_Verify'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/button_Register (1)'))


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

WebUI.navigateToUrl('https://192.168.1.120/fmi/webd')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Login/btnAdvanced'))

WebUI.click(findTestObject('Login/linkProceedToUnsafe'))

WebUI.setText(findTestObject('Login/loginClaris'), 'admin')

WebUI.setText(findTestObject('Login/loginClarisPwd'), 'admin')

WebUI.click(findTestObject('Login/btnClarisSignIn'))

WebUI.click(findTestObject('Login/btnClickDBMHS'))

WebUI.setText(findTestObject('Login/loginDBMHS'), 'admin')

WebUI.setText(findTestObject('Login/loginDBMHSPwd'), 'admin')

WebUI.click(findTestObject('Login/btnDBMHSSignIn'))

WebUI.click(findTestObject('Object Repository/Navigation All Menu/Nav_Grievance'))

//WebUI.click(findTestObject('null'))
WebUI.click(findTestObject('Object Repository/Grievance/btn_addGrievance'))

WebUI.click(findTestObject('Object Repository/Grievance/btn_searchemployee'))

WebUI.click(findTestObject('Object Repository/Grievance/btn_selectEmployee'))

//WebUI.click(findTestObject('null'))
//WebUI.click(findTestObject('null'))
//WebUI.click(findTestObject('null'))
WebUI.enhancedClick(findTestObject('Object Repository/Grievance/txt_EnterComments'), FailureHandling.STOP_ON_FAILURE)

//WebUI.sendKeys(findTestObject('null'), Keys.ENTER)
//WebUI.sendKeys(findTestObject('null'), Keys.chord(Keys.CONTROL, 'a'))
//WebUI.sendKeys(findTestObject('null'), Keys.chord(Keys.CONTROL, Keys.SHIFT, 's'))
//WebUI.delay(3)

WebUI.doubleClick(findTestObject('Object Repository/Grievance/txt_EnterComments'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Grievance/txt_EnterComments'), 40)

WebUI.setText(findTestObject('Object Repository/Grievance/txt_EnterComments'), 'Test the comments')



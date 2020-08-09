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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

import io.appium.java_client.android.AndroidDriver
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory

// Start Application
Mobile.startApplication(GlobalVariable.G_tocaroAndroid, false)


// Verify if the text is present
Mobile.verifyElementExist(findTestObject('tocaroEnvironment/lblScreenTitle'), 10)


// Navigate from Environment > Splash > Sign in screen
// and verify if the Sign in scree title is present

Mobile.tap(findTestObject('tocaroEnvironment/btnDevelopment'), 10)

Mobile.tap(findTestObject('tocaroSplash/btnSignIn'), 10)

Mobile.verifyElementExist(findTestObject('tocaroSignIn/lblScreenTitle'), 10)


//  Sign in using valid credentials, inputting values via Android driver and sendKeys.

Mobile.tap(findTestObject('tocaroSignIn/txtEmail'),10)
AndroidDriver<?> driverSigninEmail = (AndroidDriver<?>) MobileDriverFactory.getDriver()
driverSigninEmail.getKeyboard().sendKeys("ctc.tocaro+developer@gmail.com")

Mobile.tap(findTestObject('tocaroSignIn/txtPassword'),10)
AndroidDriver<?> driverSigninPassword = (AndroidDriver<?>) MobileDriverFactory.getDriver()
driverSigninPassword.getKeyboard().sendKeys("Tocaro2019!")

Mobile.tap(findTestObject('tocaroSignIn/btnSignIn'), 10)
Mobile.comment("Login successful!")






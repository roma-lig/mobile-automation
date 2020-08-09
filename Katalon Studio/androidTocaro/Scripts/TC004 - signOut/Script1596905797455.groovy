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


// Allotting time for the app to finish loading and render all objects.
// This is to avoid error for missing or unable to detect object.
Mobile.delay(5)


// Navigate to Settings screen and verify if the screen title is present

Mobile.tap(findTestObject('tocaroFooterNavigation/btnSettings'), 5)

Mobile.getText(findTestObject('tocaroUserSettings/btnMyProfile'), 5)


// Open the User settings menu and Sign Out

Mobile.tap(findTestObject('tocaroSignOut/btnMyProfile'), 0)

Mobile.tap(findTestObject('tocaroSignOut/menuSignOut'), 0)


// Verify modal content and buttons

Mobile.getText(findTestObject('tocaroSignOut/modalTitle'), 0)

Mobile.getText(findTestObject('tocaroSignOut/modalSubTitle'), 0)

Mobile.getText(findTestObject('tocaroSignOut/btnCancel'), 0)

Mobile.getText(findTestObject('tocaroSignOut/btnOK'), 0)


// Verify canceling Sign Out 

Mobile.tap(findTestObject('tocaroSignOut/btnCancel'), 0)


// Proceed to Sign out

Mobile.tap(findTestObject('tocaroSignOut/btnMyProfile'), 0)

Mobile.tap(findTestObject('tocaroSignOut/menuSignOut'), 0)

Mobile.tap(findTestObject('tocaroSignOut/btnOK'), 0)


// It will navigate to the splash screen. Verify if the text below is present.

Mobile.getText(findTestObject('tocaroSignOut/splashScreenDescription'), 
    0)


// Sign out successful
Mobile.comment("Sign Out successful!")


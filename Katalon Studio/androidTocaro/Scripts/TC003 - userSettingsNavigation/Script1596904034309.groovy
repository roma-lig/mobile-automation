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


// Navigate to Settings screen and verify if the "My Profile" screen title is present
Mobile.tap(findTestObject('tocaroFooterNavigation/btnSettings'), 5)
Mobile.getText(findTestObject('tocaroUserSettings/btnMyProfile'), 5)


// Open User Settings menu
Mobile.tap(findTestObject('tocaroUserSettings/btnMyProfile'), 5)


// Check modal content and menu text labels
Mobile.getText(findTestObject('tocaroUserSettings/modalTitle'), 5)

Mobile.getText(findTestObject('tocaroUserSettings/modalSubTitle'), 5)

Mobile.getText(findTestObject('tocaroUserSettings/menuProfileSettings'), 5)

Mobile.getText(findTestObject('tocaroUserSettings/menuPushNotificationSettings'), 5)

Mobile.getText(findTestObject('tocaroUserSettings/menuPasswordSettings'), 5)

Mobile.getText(findTestObject('tocaroUserSettings/menuTurnPasscodeOn'), 5)

Mobile.getText(findTestObject('tocaroUserSettings/menuSignOut'), 5)



// Check User Menu navigation

/// Navigate to Profile Settings screen and verify if the screen title is present

Mobile.tap(findTestObject('tocaroUserSettings/menuProfileSettings'), 5)

Mobile.getText(findTestObject('tocaroUserSettings/lblProfileSettingsTitle'), 5)


/// Go back and open again the User Setting menu

Mobile.tap(findTestObject('tocaroUserSettings/btnBack'), 5)

Mobile.tap(findTestObject('tocaroUserSettings/btnMyProfile'), 5)

/// Navigate to Push Notification Settings screen and verify if the screen title is present

Mobile.tap(findTestObject('tocaroUserSettings/menuPushNotificationSettings'), 5)

Mobile.getText(findTestObject('tocaroUserSettings/lblNotificationSettingsTitle'), 5)


/// Go back and open again the User Setting menu

Mobile.tap(findTestObject('tocaroUserSettings/btnBack'), 5)

Mobile.tap(findTestObject('tocaroUserSettings/btnMyProfile'), 5)


/// Navigate to Password Settings screen and verify if the screen title is present

Mobile.tap(findTestObject('tocaroUserSettings/menuPasswordSettings'), 5)

Mobile.getText(findTestObject('tocaroUserSettings/lblPasswordSettingsTitle'), 5)


/// Go back and open again the User Setting menu

Mobile.tap(findTestObject('tocaroUserSettings/btnBack'), 5)

Mobile.tap(findTestObject('tocaroUserSettings/btnMyProfile'), 5)


/// Navigate to Passcode Settings screen and verify if the screen title is present

Mobile.tap(findTestObject('tocaroUserSettings/menuTurnPasscodeOn'), 5)

Mobile.getText(findTestObject('tocaroUserSettings/lblCreatePasscodeTitle'), 5)



// End Navigation
Mobile.comment("Screen navigation successful!")


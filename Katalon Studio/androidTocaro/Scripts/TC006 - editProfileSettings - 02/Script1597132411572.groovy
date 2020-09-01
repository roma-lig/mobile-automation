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
import io.appium.java_client.android.AndroidDriver as AndroidDriver
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.android.nativekey.AndroidKey
import io.appium.java_client.android.nativekey.KeyEvent


// Allotting time for the app to finish loading and render all objects.
// This is to avoid error for missing or unable to detect object.
Mobile.delay(5)

// Navigate to Settings screen and verify if the "My Profile" screen title is present
// Mobile.tap(findTestObject('tocaroFooterNavigation/btnSettings'), 5)

// Verify if "Not set" is displayed in the Settings screen when field is blank.
Mobile.tap(findTestObject('tocaroSettings/btnMyProfile'), 5)

Mobile.tap(findTestObject('tocaroUserSettings/menuProfileSettings'), 5)


Mobile.clearText(findTestObject('tocaroProfileSettings2/etCompany'), 0)

Mobile.clearText(findTestObject('tocaroProfileSettings2/etDepartment'), 0)

Mobile.clearText(findTestObject('tocaroProfileSettings2/etPosition'), 0)


Mobile.tap(findTestObject('Object Repository/tocaroProfileSettings/btnSave'), 10)

Mobile.delay(3)

Mobile.verifyElementAttributeValue(findTestObject('tocaroProfileSettings2/tvCompany'), 'text', 'Not set', 10)
Mobile.verifyElementAttributeValue(findTestObject('tocaroProfileSettings2/tvDepartment'), 'text', 'Not set',10)
Mobile.verifyElementAttributeValue(findTestObject('tocaroProfileSettings2/tvPosition'), 'text', 'Not set', 10)


Mobile.delay(5)
Mobile.comment("Profile edit successful!")

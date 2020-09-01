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
Mobile.tap(findTestObject('tocaroFooterNavigation/btnSettings'), 5)

Mobile.getText(findTestObject('tocaroSettings/btnMyProfile'), 5)

// Open the Profile Settings page and edit the user details

Mobile.tap(findTestObject('tocaroSettings/btnMyProfile'), 5)

Mobile.tap(findTestObject('tocaroUserSettings/menuProfileSettings'), 5)

Mobile.getText(findTestObject('tocaroProfileSettings/lblProfileSettings'), 5)


Mobile.tap(findTestObject('Object Repository/tocaroProfileSettings/txtName'), 10)
Mobile.clearText(findTestObject('Object Repository/tocaroProfileSettings/txtName'), 10)
AndroidDriver<?> driverProfileName = ((MobileDriverFactory.getDriver()) as AndroidDriver<?>)
driverProfileName.getKeyboard().sendKeys('TocaroDeveloper')


Mobile.tap(findTestObject('tocaroProfileSettings/txtTel'), 10)
AndroidDriver<?> driverProfilePhoneNumber = ((MobileDriverFactory.getDriver()) as AndroidDriver<?>)
driverProfilePhoneNumber.getKeyboard().sendKeys('1234567890')


Mobile.tap(findTestObject('tocaroProfileSettings/txtCompany'), 10)
AndroidDriver<?> driverProfileCompany = ((MobileDriverFactory.getDriver()) as AndroidDriver<?>)
driverProfileCompany.getKeyboard().sendKeys('CTC')


Mobile.tap(findTestObject('tocaroProfileSettings/txtDepartment'), 10)
AndroidDriver<?> driverProfileDepartment = ((MobileDriverFactory.getDriver()) as AndroidDriver<?>)
driverProfileDepartment.getKeyboard().sendKeys('Mobile')


Mobile.tap(findTestObject('tocaroProfileSettings/txtPosition'), 10)
AndroidDriver<?> driverProfilePosition = ((MobileDriverFactory.getDriver()) as AndroidDriver<?>)
driverProfilePosition.getKeyboard().sendKeys('Android Developer')


Mobile.tap(findTestObject('Object Repository/tocaroProfileSettings/btnSave'), 10)
Mobile.delay(5)

// Verify if the values from editing the profile are correctly displayed in the Settings page
Mobile.verifyElementAttributeValue(findTestObject('Object Repository/tocaroSettings/lblUserName'),'text','TocaroDeveloper', 10)
Mobile.verifyElementAttributeValue(findTestObject('Object Repository/tocaroSettings/lblPhoneNumber'),'text','1234567890', 10)
Mobile.verifyElementAttributeValue(findTestObject('Object Repository/tocaroSettings/lblEmail'),'text','ctc.tocaro+developer@gmail.com', 10)
Mobile.verifyElementAttributeValue(findTestObject('Object Repository/tocaroSettings/lblCompany'),'text','CTC', 10)
Mobile.verifyElementAttributeValue(findTestObject('Object Repository/tocaroSettings/lblDepartment'),'text','Mobile', 10)
Mobile.verifyElementAttributeValue(findTestObject('Object Repository/tocaroSettings/lblPosition'),'text','Android Developer', 10)

Mobile.delay(5)
Mobile.comment("Profile edit successful!")

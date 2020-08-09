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


// Verify if text exist on default active page after Sign In

Mobile.getText(findTestObject('tocaroFooterNavigation/lblWorkboard'), 5)


// Navigate to People screen and verify if the "People" screen title is present

Mobile.tap(findTestObject('tocaroFooterNavigation/btnPeople'), 5)

Mobile.getText(findTestObject('tocaroFooterNavigation/lblPeople'), 5)



// Navigate to Search screen and verify if the "Global Search" screen title is present 

Mobile.tap(findTestObject('tocaroFooterNavigation/btnSearch'), 5)

Mobile.getText(findTestObject('tocaroFooterNavigation/lblSearch'), 5)



// Navigate to Settings screen and verify if the "My Profile" screen title is present

Mobile.tap(findTestObject('tocaroFooterNavigation/btnSettings'), 5)

Mobile.getText(findTestObject('tocaroFooterNavigation/lblSettings'), 5)



// Navigate to Workboard screen and verify if the "Workboard" screen title is present

Mobile.tap(findTestObject('tocaroFooterNavigation/btnWorkboard'), 5)

Mobile.getText(findTestObject('tocaroFooterNavigation/lblWorkboard'), 5)


// End Navigation
Mobile.comment("Screen navigation successful!")

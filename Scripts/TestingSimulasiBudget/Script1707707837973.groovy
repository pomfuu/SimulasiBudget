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

WebUI.openBrowser('https://bcafinance.co.id/simulasi-budget')
if(navMobil == 'baru') {
	WebUI.click(findTestObject('Object Repository/Page_Simulasi Budget - BCA Finance/NavMobilBaru'))
	WebUI.setText(findTestObject('Page_Simulasi Budget - BCA Finance/HargaKendaraan'),hargaKendaraan)
	WebUI.setText(findTestObject('Object Repository/Page_Simulasi Budget - BCA Finance/UangMuka'), uangMuka)
	WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Simulasi Budget - BCA Finance/JenisAsuransi'),jenisAsuransi, false)
	WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Simulasi Budget - BCA Finance/TipeBudget'), tipeBudget, false)
	WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Simulasi Budget - BCA Finance/ZonaWilayah'), zonaWilayah, false)
	WebUI.click(findTestObject('Object Repository/Page_Simulasi Budget - BCA Finance/HitungSimulasi'))
} else if (navMobil == 'bekas') {
	WebUI.click(findTestObject('Object Repository/Page_Simulasi Budget - BCA Finance/NavMobilBekas'))
	WebUI.setText(findTestObject('Object Repository/Page_Simulasi Budget - BCA Finance/HargaKendaraanMobilBekas'),hargaKendaraanBekas)
	WebUI.setText(findTestObject('Object Repository/Page_Simulasi Budget - BCA Finance/TahunKendaraanBekas'),tahunKendaraanBekas)
	WebUI.setText(findTestObject('Object Repository/Page_Simulasi Budget - BCA Finance/UangMukaBekas'), uangMukaBekas)
	WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Simulasi Budget - BCA Finance/JenisAsuransiBekas'),jenisAsuransiBekas, false)
	WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Simulasi Budget - BCA Finance/PilihTipeBudgetBekas'), tipeBudgetBekas, false)
	WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Simulasi Budget - BCA Finance/ZonaWilayahBekas'), zonaWilayahBekas, false)
	WebUI.click(findTestObject('Object Repository/Page_Simulasi Budget - BCA Finance/ButtonHitungSimulasiBekas'))
}



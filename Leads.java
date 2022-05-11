package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver =new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/main");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.findElement(By.id("username")).sendKeys("demosalesmanager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
String text=driver.findElement(By.tagName("h2")).getText();
System.out.println(text);
driver.findElement(By.linkText("CRM/SFA")).click();
String Title =driver.getTitle();
System.out.println(Title);
driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.linkText("Create Lead")).click();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Teastleaf");
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("saiMaheshcj");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("NLR");
driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("yahoo?");
WebElement dropdown1=driver.findElement(By.id("createLeadForm_dataSourceId"));
Select d1=new Select(dropdown1);
d1.selectByVisibleText("Employee");
WebElement dropdown2=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
Select d2= new Select(dropdown2);
d2.selectByVisibleText("Automobile");
driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("25/05/2000");
driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("500");
driver.findElement(By.id("createLeadForm_currencyUomId")).sendKeys("2000");
WebElement dropdown3=driver.findElement(By.id("createLeadForm_industryEnumId"));
Select d3= new Select(dropdown3);
d3.selectByVisibleText("Computer Software");
WebElement dropdown4=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
Select d4= new Select(dropdown4);
d4.selectByValue("OWN_CCORP");
driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("+91");
driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("123");
driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9059446517");
driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("jai");
driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Mahesh");
driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("saimaheshcj@gmail.com");
driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("karambakkam dharmaraja street ");
driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("3rd street ");
driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("chennai");

WebElement dropdown5=driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
Select d5= new Select(dropdown5);
d5.selectByVisibleText("India");

WebElement dropdown6=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
Select d6=new Select(dropdown6);
d6.selectByValue("IN-TN");
driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600434");
driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("12345");
driver.findElement(By.className("smallSubmit")).click();
String  firstname =driver.findElement(By.id("viewLead_firstName_sp")).getText();
System.out.println(firstname);



	}

}

package OurCompany;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OurCompanyPgObjects {
	WebDriver driver;
	
	WebElement ourcompany = driver.findElement(By.xpath( ".//*[@id='ctl00_ctl12_hlAboutUs']"));
	WebElement ourcompanydrop = driver.findElement(By.xpath( ".//*[@id='navigate']/div[1]/ul/li[1]/i"));

	WebElement aboutqnet = driver.findElement(By.xpath( ".//*[@id='navigate']/div[1]/ul/li[1]/ul/li[1]/a"));
	WebElement directselling = driver.findElement(By.xpath( ".//*[@id='navigate']/div[1]/ul/li[1]/ul/li[2]/a"));
	WebElement ourmission = driver.findElement(By.xpath( ".//*[@id='navigate']/div[1]/ul/li[1]/ul/li[3]/a"));
	WebElement qnethonerroll = driver.findElement(By.xpath( ".//*[@id='navigate']/div[1]/ul/li[1]/ul/li[4]/a"));
	WebElement ourhistory = driver.findElement(By.xpath( ".//*[@id='navigate']/div[1]/ul/li[1]/ul/li[5]/a"));
	WebElement coperatesocial = driver.findElement(By.xpath( ".//*[@id='navigate']/div[1]/ul/li[1]/ul/li[6]/a"));
	WebElement brandingandsports = driver.findElement(By.xpath(
			".//*[@id='navigate']/div[1]/ul/li[1]/ul/li[7]/a"));
	WebElement stayconnected = driver.findElement(By.xpath( ".//*[@id='navigate']/div[1]/ul/li[1]/ul/li[8]/a"));
	WebElement contactus = driver.findElement(By.xpath( ".//*[@id='navigate']/div[1]/ul/li[1]/ul/li[9]/a"));

	WebElement content = driver.findElement(By.xpath(
			".//*[@id='aspnetForm']/div[3]/div[4]/div[1]/div/div/div/div[1]/div/div/p[2]"));

	public OurCompanyPgObjects(WebDriver driver) {
	this.driver=driver;	
	}

	public boolean getAvailabilityOurCompany() {
		return ourcompany.isDisplayed();
	}

	public void clickOurCompany() {
		ourcompany.click();
	}

	public String getContent() {
		return content.getText().replace("\n", " ");
	}

	public void clickOurCompanyDrop() {
		ourcompanydrop.click();
	}

	public void clickAboutQnet() {
		aboutqnet.click();
	}

	public void clickDirectSelling() {
		directselling.click();
	}

	public void clickOurMission() {
		ourmission.click();
	}

	public void clickQnetHonerRoll() {
		qnethonerroll.click();
	}

	public void clickOurHistory() {
		ourhistory.click();
	}

	public void clickCoperateSocial() {
		coperatesocial.click();
	}

	public void clickBrandingAndSports() {
		brandingandsports.click();
	}

	public void clickStayConnected() {
		stayconnected.click();
	}

	public void clickContactUs() {
		contactus.click();
	}

}

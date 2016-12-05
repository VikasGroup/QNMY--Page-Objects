package Opportunity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class OpportunityPgObjects{
WebDriver driver;
	public OpportunityPgObjects() {
		this.driver=driver;
	}

	WebElement opportunity = driver.findElement(By.xpath( ".//*[@id='ctl00_ctl12_hlOpportunity']"));
	WebElement opportunitydrop = driver.findElement(By.xpath( ".//*[@id='navigate']/div[1]/ul/li[2]/i"));

	WebElement compensationplan = driver.findElement(By.xpath(".//*[@id='navigate']/div[1]/ul/li[2]/ul/li[3]/h2/a"));
	WebElement professionalmarketing = driver.findElement(By.xpath(".//*[@id='navigate']/div[1]/ul/li[2]/ul/li[3]/div/a"));
	WebElement ourstories = driver.findElement(By.xpath( ".//*[@id='navigate']/div[1]/ul/li[2]/ul/li[3]/div/a"));

	WebElement content = driver.findElement(By.xpath( ".//*[@id='aspnetForm']/div[3]/div[4]/div[1]/div/div/div/div[1]/p[1]"));

	public void clickOpportunity() {
		opportunity.click();
	}
	public boolean getAvailabilityOpportunity(){
		 return opportunity.isDisplayed();
	 }

	public void clickOpportunityDrop() {
		opportunitydrop.click();
	}

	public void clickCompensationPlan() {
		compensationplan.click();
	}

	public void clickProfessionalMarketing() {
		professionalmarketing.click();
	}

	public void clickOurStories() {
		ourstories.click();
	}
	public String getContent(){
		return content.getText().replace("\n", " ");
	}
}

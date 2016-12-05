package HelpCenter;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HelpCenterPgObjects {
WebDriver driver;
	public HelpCenterPgObjects(WebDriver driver) {
		this.driver=driver;
	}
	
	WebElement helpcenter = driver.findElement(By.xpath(".//*[@id='ctl00_ctl12_MenuEncryption1_hlURL']"));
	WebElement helpcenterdrop = driver.findElement(By.xpath(".//*[@id='navigate']/div[1]/ul/li[6]/i"));

	WebElement support = driver.findElement(By.xpath(".//*[@id='navigate']/div[1]/ul/li[6]/ul/li/a"));
	WebElement content = driver.findElement(By.xpath(".//*[@id='main-content']/div[3]/div[2]/div[3]/div[2]/div/ul/li[3]/p"));
	
	public boolean getAvailabilityHelpCenter(){
		 return helpcenter.isDisplayed();
	 }
	public void clickHelpCenter(){
		helpcenter.click();
	}
	public String getContect(){
		return content.getText().replace("\n", " ");
	}

}

package News;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class NewsPgObjects{
	WebDriver driver;
	public NewsPgObjects(WebDriver driver) {
		this.driver=driver;
	}

	 WebElement news = driver.findElement(By.xpath( ".//*[@id='ctl00_ctl12_hlNews']"));
	 WebElement content = driver.findElement(By.xpath( ".//*[@id='main-content']/div[3]/div[2]/div[3]/div[2]/div/ul/li[1]/p"));
	
	public void clickNews() {
		news.click();
	}
	public boolean getAvailabilityNews(){
		 return news.isDisplayed();
	 }
	public String getContect(){
		return content.getText().replace("\n", " ");
	}
}

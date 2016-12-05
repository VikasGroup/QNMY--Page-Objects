package HomePage;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class QntestPgObjects{

	WebDriver driver;
	public QntestPgObjects(WebDriver driver) {
		this.driver=driver;
	}

WebElement irlogin =driver.findElement(By.xpath( ".//*[@id='ctl00_ctl11_hlLogin']"));
WebElement enroll =driver.findElement(By.xpath( ".//*[@id='ctl00_ctl11_hlJoinUs']"));
WebElement shop =driver.findElement(By.xpath( ".//*[@id='ctl00_ctl11_hlShop']"));
WebElement language =driver.findElement(By.xpath( ".//*[@id='ctl00_ctl11_hlLangualge']"));

WebElement search =driver.findElement(By.xpath( ".//*[@id='ctl00_ctl11_txtSearch']"));
//WebElement banner = createElement(Locators.ClassName, "banner-slider");
WebElement img1 =driver.findElement(By.xpath( ".//*[@id='identity']/div[2]/div[2]/div[1]/span"));
WebElement img2 =driver.findElement(By.xpath( ".//*[@id='identity']/div[2]/div[2]/div[2]/span"));
WebElement img3 =driver.findElement(By.xpath( ".//*[@id='identity']/div[2]/div[2]/div[3]/span"));
WebElement img4 =driver.findElement(By.xpath( ".//*[@id='identity']/div[2]/div[2]/div[4]/span"));
WebElement img5 =driver.findElement(By.xpath( ".//*[@id='identity']/div[2]/div[2]/div[5]/span"));
WebElement img6 =driver.findElement(By.xpath( ".//*[@id='identity']/div[2]/div[2]/div[6]/span"));
WebElement img7 =driver.findElement(By.xpath( ".//*[@id='identity']/div[2]/div[2]/div[7]/span"));

WebElement onimg1 =driver.findElement(By.xpath( ".//*[@id='identity']/div[1]/div/div[3]/div/a/picture/img"));
WebElement onimg2 =driver.findElement(By.xpath( ".//*[@id='identity']/div[1]/div/div[4]/div/a/picture/img"));
WebElement onimg3 =driver.findElement(By.xpath( ".//*[@id='identity']/div[1]/div/div[5]/div/a/picture/img"));
WebElement onimg4 =driver.findElement(By.xpath( ".//*[@id='identity']/div[1]/div/div[6]/div/a/picture/img"));
WebElement onimg5 =driver.findElement(By.xpath( ".//*[@id='identity']/div[1]/div/div[7]/div/a/picture/img"));
WebElement onimg6 =driver.findElement(By.xpath( ".//*[@id='identity']/div[1]/div/div[8]/div/a/picture/img"));
WebElement onimg7 =driver.findElement(By.xpath( ".//*[@id='identity']/div[1]/div/div[9]/div/a/picture/img"));

WebElement yourapportunity =driver.findElement(By.xpath( ".//*[@id='aspnetForm']/div[3]/div[3]/div[1]/div/div[1]"));
WebElement whyqnet =driver.findElement(By.xpath( ".//*[@id='aspnetForm']/div[3]/div[3]/div[1]/div/div[2]"));
WebElement ourproducts =driver.findElement(By.xpath( ".//*[@id='aspnetForm']/div[3]/div[3]/div[1]/div/div[3]"));
WebElement viewmore =driver.findElement(By.xpath( ".//*[@id='aspnetForm']/div[3]/div[3]/div[2]/div/a"));
WebElement agree =driver.findElement(By.xpath( ".//*[@id='myModal']/p[2]/a[1]"));
WebElement qnetlogo =driver.findElement(By.xpath( ".//*[@id='ctl00_hlQNetlogo']/img"));
//WebElement qnetlogo=webDriver.findElement(By.xpath(".//*[@id='ctl00_hlQNetlogo']/img"));
WebElement continuetoshop =driver.findElement(By.xpath( ".//*[@id='myModal2']/p[2]/a[1]"));

String srcvalue="return arguments[0].attributes['src'].value;";
 public String getBannerSRC(){	

	  return  ((JavascriptExecutor)driver).executeScript(srcvalue, qnetlogo).toString();
	
 }

 public void clickYourOpportunity(){
	 yourapportunity.click();
 }
 public void clickContinueToShop(){
	 continuetoshop.click();
 }
 public void clickWhyQnet(){
	 whyqnet.click();
 }
 
 public void clickQnetLogo(){
	 qnetlogo.click();
 }
 
 public void clickOurProducts(){
	 ourproducts.click();
 }
 public void clickAgree(){
	 agree.click();
 }
 public void clickViewMore(){
	 viewmore.click();
 }
 public void clickImg1(){
	 img1.click();
 }
 public void clickImg2(){
	 img2.click();
 } 
 public void clickImg3(){
	 img3.click();
 } 
 public void clickImg4(){
	 img4.click();
 }
 public void clickImg5(){
	 img5.click();
 }
 public void clickImg6(){
	 img6.click();
 } 
 public void clickImg7(){
	 img7.click();
 }
 
 
 public void clickOnImg1(){
	 onimg1.click();
 }
 public void clickOnImg2(){
	 onimg2.click();
 } 
 public void clickOnImg3(){
	 onimg3.click();
 } 
 public void clickOnImg4(){
	 onimg4.click();
 }
 public void clickOnImg5(){
	 onimg5.click();
 }
 public void clickOnImg6(){
	 onimg6.click();
 } 
 public void clickOnImg7(){
	 onimg7.click();
 }
 
 public void pressEnter(){
	 search.sendKeys(Keys.ENTER);
 }
 public void enterSearch(String keyword){
	 search.sendKeys(keyword);
 }
 public boolean getAvailabilityEnroll(){
	 return enroll.isDisplayed();
 }
 public boolean getAvailabilityShop(){
	 return shop.isDisplayed();
 }
 public boolean getAvailabilityLanguage(){
	 return language.isDisplayed();
 }
 public boolean getAvailabilitySearch(){
	 return search.isDisplayed();
 }
 public boolean getAvailabilityIRLogin(){
	 return irlogin.isDisplayed();
 }
 public boolean getAvailabilityQnetLogo(){
	 return qnetlogo.isDisplayed();
 }
 /*public boolean getAvailabilityBanner(){
	 return banner.isDisplayed();
 }*/

public void clickIRLogin(){
	irlogin.click();
}
public void clickEnroll(){
	enroll.click();
}
public void clickShop(){
	shop.click();
}
public String getLanguage(){
	return language.getText();
}
}


package OurProducts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class OurProductsPgObjects {
WebDriver driver;
	public OurProductsPgObjects(WebDriver driver) {
		this.driver=driver;
	}

	WebElement ourproduct = driver.findElement(By.xpath( ".//*[@id='ctl00_ctl12_hlProduct']"));
	WebElement ourproductdrop = driver.findElement(By.xpath( ".//*[@id='navigate']/div[1]/ul/li[2]/i"));
	WebElement helthwellness = driver.findElement(By.xpath(".//*[@id='navigate']/div[1]/ul/li[2]/ul/li[1]/h2/a"));
	WebElement homepure = driver.findElement(By.xpath(".//*[@id='navigate']/div[1]/ul/li[2]/ul/li[1]/div/a[1]"));
	WebElement airpure = driver.findElement(By.xpath( ".//*[@id='navigate']/div[1]/ul/li[2]/ul/li[1]/div/a[2]"));
	WebElement ole = driver.findElement(By.xpath( ".//*[@id='navigate']/div[1]/ul/li[2]/ul/li[1]/div/a[3]"));
	WebElement lifeqode = driver.findElement(By.xpath(".//*[@id='navigate']/div[1]/ul/li[2]/ul/li[1]/div/a[4]"));
	WebElement amezcua = driver.findElement(By.xpath( ".//*[@id='navigate']/div[1]/ul/li[2]/ul/li[1]/div/a[5]"));
	WebElement veloci = driver.findElement(By.xpath( ".//*[@id='navigate']/div[1]/ul/li[2]/ul/li[1]/div/a[6]"));
	WebElement okaair = driver.findElement(By.xpath( ".//*[@id='navigate']/div[1]/ul/li[2]/ul/li[1]/div/a[7]"));
	WebElement okamizu = driver.findElement(By.xpath( ".//*[@id='navigate']/div[1]/ul/li[2]/ul/li[1]/div/a[8]"));
	WebElement qafe = driver.findElement(By.xpath( ".//*[@id='navigate']/div[1]/ul/li[2]/ul/li[1]/div/a[9]"));
	//WebElement alloe = driver.findElement(By.xpath( ".//*[@id='navigate']/div[1]/ul/li[2]/ul/li[1]/div/a[10]"));

	
	WebElement personalcarebuty = driver.findElement(By.xpath(".//*[@id='navigate']/div[1]/ul/li[2]/ul/li[2]/h2/a"));
	WebElement physioradiance = driver.findElement(By.xpath(".//*[@id='navigate']/div[1]/ul/li[2]/ul/li[2]/div/a[1]"));
	WebElement defy = driver.findElement(By.xpath( ".//*[@id='navigate']/div[1]/ul/li[2]/ul/li[2]/div/a[2]"));
	WebElement biosilver = driver.findElement(By.xpath(".//*[@id='navigate']/div[1]/ul/li[2]/ul/li[2]/div/a[3]"));
	WebElement shapers = driver.findElement(By.xpath( ".//*[@id='navigate']/div[1]/ul/li[2]/ul/li[2]/div/a[4]"));

	
	
	WebElement watchesandjwellery = driver.findElement(By.xpath(".//*[@id='navigate']/div[1]/ul/li[2]/ul/li[3]/h2/a"));
	WebElement bernhard = driver.findElement(By.xpath( ".//*[@id='navigate']/div[1]/ul/li[2]/ul/li[3]/div/a"));
	

	WebElement technology = driver.findElement(By.xpath( ".//*[@id='navigate']/div[1]/ul/li[2]/ul/li[4]/h2/a"));
	WebElement qnetlife = driver.findElement(By.xpath(".//*[@id='navigate']/div[1]/ul/li[2]/ul/li[4]/div/a[1]"));
	WebElement bizsmart = driver.findElement(By.xpath(".//*[@id='navigate']/div[1]/ul/li[2]/ul/li[4]/div/a[2]"));
	WebElement vtube = driver.findElement(By.xpath( ".//*[@id='navigate']/div[1]/ul/li[2]/ul/li[4]/div/a[3]"));

	WebElement motorcare = driver.findElement(By.xpath( ".//*[@id='navigate']/div[1]/ul/li[2]/ul/li[5]/h2/a"));
	WebElement titaniumtreatment = driver.findElement(By.xpath(".//*[@id='navigate']/div[1]/ul/li[2]/ul/li[5]/div/a"));

	
	public boolean getAvailabilityPersonalCareButy(){
		return personalcarebuty.isDisplayed();
	}
	public boolean getAvailabilityPhysioradiance(){
		return physioradiance.isDisplayed();
	}
	public boolean getAvailabilityDefy(){
		return defy.isDisplayed();
	}
	public boolean getAvailabilityBiosilver(){
		return biosilver.isDisplayed();
	}
	public boolean getAvailabilityShapers(){
		return shapers.isDisplayed();
	}
	public boolean getAvailabilityWatchesandjwellery(){
		return watchesandjwellery.isDisplayed();
	}
	public boolean getAvailabilityBernhard(){
		return bernhard.isDisplayed();
	}
	public boolean getAvailabilityTechnology(){
		return technology.isDisplayed();
	}
	public boolean getAvailabilityQnetlife(){
		return technology.isDisplayed();
	}
	public boolean getAvailabilityBizsmart(){
		return bizsmart.isDisplayed();
	}
	public boolean getAvailabilityVtube(){
		return vtube.isDisplayed();
	}
	public boolean getAvailabilityMotorcare(){
		return motorcare.isDisplayed();
	}
	public boolean getAvailabilityTitaniumtreatment(){
		return titaniumtreatment.isDisplayed();
	}
	
	public boolean getAvailabilityHelthWellness(){
		return helthwellness.isDisplayed();
	}
	
	public void clickOurProduct() {
		ourproduct.click();
	}

	public void clickOurProductDrop() {
		ourproductdrop.click();
	}

	public void clickHelthWellness() {
		helthwellness.click();
	}
	public String getContent(){
		return personalcarebuty.getText()+" "+personalcarebuty.getText();
	}
	public boolean getAvailabilityOurProduct(){
		 return ourproduct.isDisplayed();
	 }
	public void clickHomepure() {
		homepure.click();
	}

	public void clickAirpure() {
		airpure.click();
	}

	public void clickOle() {
		ole.click();
	}

	public void clickLifeQode() {
		lifeqode.click();
	}

	public void clickAmezcua() {
		amezcua.click();
	}

	public void clickVeloci() {
		veloci.click();
	}

	public void clickOkaAir() {
		okaair.click();
	}

	public void clickOkamIzu() {
		okamizu.click();
	}

	public void clickQafe() {
		qafe.click();
	}

	/*public void clickAlloe() {
		alloe.click();
	}*/

	public void clickPersonalCareButy() {
		personalcarebuty.click();
	}

	public void clickPhysioRadiance() {
		physioradiance.click();
	}

	public void clickDefy() {
		defy.click();
	}

	public void clickBioSilver() {
		biosilver.click();
	}

	public void clickShapers() {
		shapers.click();
	}

	public void clickWatchesAndJwellery() {
		watchesandjwellery.click();
	}

	public void clickBernhard() {
		bernhard.click();
	}

	public void clickTechnology() {
		technology.click();
	}

	public void clickQnetLife() {
		qnetlife.click();
	}

	public void clickBizSmart() {
		bizsmart.click();
	}

	public void clickVTube() {
		vtube.click();
	}

	public void clickMotorcare() {
		motorcare.click();
	}

	public void clickTitaniumTreatment() {
		titaniumtreatment.click();
	}
	public boolean getAvailabilityHomepure(){
		return homepure.isDisplayed();
	}
	public boolean getAvailabilityAirpure(){
		return airpure.isDisplayed();
	}
	public boolean getAvailabilityOle(){
		return ole.isDisplayed();
	}
	public boolean getAvailabilityLifeQode(){
		return lifeqode.isDisplayed();
	}
	public boolean getAvailabilityAmezcua(){
		return amezcua.isDisplayed();
	}
	public boolean getAvailabilityVeloci(){
		return veloci.isDisplayed();
	}
	public boolean getAvailabilityOkaair(){
		return okaair.isDisplayed();
	}
	public boolean getAvailabilityOkamizu(){
		return okamizu.isDisplayed();
	}
	public boolean getAvailabilityQafe(){
		return qafe.isDisplayed();
	}
/*	public boolean getAvailabilityAlloe(){
		return alloe.isDisplayed();
	}*/

}

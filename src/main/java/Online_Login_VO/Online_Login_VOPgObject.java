package Online_Login_VO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Online_Login_VOPgObject {
	WebDriver driver;
	public Online_Login_VOPgObject(WebDriver driver) {
		this.driver=driver;
	}

	WebElement content = driver.findElement(By.xpath(".//*[@id='form1']/div[2]/div/div/div[2]/div/div/div/div[2]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td/table[3]/tbody/tr[6]/td/p[3]"));

	public String getContent() {
		return content.getText();
	}
}

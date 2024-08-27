package selenium_bypavan;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Assignment_03 extends BaseClass{

	public static void main(String[] args) throws Exception {
		WebDriver driver = getDriver();
		driver.get("https://practice.expandtesting.com/checkboxes");
		Thread.sleep(5000);
		getJS().executeScript("window.scrollTo(0, document.body.scrollHeight);");
		List<WebElement> list_checkbox = driver.findElements(By.xpath("//input[@class='form-check-input']"));
		int countCheckbox = list_checkbox.size();
		//System.out.println("Total no. of checkboxes : "+countCheckbox);
		for(WebElement checkbox : list_checkbox) {
			Thread.sleep(1000);
			checkbox.click();
		}

		closeDriver();
	}

}

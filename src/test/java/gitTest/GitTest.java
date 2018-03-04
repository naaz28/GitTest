package gitTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GitTest {

	@Test
	public void testGit() throws IOException{
		
		WebDriver wd=new FirefoxDriver();
		wd.get("https://www.bing.com");
		WebElement input=wd.findElement(By.name("q"));;
		input.sendKeys("abc");
		input.submit();
		
		File src=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\seleniun\\eclipse\\GitTest\\screenshot\\google.jpg"));
	
	}
}

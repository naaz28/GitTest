package gitTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GitTest2 {

	@Test
	public void testGit(){
		
		WebDriver wd=new FirefoxDriver();
		wd.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=UPqbWp76EsHD8AeaiIMY");
		WebElement input=wd.findElement(By.name("q"));;
		input.sendKeys("abc");
		input.submit();
		
	}
}

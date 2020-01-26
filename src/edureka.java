import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class edureka {

	public static void main(String[] args) throws InterruptedException {
		
		//neceseery drivers for firefox driver
		System.setProperty("webdriver.gecko.driver", "C:\\firedriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//launching edureka website
    	driver.get("https://www.edureka.co/?utm_source=google&utm_medium=cpc&utm_campaign=Brand:-Search:-IN:-Cust&gclid=Cj0KCQiAxfzvBRCZARIsAGA7YMx1pDLPq-v2npwZW_X4_14pAU8zRPwxzs25a46U-IjmblGSUrnt1AYaAneaEALw_wcB");
    	try {
    		Thread.sleep(3000);
    	}catch(InterruptedException e){
    		e.printStackTrace();
    	}
    	
    	//*********************STEP:1  LOGIN TO EDUREKA****************************
    	
    	//locating loginin button and clicking it 
    	WebElement element = driver.findElement(By.linkText("Log In"));
    	element.click();
    	try {
    		Thread.sleep(2000);
    	}catch(InterruptedException e){
    		e.printStackTrace();
    	}
    	
		//entering emailid ans password
		element = driver.findElement(By.id("si_popup_email"));
		Thread.sleep(2000);
		element.sendKeys("2016.shyam.rochlani@ves.ac.in");
		
		element = driver.findElement(By.id("si_popup_passwd"));
		Thread.sleep(2000);
		element.sendKeys("Shyam1234");
		
		
		//clicking the login button
		element = driver.findElement(By.xpath("/html/body/div[16]/div/div/div[2]/div[3]/form/button"));
		Thread.sleep(2000);
		element.click();
		Thread.sleep(8000);
		//login done
		
		//*********************STEP:2  NAVIGATE TO MY PROFILE****************************
		
		//going to mypofile option
		element = driver.findElement(By.xpath("/html/body/div[2]/header/section/nav/div/ul[2]/li[1]/a/img"));
		Thread.sleep(2000);
		element.click();
		element = driver.findElement(By.xpath("/html/body/div[2]/header/section/nav/div/ul[2]/li[1]/ul/li[1]/a"));
		Thread.sleep(2000);
		element.click();
		Thread.sleep(5000);
		//my pofile option is open
		
		//*********************STEP:3  UPDATING DETAILS****************************
		//updating details
		
		//clicking on edit button 
		element = driver.findElement(By.xpath("/html/body/app-root/app-profile-main/div/div/div[2]/app-myprofilenew/div/div/div/div[2]/div[1]/div[1]/a/i"));
		element.click();
		Thread.sleep(2000);
		
		//edit company name 
		element = driver.findElement(By.xpath("/html/body/app-root/app-onboarding-main/div/div/div[1]/div[2]/div[2]/app-onboarding-professional-details/accordion/accordion-group/div/div[2]/div/form/div[1]/input"));
		Thread.sleep(1000);
		element.clear();
		element.sendKeys("Shyam Rochlaniiiii");
		Thread.sleep(10000);
		
		//edit industry
		Select industrydropdown = new Select(driver.findElement(By.xpath("/html/body/app-root/app-onboarding-main/div/div/div[1]/div[2]/div[2]/app-onboarding-professional-details/accordion/accordion-group/div/div[2]/div/form/div[3]/select")));
		Thread.sleep(2000);
		industrydropdown.selectByValue("Internet");;
		Thread.sleep(8000);
		
		//click on next
		element = driver.findElement(By.xpath("/html/body/app-root/app-onboarding-main/div/div/div[1]/div[2]/div[2]/app-onboarding-professional-details/accordion/accordion-group/div/div[2]/div/form/button[2]"));
		Thread.sleep(2000);
		element.click();
		
		Thread.sleep(5000);//wait for loading 
		
		//professional  details is open 
		//clicking on next
		element = driver.findElement(By.xpath("/html/body/app-root/app-onboarding-main/div/div/div[1]/div[2]/div[2]/app-onboarding-career-interests/accordion/accordion-group/div/div[2]/div/form/button[2]"));
		Thread.sleep(3000);
		element.click();
		
		Thread.sleep(5000);//wait for loading 
		
		//carrer interest page is open
		//clicking on finish
		element = driver.findElement(By.xpath("/html/body/app-root/app-onboarding-main/div/div/div[1]/div[2]/div[2]/app-onboarding-other-details/accordion/accordion-group/div/div[2]/div/form/div/button"));
		Thread.sleep(3000);
		element.click();
		
		//*********************STEP:4  LOGOUT OF THE PORTAL ****************************
		
		//click on profile
		//click on log out option
		element = driver.findElement(By.xpath("/html/body/app-root/app-profile-main/app-header/header/nav/div/div[3]/ul/li[6]/div/button/span"));
		Thread.sleep(2000);
		element.click();
		element = driver.findElement(By.xpath("/html/body/app-root/app-profile-main/app-header/header/nav/div/div[3]/ul/li[6]/div/ul/li[10]/a"));
		Thread.sleep(2000);
		element.click();
		
	}

}

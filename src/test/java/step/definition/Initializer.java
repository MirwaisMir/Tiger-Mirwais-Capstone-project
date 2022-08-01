package step.definition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import core.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Initializer extends Base{
	
	@Before
	public void beforeHooks(Scenario scenario) {
		logger.info("Scenario " + scenario.getName() + " started");
		selectBrowser();  
		launchBrowser(); 
		
	}
	
	
	public void afterHooks(Scenario scnario) {
		
		if(scnario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) 
					
					driver).getScreenshotAs(OutputType.BYTES);
			scnario.attach(screenshot, "image/png", "Failed Test");
		}else {
			tearDown();
			
			logger.info("Scenario " + scnario.getName() + " " + scnario.getStatus());
		}
		
	}

}

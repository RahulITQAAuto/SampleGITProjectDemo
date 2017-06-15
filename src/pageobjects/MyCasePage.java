package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="My Case Page"                                
     , summary=""
     , relativeUrl=""
     , connection="ServiceUser"
     )             
public class MyCasePage {
	
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"efhpTitle\")]")
	public WebElement CaseTitle;
	@LinkType()
	@FindBy(linkText = "\n                \n                    \n                    \n                \n                File\n                \n            ")
	public WebElement file;
	
}

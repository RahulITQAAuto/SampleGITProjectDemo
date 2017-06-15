package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="ProvarDemoSite"                                
     , summary=""
     , relativeUrl=""
     , connection="WebToCase"
     )             
public class ProvarDemoSite {

	@TextType()
	@FindBy(id = "name")
	public WebElement contactName;
	@TextType()
	@FindBy(id = "email")
	public WebElement email;
	@TextType()
	@FindBy(id = "phone")
	public WebElement phone;
	@ChoiceListType(values = { @ChoiceListValue(value = "High"), @ChoiceListValue(value = "Medium"),
			@ChoiceListValue(value = "Low") })
	@FindBy(id = "priority")
	public WebElement priority;
	@TextType()
	@FindBy(id = "subject")
	public WebElement subject;
	@ButtonType()
	@FindBy(name = "submit")
	public WebElement SubmitButton;
	@TextType()
	@FindBy(xpath = "//h2")
	public WebElement ThankYouMsg;
	@LinkType()
	@FindBy(linkText = "BACK TO HOME")
	public WebElement bACKTOHOME;
			
}

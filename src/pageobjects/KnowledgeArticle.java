package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="Knowledge Article"                                
     , summary="Contains the Knowledge Article related to case"
     , relativeUrl=""
     , connection="ServiceUser"
     )             
public class KnowledgeArticle {
			
	@LinkType()
	@FindBy(css = "#auraElement-caseDetails a")
	public WebElement BackToCase;

	@LinkType()
	@FindBy(xpath = "//*[@id=\"auraElement-caseDetails\"]//a")
	public WebElement backToCaseLink;		
			
}

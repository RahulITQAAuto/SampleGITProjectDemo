package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.model.ui.api.UiFacet;
import com.provar.core.testapi.annotations.*;

@Page( title="MyPageObject"                                
     , summary=""
     , relativeUrl=""
     , connection="RahulQA"
     )             
public class MyPageObject {

	@ButtonType()
	@FindBy(linkText = "Service Cloud Console")
	public WebElement ServiceCloud;

	@PageWait.Field(timeoutSeconds = 10)
	@TextType()
	@FindBy(css = "#phSearchInput")
	public WebElement searchSalesforce;

//	@LinkType()
//	@FindBy(linkText = "Test Community Account")
//	public WebElement testCommunityAccount;

	
			
}

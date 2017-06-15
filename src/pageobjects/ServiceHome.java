package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="ServiceHome"                                
     , summary=""
     , relativeUrl=""
     , connection="ServiceUser"
     )             
public class ServiceHome {

	@TextType()
	@FindBy(css = "#phSearchInput")
	public WebElement searchSalesforce;
			
}

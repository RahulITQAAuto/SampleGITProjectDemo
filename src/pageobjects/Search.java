package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.model.ui.api.UiFacet;
import com.provar.core.testapi.annotations.*;

@Page( title="Search"                                
     , summary=""
     , relativeUrl=""
     , connection="ServiceUser"
     )             
public class Search {

	@PageRow()
	public static class AccountSearch {

		@LinkType()
		@FindBy(xpath = ".//th/a")
		public WebElement accountName;
	}

	@FacetFindBys(value = { @FacetFindBy(findBy = @FindBy(xpath = ".//tr"), facet = UiFacet.DATA_ROWS) })
	@FindBy(xpath = "//*[@id=\"Account_body\"]//table")
	@PageTable(firstRowContainsHeaders = true, row = AccountSearch.class)
	public List<AccountSearch> AccountSearch;
			
}

package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.model.ui.api.UiFacet;
import com.provar.core.testapi.annotations.*;

@Page( title="SearchResults"                                
     , summary=""
     , relativeUrl=""
     , connection="ServiceUser"
     )             
public class SearchResults {

	@PageRow()
	public static class AccountsTable {
	
		@LinkType()
		@FindBy(xpath = ".//th/a")
		public WebElement testCommunityAccount;
	}

//	@PageRow()
//	public static class AccountsTable {
//	
//		@LinkType()
//		@FindBy(xpath = ".//th/a")
//		public WebElement testSearchedAccount;
//	}


	@PageRow()
	public static class ContactsTable {
	
		@LinkType()
		@FindBy(xpath = ".//th/a")
		public WebElement testCommunityAcctContact;
	}


	@FacetFindBys(value = { @FacetFindBy(findBy = @FindBy(xpath = ".//tr"), facet = UiFacet.DATA_ROWS) })
	@FindBy(xpath = "//*[@id=\"Account_body\"]//table")
	@PageTable(firstRowContainsHeaders = true, row = AccountsTable.class)
	public List<AccountsTable> AccountsTable;

	@FacetFindBys(value = { @FacetFindBy(findBy = @FindBy(xpath = ".//tr"), facet = UiFacet.DATA_ROWS) })
	@FindBy(xpath = "//*[@id=\"Contact_body\"]//table")
	@PageTable(firstRowContainsHeaders = true, row = ContactsTable.class)
	public List<ContactsTable> ContactsTable;

	

	@PageRow()
	public static class Cases {
		
		@LinkType()
		@FindBy(xpath = ".//th/a")						//// this "." was Very Very Imp !!
		public WebElement CaseNumber;
	}

	@FacetFindBys(value = { @FacetFindBy(findBy = @FindBy(xpath = ".//tr"), facet = UiFacet.DATA_ROWS) })
	@FindBy(xpath = "//*[@id=\"Case_body\"]//table")
	@PageTable(firstRowContainsHeaders = true, row = Cases.class)
	public List<Cases> Cases;


}

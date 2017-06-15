package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.model.ui.api.UiFacet;
import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Case Interactions Read All"                                
               , summary=""
               , page="CaseInteractionsReadAll"
               , namespacePrefix=""
               , object="Case"
               , connection="ServiceUser"
     )             
public class CaseInteractionsReadAll {

//	@PageRow()
//	public static class CaseNotesTable {
////		@FindBy(xpath=)
//	}
//		
//
//	@FacetFindBys(value = { @FacetFindBy(findBy = @FindBy(xpath = ".//tr"), facet = UiFacet.DATA_ROWS) })
//	@FindBy(xpath = "//div[contains(@class, \"dataTables_scrollHeadInner\")]//table")
//	@PageTable(firstRowContainsHeaders = true, row = CaseNotesTable.class)
//	public List<CaseNotesTable> CaseNotesTable;
	
	@TextType()
	@VisualforceBy(componentXPath = "apex:form//tr[contains(@class, \"odd\")]//td[5]")
	public WebElement CommentsColValue;
	
	@LinkType()
	@FindBy(xpath = "//a[contains(@class, \"a-detail-link\")]")
	public WebElement InteractionNumber;
	
	@PageRow()
	public static class CaseNotes {

		@TextType()
		@FindBy(xpath = ".//td[2]")
		public WebElement Interaction;

		@TextType()
		@FindBy(xpath = ".//td[3]")
		public WebElement createdDate;

		@TextType()
		@FindBy(xpath = ".//td[4]")
		public WebElement CreatedBy;

		@LinkType()
		@FindBy(xpath = ".//td[5]/a")
		public WebElement InteractionNotesCommentEmailLink;

		@TextType()
		@FindBy(xpath = ".//td[5]")
		public WebElement InteractionNotes;	

		@TextType()
		@FindBy(xpath = ".//td[6]")
		public WebElement InternalNotes;
		
		@TextType()
		@FindBy(xpath = ".//td[7]")
		public WebElement TotalTime;		
							
		@TextType()
		@FindBy(xpath = ".//td[8]/input")
		public WebElement Billable;
	}

	@FacetFindBys(value = { @FacetFindBy(findBy = @FindBy(xpath = ".//tr"), facet = UiFacet.DATA_ROWS) })
	@FindBy(xpath = "//*[@id=\"tblResults\"]")
	@PageTable(firstRowContainsHeaders = true, row = CaseNotes.class)
	public List<CaseNotes> CaseNotes;

	@PageRow()
	public static class CaseNotesTable {
	
		@TextType()
		@FindBy(xpath = ".//td[2]")
		public WebElement Interaction;

		@TextType()
		@FindBy(xpath = ".//td[3]")
		public WebElement createdDate;

		@TextType()
		@FindBy(xpath = ".//td[4]")
		public WebElement CreatedBy;

		@LinkType()
		@FindBy(xpath = ".//td[5]/a")
		public WebElement InteractionNotesCommentEmailLink;

		@TextType()
		@FindBy(xpath = ".//td[5]")
		public WebElement InteractionNotes;	

		@TextType()
		@FindBy(xpath = ".//td[6]")
		public WebElement InternalNotes;
		
		@TextType()
		@FindBy(xpath = ".//td[7]")
		public WebElement TotalTime;		
							
		@TextType()
		@FindBy(xpath = ".//td[8]/input")
		public WebElement Billable;	
	}

	@FacetFindBys(value = { @FacetFindBy(findBy = @FindBy(xpath = ".//tr"), facet = UiFacet.DATA_ROWS) })
	@FindBy(xpath = "//div[contains(@class, \"dataTables_scrollHeadInner\")]//table")
	@PageTable(firstRowContainsHeaders = true, row = CaseNotesTable.class)
	public List<CaseNotesTable> CaseNotesTable;
	
}

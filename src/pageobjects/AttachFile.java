package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.model.ui.api.UiFacet;
import com.provar.core.testapi.annotations.*;

@Page( title="AttachFile"                                
     , summary=""
     , relativeUrl=""
     , connection="ServiceUser"
     )             
public class AttachFile {

	@PageRow()
	public static class UploadedFile {
	}

	@FacetFindBys(value = { @FacetFindBy(findBy = @FindBy(xpath = ".//tr"), facet = UiFacet.DATA_ROWS) })
	@FindBy(xpath = "//table[contains(@class, \"detailList\")]")
	@PageTable(firstRowContainsHeaders = true, row = UploadedFile.class)
	public List<UploadedFile> UploadedFile;
			
}

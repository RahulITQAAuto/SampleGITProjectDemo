package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Interaction Edit"                                
               , summary=""
               , page="InteractionEdit"
               , namespacePrefix=""
               , object="Interaction__c"
               , connection="ServiceUser"
     )             
public class InteractionEdit {

	@VisualforceBy(componentXPath = "apex:inputField[@id='inputTimeType']")
	@SalesforceField(name = "Time_Type__c", object = "Interaction__c")
	public WebElement TimeType;
	@VisualforceBy(componentXPath = "apex:inputCheckbox[@id='inputBillable']")
	@SalesforceField(name = "Billable__c", object = "Interaction__c")
	public WebElement inputBillable;
	@VisualforceBy(componentXPath = "apex:inputField[@id='inputPerfDate']")
	@SalesforceField(name = "Perfomed_Date__c", object = "Interaction__c")
	public WebElement inputPerfDate;
	@BooleanType()
	@FindBy(id = "radTimeEntryManual")
	public WebElement ManualTimeCheckbox;
	@TextType()
	@FindBy(id = "txtHours")
	public WebElement ManualTimehrField;
	@TextType()
	@FindBy(id = "txtMnts")
	public WebElement ManualMinutesTime;
	@BooleanType()
	@FindBy(id = "radTimeEntryAuto")
	public WebElement AutoTimerRadio;
	@VisualforceBy(componentXPath = "apex:inputTextarea[@id='interactionnotes']")
	@SalesforceField(name = "Interaction_Notes__c", object = "Interaction__c")
	public WebElement interactionnotes;
	@VisualforceBy(componentXPath = "apex:inputTextarea[@id='txtInternalNotes']")
	@SalesforceField(name = "Internal_Notes__c", object = "Interaction__c")
	public WebElement txtInternalNotes;
	@ButtonType()
	@VisualforceBy(componentXPath = "apex:pageBlockButtons")
	public WebElement saveInteraction;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, \"pbHeader\")]/table/tbody/tr/td[2]/input[1]")
	public WebElement btnSave;
	
}

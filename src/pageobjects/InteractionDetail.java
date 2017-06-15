package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Interaction Detail"                                
               , summary=""
               , page="InteractionDetail"
               , namespacePrefix=""
               , object="Interaction__c"
               , connection="ServiceUser"
     )             
public class InteractionDetail {

	@VisualforceBy(componentXPath = "apex:outputField[@value = \"{!Interaction__c.Interaction_Notes__c}\"]")
	@SalesforceField(name = "Interaction_Notes__c", object = "Interaction__c")
	public WebElement InteractionNotesValue;
	@VisualforceBy(componentXPath = "apex:outputField[@value = \"{!Interaction__c.Internal_Notes__c}\"]")
	@SalesforceField(name = "Internal_Notes__c", object = "Interaction__c")
	public WebElement InternalNotesFieldValue;
	
	@VisualforceBy(componentXPath = "apex:outputField[@value = \"{!Interaction__c.Case__c}\"]")
	@SalesforceField(name = "Case__c", object = "Interaction__c")
	public WebElement CaseFieldValue;
	
	@TextType()
	@VisualforceBy(componentXPath = "apex:form//h2[contains(@class, \"pageDescription\")]")
	public WebElement Interaction;
	
}

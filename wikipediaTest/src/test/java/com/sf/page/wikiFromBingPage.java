package com.sf.page;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
@DefaultUrl("http://www.Bing.com")
public class wikiFromBingPage extends PageObject{
	
	@FindBy(id="sb_form_go")
	WebElementFacade searchButton; 
	
	@FindBy(id="sb_form_q")
	WebElementFacade searchBox; 
	
	@FindBy(xpath="//html/body/div[2]/ol/li/h2/a")
	WebElementFacade firstLink; 
	
	public void inputText(String text){
		searchBox.sendKeys(text);
	}

	public void  clickLink(){
		firstLink.click();
}

	public void clickSearchButton(){
	searchButton.click();
}
}

package com.sf.map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.When;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class WikiFromBinMap extends ScenarioSteps {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	com.sf.page.wikiFromBingPage wikiFromBingPage;
	@Step
	public void inputText(String Text)
	{
		wikiFromBingPage.inputText(Text);
	}
	@Step
	public void arrivesAtPage(String resultPage){
		assertThat(wikiFromBingPage.getTitle(), is(resultPage));
	}
	@Step
	public void clickLink(){
		wikiFromBingPage.clickLink();
	}
	@Step
	public void clickSearch(){
		wikiFromBingPage.clickSearchButton();
	}
	@Step
	public void launchBingPage(){
		wikiFromBingPage.open();
	}
}

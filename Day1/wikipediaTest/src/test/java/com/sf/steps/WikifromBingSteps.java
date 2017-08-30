package com.sf.steps;
import org.jbehave.core.annotations.*;

import com.sf.map.WikiFromBinMap;

import net.thucydides.core.annotations.Steps;
public class WikifromBingSteps{
	@Steps
	WikiFromBinMap wikiFromBingMap;
	
	@When("the user enters $resultPage in the search field")
	public void whenTheUserEntersWikipediaInTheSearchField(String resultPage){
		wikiFromBingMap.inputText(resultPage);
	}
	@Then(value="the user should reach the $resultPage Page", priority =1)
	public void thenTheUserShouldReachTheWikipediaPage(String resultPage){
		wikiFromBingMap.arrivesAtPage(resultPage);
	}
	@When("the user clicks on the first link")
	public void whenTheUserClicksOnTheFirstLink(){
		wikiFromBingMap.clickLink();
	}
	@When("the user clicks on the search button")
	public void whenTheUserClicksOnTheSearchButton(){
		 wikiFromBingMap.clickSearch();
	}
	@Given("the user arrives at the Bing Page")
	public void givenTheUserArrivesAtTheBingPage(){
		wikiFromBingMap.launchBingPage();
	}
}
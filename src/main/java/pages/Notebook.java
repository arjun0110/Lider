package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class Notebook extends ProjectMethods{
	
	public Notebook() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.XPATH,using="//*[contains(@title,'Notebook 15.6 / Intel Core i7 / 8 GB / 1 TB / T. Video 2 GB')]")
	private WebElement clickaproduct1;
	
	public Productdetails clickingaproduct()
	{
		highLighterMethod(driver, clickaproduct1);
		click(clickaproduct1);
		
		return new Productdetails();
	}

	
	@FindBy(how=How.XPATH,using="//*[contains(@class, 'js-compare select-compare') and contains(@data-prodid,'PROD_911816')]")
	private WebElement compareprod1;
	
	public Notebook comparefirst()
	{
		highLighterMethod(driver, compareprod1);
		click(compareprod1);
		return this;
	}
	
	
	@FindBy(how=How.XPATH,using="//*[contains(@class, 'js-compare select-compare') and contains(@data-prodid,'PROD_911812')]")
	private WebElement compareprod2;
	
	public Notebook comparesecond()
	{
		highLighterMethod(driver, compareprod2);
		click(compareprod2);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@onclick,'compareFormSubmit(this);')]")
	private WebElement comparelink;
	
	public CompareResults clickCompare()
	{
		highLighterMethod(driver, comparelink);
		click(comparelink);
		return new CompareResults();
	}
	
	
	
}

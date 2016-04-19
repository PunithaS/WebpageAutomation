package com.costco.tests;

import org.testng.annotations.Test;
import static org.testng.Assert.*;
import com.costco.pages.*;

public class SearchTest {
	CostcoHomePage homepage= new CostcoHomePage();
	SearchResultPage search=new SearchResultPage();
	
	
  @Test
  public void searchTest() {
	  homepage.openHomePage("http://www.costco.com/");
	  homepage.search("laptop");
	assertEquals("88.",search.getTotalSearchResult());
		
	  
	  
  }
}

package com.amazon.test;
//Test Layer
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.amazon.pages.AmazonHomepage;

import commonLibs.CommonDriver;
//Run All
public class AmazonTest {
	
    CommonDriver cmnDriver;
	
	AmazonHomepage homepage;
	
	String url = "https://www.amazon.in";
	
	WebDriver driver;
	
	@BeforeClass
	public void invokeBrowser() throws Exception{
		
		cmnDriver = new CommonDriver("chrome");
		
		cmnDriver.setPageloadTimeout(60);
		cmnDriver.setElementDetectionTimeout(10);
		
		cmnDriver.navigateToFirstUrl(url);
		
		driver= cmnDriver.getDriver();
		
		homepage = new AmazonHomepage(driver);
		
	}
	
	@Test 
	//Run  | Debug
	public void searchProduct() throws Exception{
		String product = "Apple Mac Air";
		String category = "Electronics";
		
		homepage.searchProduct(product, category);
		
	}

	@AfterClass
	public void closeBrowser() throws Exception{
		
		cmnDriver.closeAllBrowsers();
		
	}

}

/*Git Quiz - Coursera
 * 
 * 
 * 
Graded Quiz: Test your Project understanding draft
TOTAL POINTS 5
1.
Question 1
"git add ." is a command to add files to ?
1 point
Staging or Index area
Local repository
Remote repository
Invalid command
A:a

2.
Question 2
Which one of them is not a valid GIT command?
1 point

git add .
git commit -am"message"
git user.name "Saurabh"
git push
A:b

3.
Question 3
git pull is similar to ?

1 point
git fetch + git push
git fetch + git clone
git fetch + git merge
git commit + git merge
A:c

4.
Question 4
The valid command to add a remote repository to Git is?
1 point

git append remote <remote url>
git remoteAdd <remote url>
git add remote origin <remote repo URL>
git remote add origin <remote repo URL>
A:d

5.
Question 5
To initiate a new empty repository the git command is?

1 point
git init
git initiate
git clone
git start

A:a

*/

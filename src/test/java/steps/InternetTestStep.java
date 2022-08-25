package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.InternetTestPage;

public class InternetTestStep {
    InternetTestPage internetTest = new InternetTestPage();
    @Given("^I am on the Internet-test page search page")
    public void navigateToPageTest(){
        internetTest.navigateToPageTest();
    }

    @And("^I select value in list")
    public void selectValueList(){
        internetTest.selectCategory("2");
    }
}

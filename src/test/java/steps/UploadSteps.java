package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.UploadPage;

public class UploadSteps {
    UploadPage uploadm = new UploadPage();
    @Given("^I am on the Internet-test page for upload")
    public void navigateToPageTest(){
        uploadm.navigateToUpload();
    }

    @Then("^I insert file")
    public void selectValueList() throws InterruptedException{
        Thread.sleep(1000);
        uploadm.uploadFile();
    }

    @And("^I select charge")
    public void selectCharge(){
        uploadm.clicUpload();
    }

}

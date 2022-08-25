package steps;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.GridPage;

public class GridTestSteps {
    GridPage grid = new GridPage();
    @Given("^I navigate to the static table")
    public void navigateToPageTest(){
        grid.navigateToGrid();
    }

    @Then("^I can return the value I wanted")
    public void selectValueList(){
        String value = grid.getValueFromGrid(2,3);

        Assert.assertEquals("fbach@yahoo.com", value);
        /*System.out.println(value);
        Thread.sleep(1000);
        grid.uploadFile();*/
    }

    @Then("^I can validate the table is displayed")
    public void theTableIsThere(){
        Assert.assertTrue("Fire mount", grid.cellStatus());
    }
}

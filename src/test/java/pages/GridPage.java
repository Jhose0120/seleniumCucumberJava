package pages;

public class GridPage extends BasePage {
    private String cell = "//tbody";
    private String mainTable = "//table[@id='table1']";
    public GridPage(){
        super(driver);
    }

    public void navigateToGrid(){
        navigateTo("https://the-internet.herokuapp.com/tables");
    }
    
    public String getValueFromGrid(int row1, int column1){
        return getValueFromTable(cell, row1, column1);
    }

    public boolean cellStatus(){
        return elementIsDisplayed(mainTable);
    }
}

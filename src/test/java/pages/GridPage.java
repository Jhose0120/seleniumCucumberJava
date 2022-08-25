package pages;

public class GridPage extends BasePage {
    private String cell = "//tbody";
    private String uploadF = "//input[@id='file-upload']";
    private String mainTable = "//table[@id='table1']";
    public GridPage(){
        super(driver);
    }

    public void navigateToGrid(){
        navigateTo("https://the-internet.herokuapp.com/tables");
        //navigateTo("https://the-internet.herokuapp.com/upload");
    }
    public void uploadFile(){
        write(uploadF, "C:\\Users\\MARIBEL\\Downloads\\Documentos de importación.pdf");
    }
    public String getValueFromGrid(int row1, int column1){
        return getValueFromTable(cell, row1, column1);
    }

    public boolean cellStatus(){
        return elementIsDisplayed(mainTable);
    }
}

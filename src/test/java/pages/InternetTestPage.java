package pages;

public class InternetTestPage extends BasePage{
    private String categoryDropdown = "//select[@id='dropdown']";
    public InternetTestPage (){
        super(driver);
    }
    public void navigateToPageTest(){
        navigateTo("https://the-internet.herokuapp.com/dropdown");
    }

    public void selectCategory(String category){
        selectFromDropdownByValue(categoryDropdown, category);
    }
}

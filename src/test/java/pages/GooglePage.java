package pages;

public class GooglePage extends BasePage {
    private String searchButoon = "//input[@value='Buscar con Google']";
    private String SearchTextField = "//input[@title='Buscar']";
    private String firstResult = "";

    public GooglePage () {
        super(driver);
    }

    public void navigateToGoogle(){
        navigateTo("https://www.google.com");
    }

    public void clickGooglePage(){
        clickElement(searchButoon);
    }

    public void enterSearcheCriteria(String criteria){
        write(SearchTextField, criteria);
    }

    public String firsResult(){
        return textFromElement(firstResult);
    }
}

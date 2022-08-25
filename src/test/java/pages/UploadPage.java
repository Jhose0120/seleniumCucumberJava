package pages;

public class UploadPage extends BasePage{
    private String uploadF = "//input[@id='file-upload']";
    private String bottonUpdate = "//input[@id='file-submit']";

    public UploadPage(){
        super(driver);
    }

    public void navigateToUpload(){
        navigateTo("https://the-internet.herokuapp.com/upload");
    }
    public void uploadFile(){
        write(uploadF, "C:\\Users\\MARIBEL\\Downloads\\descargaa.jpg");
    }

    public void clicUpload(){
        clickElement(bottonUpdate);
    }

}

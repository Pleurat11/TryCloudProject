package utilities;

public class BrowserUtils {
    public void sleep(int seconds){
        try{
            Thread.sleep(seconds * 1000);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

package day47_Abstraction.Browser;

public class FirefoxDriver extends RemoteWebDriver{
    @Override
    public void get(String URL){
        System.out.println("Firefox " + URL + " in Firefox driver");
    }
    @Override
    public void quit(){
        System.out.println("Closing the firefox browser");
    }
}

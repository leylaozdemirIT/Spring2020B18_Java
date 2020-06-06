package day47_Abstraction.Browser;

public class EdgeDriver extends RemoteWebDriver{

    public void get(String URL){
        System.out.println("Opening " + URL + " in Edge Driver");
    }
    public void quit(){
        System.out.println("Closing Edge Driver");
    }
}

package day47_Abstraction.Browser;

public class OperaDriver extends RemoteWebDriver{

    @Override
    protected void get(String URL) {
        System.out.println("Opening " + URL + " in Opera browser");
    }

    @Override
    public void quit() {
        System.out.println("Closing Opera Browser");
    }
}

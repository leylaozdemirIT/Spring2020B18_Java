package day47_Abstraction.Browser;

public class DriverObjects {
    public static void main(String[] args) {

        String URL = "https://www.google.com";
        ChromeDriver driver = new ChromeDriver();
        driver.get(URL); // OR driver.get("https://www.google.com");
        driver.quit();

        System.out.println("===================================");
        FirefoxDriver driver2 = new FirefoxDriver();
        driver2.get(URL); // OR driver2.get("https://www.google.com");
        driver2.quit();

        System.out.println("=====================================");
        OperaDriver driver3 = new OperaDriver();
        driver3.get(URL);
        driver3.quit();

        System.out.println("========================================");
        EdgeDriver driver4 = new EdgeDriver();
        driver4.get(URL);
        driver4.quit();
    }

}

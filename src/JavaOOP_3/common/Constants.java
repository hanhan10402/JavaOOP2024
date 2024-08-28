package JavaOOP_3.common;

public class Constants {
    public static String browser;
    public static boolean report;
    public static boolean headless;

    public static String getBrowser() {
        return browser;
    }
    public static void setBrowser(String browser) {
        Constants.browser = browser;
    }
    public static boolean isReport() {
        return report;
    }
    public static void setReport(boolean report) {
        Constants.report = report;
    }
    public static boolean isHeadless() {
        return headless;
    }
    public static void setHeadless(boolean headless) {
        Constants.headless = headless;
    }
    public static void initConstants(String browser, boolean report, boolean headless){
        Constants.browser = browser;
        Constants.report = report;
        Constants.headless = headless;
    }
    public static void getText(){
        System.out.println("Browser: "+getBrowser());
        System.out.println("Report: "+isReport());
        System.out.println("Headless: "+isHeadless());
    }
    public static void setText(){
         setBrowser("Google Chrome");
         setReport(true);
         setHeadless(false);
         getText();
    }
}

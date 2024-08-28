package JavaOOP_3.common;

public class BaseTest {
    public void createDriver(){
        Constants.setText();
    }
    public void closeDriver(){
        System.out.println("Close Driver: "+ Constants.getBrowser());
    }
    public void closeDriver(String browser){
        System.out.println("Close Driver: "+ browser);
    }
}

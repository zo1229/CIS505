/*Williams, A., (2024).  CIS 505 Intermediate Java Programming.  Bellevue University.*/
package Module_1.FanApp;

public class TestFanApp 
{
    public static void main(String[] args) 
    {
        Fan defaultFan = new Fan();
        System.out.println("Default Fan: " + defaultFan);

        Fan argumentFan = new Fan(Fan.MEDIUM, true, 8.0, "blue");
        System.out.println("Argument Fan: " + argumentFan);
    }
}

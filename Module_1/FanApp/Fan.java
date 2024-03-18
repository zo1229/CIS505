/*Williams, A., (2024).  CIS 505 Intermediate Java Programming.  Bellevue University.*/
package Module_1.FanApp;

public class Fan 
{
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() 
    {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6.0;
        this.color = "white";
    }

     public Fan(int speed, boolean on, double radius, String color) 
    {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() 
    {
        return speed;
    }

    public void setSpeed(int speed) 
    {
        this.speed = speed;
    }

    public boolean isOn() 
    {
        return on;
    }

    public void setOn(boolean on) 
    {
        this.on = on;
    }

    public double getRadius() 
    {
        return radius;
    }

    public void setRadius(double radius) 
    {
        this.radius = radius;
    }

    public String getColor() 
    {
        return color;
    }

    public void setColor(String color) 
    {
        this.color = color;
    }

    @Override
    public String toString() 
    {
        if (on) {
            return "Fan speed: " + speed + ", Color: " + color + ", Radius: " + radius;
        } else {
            return "Fan is off, Color: " + color + ", Radius: " + radius;
        }
    }

    public static void main(String[] args) 
    {
        Fan defaultFan = new Fan();
        System.out.println("Default Fan: " + defaultFan);

        Fan argumentFan = new Fan(Fan.MEDIUM, true, 8.0, "blue");
        System.out.println("Argument Fan: " + argumentFan);
    }
}

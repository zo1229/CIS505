/*Williams, A., (2024).  CIS 505 Intermediate Java Programming.  Bellevue University.*/
package Module_4.BowlingShopApp;
import java.util.*;

// Product class
class Product {
    private String code;
    private String description;
    private double price;

    public Product() {
        this.code = "";
        this.description = "";
        this.price = 0;
    }

    public Product(String code, String description, double price) {
        this.code = code;
        this.description = description;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Code: " + code + "\nDescription: " + description + "\nPrice: $" + String.format("%,6.2f", price);
    }
}

// Ball class
class Ball extends Product {
    private String color;

    public Ball() {
        super();
        this.color = "";
    }

    public Ball(String code, String description, double price, String color) {
        super(code, description, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + "\nColor: " + color;
    }
}

// Bag class
class Bag extends Product {
    private String type;

    public Bag() {
        super();
        this.type = "";
    }

    public Bag(String code, String description, double price, String type) {
        super(code, description, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + "\nType: " + type;
    }
}

// Shoe class
class Shoe extends Product {
    private double size;

    public Shoe() {
        super();
        this.size = 0;
    }

    public Shoe(String code, String description, double price, double size) {
        super(code, description, price);
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSize: " + size;
    }
}

// ProductDB class
class ProductDB {
    public static GenericQueue<Product> getProducts(String code) {
        GenericQueue<Product> products = new GenericQueue<>();

        if (code.equals("1")) {
            for (int i = 0; i < 5; i++) {
                Ball ball = new Ball("B" + (i + 1), "Bowling Ball #" + (i + 1), 50.00 + i * 10, "Color" + (i + 1));
                products.enqueue(ball);
            }
        } else if (code.equals("2")) {
            for (int i = 0; i < 5; i++) {
                Shoe shoe = new Shoe("S" + (i + 1), "Bowling Shoe #" + (i + 1), 30.00 + i * 5, i + 7.5);
                products.enqueue(shoe);
            }
        } else if (code.equals("3")) {
            for (int i = 0; i < 3; i++) {
                Bag bag = new Bag("A" + (i + 1), "Bowling Bag #" + (i + 1), 40.00 + i * 10, "Type" + (i + 1));
                products.enqueue(bag);
            }
        }

        return products;
    }
}

// GenericQueue class
class GenericQueue<T> {
    private LinkedList<T> list;

    public GenericQueue() {
        list = new LinkedList<>();
    }

    public void enqueue(T item) {
        list.addFirst(item);
    }

    public T dequeue() {
        return list.removeFirst();
    }

    public int size() {
        return list.size();
    }
}

// TestBowlingShopApp class
public class TestBowlingShopApp {
    public static void main(String[] args) {
        displayMenu();
    }

    public static void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        String userInput;

        do {
            System.out.println("Choose an option:");
            System.out.println("1. Bowling Balls");
            System.out.println("2. Bowling Shoes");
            System.out.println("3. Bowling Bags");
            System.out.println("x. Exit");
            System.out.print("Enter your choice: ");
            userInput = scanner.nextLine();

            GenericQueue<Product> products = ProductDB.getProducts(userInput);

            while (products.size() > 0) {
                System.out.println(products.dequeue());
                System.out.println("---------------------");
            }
        } while (!userInput.equalsIgnoreCase("x"));

        scanner.close();
    }
}

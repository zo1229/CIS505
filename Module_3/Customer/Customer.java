<<<<<<< HEAD
/*Williams, A., (2024).  CIS 505 Intermediate Java Programming.  Bellevue University.*/
=======
>>>>>>> 60cc484b006138f72ce6c382e174268baf11bafb
package Module_3.Customer;

class Customer {
    private String name;
    private String address;
    private String city;
    private String zip;

    public Customer() {

    }

    public Customer(String name, String address, String city, String zip) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.zip = zip;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getZip() {
        return zip;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nAddress: " + address + "\nCity: " + city + "\nZip: " + zip;
    }
}

class CustomerDB {
    public static Customer getCustomer(Integer id) {
        Customer customer;
        if (id == 1007) {
            customer = new Customer("Michael McGee", "123 Professor St", "Anytown", "98788");
        } else if (id == 1008) {
            customer = new Customer("Alphonso Williams", "456 Honor Roll Blvd", "Sometown", "87890");
        } else if (id == 1009) {
            customer = new Customer("Puff Daddy", "789 Prison Rd", "New York", "89890");
        } else {
            customer = new Customer("Unknown", "Unknown", "Unknown", "Unknown");
        }
        return customer;
    }
}

class Account {
    private double balance = 200;

    public double getBalance() {
        return balance;
    }

    public void deposit(double amt) {
        balance += amt;
    }

    public void withdraw(double amt) {
        if (balance >= amt) {
            balance -= amt;
        }
    }

    public void displayMenu() {
        System.out.println("Account Menu:");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Exit");
    }

}

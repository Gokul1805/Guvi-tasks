QL. Write a java program on below question (oops);

// 1.1 Person class
class Person {
    String name;
    int age;

    // Default constructor
    Person() {
        this.name = "Unknown";
        this.age = 13;
    }

    // Parameterized constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// 1.2 Product class
class Product {
    int pid;
    double price;
    int quantity;

    // Parameterized constructor
    Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }
}

// Separate class with main method
class ProductMain {

    // Method to find the product with highest price
    static int getHighestPricedProductPid(Product[] products) {
        double maxPrice = products[0].price;
        int pid = products[0].pid;

        for (int i = 1; i < products.length; i++) {
            if (products[i].price > maxPrice) {
                maxPrice = products[i].price;
                pid = products[i].pid;
            }
        }
        return pid;
    }

    // Method to calculate total amount spent
    static double calculateTotalAmount(Product[] products) {
        double total = 0;
        for (Product p : products) {
            total += p.price * p.quantity;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] products = new Product[5];

        System.out.println("Enter details of 5 products (pid, price, quantity):");
        for (int i = 0; i < 5; i++) {
            System.out.print("Product " + (i + 1) + " - ");
            int pid = sc.nextInt();
            double price = sc.nextDouble();
            int quantity = sc.nextInt();
            products[i] = new Product(pid, price, quantity);
        }

        int highestPid = getHighestPricedProductPid(products);
        System.out.println("Product with highest price has Pid: " + highestPid);

        double totalAmount = calculateTotalAmount(products);
        System.out.println("Total amount spent on all products: " + totalAmount);
    }
}

// 1.3 Account class
class Account {
    double balance;

    // No-arg constructor
    Account() {
        this.balance = 0;
    }

    // Parameterized constructor
    Account(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance -= amount;
        }
    }

    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

// 1.4 Inheritance: Person -> Employee
class Employee extends Person {
    int employeeID;
    double salary;

    Employee(String name, int age, int employeeID, double salary) {
        super(name, age);
        this.employeeID = employeeID;
        this.salary = salary;
    }

    void displayEmployee() {
        super.display();
        System.out.println("Employee ID: " + employeeID + ", Salary: " + salary);
    }
}

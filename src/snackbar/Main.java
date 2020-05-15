package snackbar;

public class Main {

  private static void workWithData() {
    // instantiate 2 customers
    Customer customer1 = new Customer("Jane", 45.25);
    Customer customer2 = new Customer("Bob", 33.14);

    // instantiate 3 vending machines
    VendingMachine vendingMachine1 = new VendingMachine("Food");
    VendingMachine vendingMachine2 = new VendingMachine("Drink");
    VendingMachine vendingMachine3 = new VendingMachine("Office");

    // instantiate 5 snacks
    Snack snack1 = new Snack("Chips", 36, 1.75, vendingMachine1.getId());
    Snack snack2 = new Snack("Chocolate Bar", 36, 1.00, vendingMachine1.getId());
    Snack snack3 = new Snack("Pretzel", 30, 2.00, vendingMachine1.getId());
    Snack snack4 = new Snack("Soda", 24, 2.50, vendingMachine2.getId());
    Snack snack5 = new Snack("Water", 20, 2.75, vendingMachine2.getId());

    // variables we need to print
    double totalCost;
    double cashOnHand;
    int remainingQuantity;

    System.out.println("**** Welcome! Purchase Some Snacks! ****");
    System.out.println();

    // Customer1 buys 3 of snack 4 - print cash on hand & quantity of snack
    totalCost = snack4.calculateTotalCost(3);
    cashOnHand = customer1.buySnacks(totalCost);
    remainingQuantity = snack4.buySnack(3);
    System.out.println("Customer " + customer1.getName() + " cash on hand: $" + String.format("%.2f", cashOnHand));
    System.out.println("Quantity of " + snack4.getName() + " is " + remainingQuantity);
    System.out.println();

    // Customer buys 1 of snack 3 
    totalCost = snack3.calculateTotalCost(1);
    cashOnHand = customer1.buySnacks(totalCost);
    remainingQuantity = snack3.buySnack(1);
    System.out.println("Customer " + customer1.getName() + " cash on hand: $" + String.format("%.2f", cashOnHand));
    System.out.println("Quantity of " + snack3.getName() + " is " + remainingQuantity);
    System.out.println();

    // Customer 2 buys 2 of snack 4
    totalCost = snack4.calculateTotalCost(2);
    cashOnHand = customer2.buySnacks(totalCost);
    remainingQuantity = snack4.buySnack(2);
    System.out.println("Customer " + customer2.getName() + " cash on hand: $" + String.format("%.2f", cashOnHand));
    System.out.println("Quantity of " + snack4.getName() + " is " + remainingQuantity);
    System.out.println();

    // Customer 1 finds $10; print cash on hand
    cashOnHand = customer1.addCash(10);
    System.out.println("Customer " + customer1.getName() + " cash on hand: $" + String.format("%.2f", cashOnHand));
    System.out.println();

    // Customer 1 (Jane) buys 1 of snack 2 (Chocolate Bar)
    totalCost = snack2.calculateTotalCost(1);
    cashOnHand = customer1.buySnacks(totalCost);
    remainingQuantity = snack2.buySnack(1);
    System.out.println("Customer " + customer1.getName() + " cash on hand: $" + String.format("%.2f", cashOnHand));
    System.out.println("Quantity of " + snack2.getName() + " is " + remainingQuantity);
    System.out.println();

    // Add 12 more items to snack 3 (Pretzel)
    remainingQuantity = snack3.addQuantity(12);
    System.out.println("Quantity of " + snack3.getName() + " is " + remainingQuantity);
    System.out.println();

    // Customer 2 (Bob) buys 3 of snack 3 (Pretzel)
    totalCost = snack3.calculateTotalCost(3);
    cashOnHand = customer2.buySnacks(totalCost);
    remainingQuantity = snack3.buySnack(3);
    System.out.println("Customer " + customer2.getName() + " cash on hand: $" + String.format("%.2f", cashOnHand));
    System.out.println("Quantity of " + snack3.getName() + " is " + remainingQuantity);
    System.out.println();

    // STRETCH GOALS
    System.out.println("Stretch Goals");
    System.out.println();

    String name;
    String vendingMachineName;
    double totalCostOfQuantity;

    //snack 1 || machine 1
    name = snack1.getName();
    vendingMachineName = vendingMachine1.getName();
    remainingQuantity = snack1.getQuantity();
    totalCostOfQuantity = remainingQuantity * snack1.getCost();

    System.out.println("Name: " + name);
    System.out.println("Vending Machine: " + vendingMachineName);
    System.out.println("Quantity: " + remainingQuantity);
    System.out.println("Total Cost: $" + String.format("%.2f", totalCostOfQuantity));
    System.out.println();

    // snack 2 || machine 1
    name = snack2.getName();
    vendingMachineName = vendingMachine1.getName();
    remainingQuantity = snack2.getQuantity();
    totalCostOfQuantity = remainingQuantity * snack2.getCost();

    System.out.println("Name: " + name);
    System.out.println("Vending Machine: " + vendingMachineName);
    System.out.println("Quantity: " + remainingQuantity);
    System.out.println("Total Cost: $" + String.format("%.2f", totalCostOfQuantity));
    System.out.println();

    // snack 3 || machine 1
    name = snack3.getName();
    vendingMachineName = vendingMachine1.getName();
    remainingQuantity = snack3.getQuantity();
    totalCostOfQuantity = remainingQuantity * snack3.getCost();

    System.out.println("Name: " + name);
    System.out.println("Vending Machine: " + vendingMachineName);
    System.out.println("Quantity: " + remainingQuantity);
    System.out.println("Total Cost: $" + String.format("%.2f", totalCostOfQuantity));
    System.out.println();

    // snack 4 || machine 2
    name = snack4.getName();
    vendingMachineName = vendingMachine2.getName();
    remainingQuantity = snack4.getQuantity();
    totalCostOfQuantity = remainingQuantity * snack4.getCost();

    System.out.println("Name: " + name);
    System.out.println("Vending Machine: " + vendingMachineName);
    System.out.println("Quantity: " + remainingQuantity);
    System.out.println("Total Cost: $" + String.format("%.2f", totalCostOfQuantity));
    System.out.println();

    // snack 5 || machine 2
    name = snack5.getName();
    vendingMachineName = vendingMachine2.getName();
    remainingQuantity = snack5.getQuantity();
    totalCostOfQuantity = remainingQuantity * snack5.getCost();

    System.out.println("Name: " + name);
    System.out.println("Vending Machine: " + vendingMachineName);
    System.out.println("Quantity: " + remainingQuantity);
    System.out.println("Total Cost: $" + String.format("%.2f", totalCostOfQuantity));
  }

  // main method calls the workWithDataMethod
  public static void main(String args[]) {
    workWithData();
  }

}
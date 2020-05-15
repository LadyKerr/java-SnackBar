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
    System.out.println("Customer " + customer1.getId() + " cash on hand: " + cashOnHand);
    System.out.println("Quantity of snack " + snack4.getId() + " is " + remainingQuantity);
    System.out.println();

    // Customer buys 1 of snack 3 
    totalCost = snack3.calculateTotalCost(1);
    cashOnHand = customer1.buySnacks(totalCost);
    remainingQuantity = snack3.buySnack(1);
    System.out.println("Customer " + customer1.getId() + " cash on hand: " + cashOnHand);
    System.out.println("Quantity of snack " + snack3.getId() + " is " + remainingQuantity);
    System.out.println();

    // Customer 2 buys 2 of snack 4
    totalCost = snack4.calculateTotalCost(2);
    cashOnHand = customer2.buySnacks(totalCost);
    remainingQuantity = snack4.buySnack(2);
    System.out.println("Customer " + customer2.getId() + " cash on hand: " + cashOnHand);
    System.out.println("Quantity of snack " + snack4.getId() + " is " + remainingQuantity);
    System.out.println();

    // Customer 1 finds $10; print cash on hand
    cashOnHand = customer1.addCash(10);
    System.out.println("Customer " + customer1.getId() + " cash on hand: " + cashOnHand);
    System.out.println();

    // Customer 1 (Jane) buys 1 of snack 2 (Chocolate Bar)
    totalCost = snack2.calculateTotalCost(1);
    cashOnHand = customer1.buySnacks(totalCost);
    remainingQuantity = snack2.buySnack(1);
    System.out.println("Customer " + customer1.getId() + " cash on hand: " + cashOnHand);
    System.out.println("Quantity of snack " + snack2.getId() + " is " + remainingQuantity);
    System.out.println();

    // Add 12 more items to snack 3 (Pretzel)
    remainingQuantity = snack3.addQuantity(12);
    System.out.println("Quantity of snack " + snack3.getId() + " is " + remainingQuantity);
    System.out.println();
    
    // Customer 2 (Bob) buys 3 of snack 3 (Pretzel)
    totalCost = snack3.calculateTotalCost(3);
    cashOnHand = customer2.buySnacks(totalCost);
    remainingQuantity = snack3.buySnack(3);
    System.out.println("Customer " + customer2.getId() + " cash on hand: " + cashOnHand);
    System.out.println("Quantity of snack " + snack3.getId() + " is " + remainingQuantity);
  }

  // main method calls the workWithDataMethod
  public static void main(String args[]) {
    workWithData();
  }

}
package snackbar;

/*
Customer 1 cash on hand 37.75
Quantity of snack 4 is 21
*/

public class Main {

  private static void workWithData()
  {
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
  }

  // main method calls the workWithDataMethod
  public static void main(String args[]) 
  {
    workWithData();
  }
  
}
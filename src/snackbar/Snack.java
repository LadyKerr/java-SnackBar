package snackbar;

public class Snack {

  // fields
  private int maxId = 0;
  private int id;
  private String name;
  private int quantity;
  private double cost;
  private int vendingMachineId;

  // constructor
  public Snack(String name, int quantity, double cost, int vendingMachineId) 
  {

    // auto generate id
    maxId++;
    id = maxId;

    this.name = name;
    this.quantity = quantity;
    this.cost = cost;
    this.vendingMachineId = vendingMachineId;
  }

  // get id
  public int getId() 
  {
    return id;
  }

  // set name
  public void setName(String name)
  {
    this.name = name;
  }

  // get name
  public String getName()
  {
    return name;
  }

  // set cost
  public void setCost(double cost)
  {
    this.cost = cost;
  }

  // get cost
  public double getCost()
  {
    return cost;
  }

  // set vendingMachineId
  public void setVendingmachineId(int vendingMachineId)
  {
    this.vendingMachineId = vendingMachineId;
  }

  // get vendingMachineId
  public int getVendingMachineId()
  {
    return vendingMachineId;
  }

  // get quantity
  public int getQuantity()
  {
    return quantity;
  }

  // add quantity when given how many items to add
  public int addQuantity(int newItem)
  {
    return quantity += newItem;
  }

  // buy snack when given how many snacks to buy
  public int buySnack(int amountOfSnacks)
  {
    return quantity -= amountOfSnacks;
  }

  // get total cost if given quantity
  public double calculateTotalCost(int quantity)
  {
    double totalCost = getCost() * quantity;
    return totalCost;
  }
}
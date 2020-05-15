package snackbar;

public class Customer {

  // fields
  private int maxId = 0;
  private int id;
  private String name;
  private double cashOnHand;

  // constructor
  public Customer(String name, double cashOnHand) {
    maxId++;
    id = maxId;

    this.name = name;
    this.cashOnHand = cashOnHand;
  }

  // get id
  public int getId() {
    return id;
  }

  // set name
  public void setName(String name) {
    this.name = name;
  }

  // get name
  public String getName() {
    return name;
  }

  // add cash to cash on hand (set cash)
  public double addCash(double cash) {
    return this.cashOnHand = cash;
  }

  // get cash on hand
  public double getCash() {
    return cashOnHand;
  }

  /*
   * buy snacks - Given the total cost of the snacks to be purchased, reduce the
   * cash on hand by that amount
   */
  public double buySnacks(double totalCost) {
    return cashOnHand -= totalCost;
  }

}
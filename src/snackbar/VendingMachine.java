package snackbar;

public class VendingMachine {

  // fields
  private int maxId = 0;
  private int id;
  private String name;

  // constructor
  public VendingMachine(String name)
  {
    // auto increment id
    maxId++;
    id = maxId;

    this.name = name;
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
  
}
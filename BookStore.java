import java.util.*;
interface Sales
{
  public void getSales(int sales);
  public void DisplaySales();
}

class Publication implements Sales
{
  int sales;
  String title;
  double price;
  Publication(String title, double price)
  {
    this.title=title;
    this.price=price;
    System.out.println("Publication super class constructor called");
  }
  public void getSales(int sales)
  {
    this.sales=sales;
  }
  public void DisplaySales()
  {
    System.out.println("Total sales: "+this.sales);
  }
}

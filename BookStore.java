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

class Book extends Publication
{
  int pageno;
  Book(String title, double price,int pageno)
  {
    super(title,price);
    this.pageno=pageno;
    System.out.println("Book base class constructor called");
  }
  public void display()
  {
    System.out.println("Title: "+this.title+"\tCost: "+this.price);
    System.out.println("Page no: "+this.pageno);
  }
}

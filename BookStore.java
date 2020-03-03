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

class Tape extends Publication
{
  double playingtime;
  Tape(String title, double price,double playingtime)
  {
    super(title,price);
    this.playingtime=playingtime;
    System.out.println("Tape base class constructore");
  }
  void display()
  {
    System.out.println("Title: "+this.title+"\tCost: "+this.price);
    System.out.println("Playing time: "+this.playingtime);
  }
}

public class BookStore
{
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Which book you want to read? ");
    String name=scan.nextLine();
    System.out.println("Enter its price: ");
    int price=scan.nextInt();
    System.out.println("Enter its page no: ");
    int page=scan.nextInt();
    System.out.println("Enter no of sales: ");
    int sale=scan.nextInt();
    Book b1=new Book(name,price,page);
    b1.getSales(sale);
    b1.display();
    b1.DisplaySales();
    System.out.println("\nWhich audio book you want to buy?");
    scan.nextLine();
    name=scan.nextLine();
    System.out.println("Enter its price: ");
    price=scan.nextInt();
    System.out.println("Enter its playing time: ");
    double play=scan.nextDouble();
    System.out.println("Enter no of sales: ");
    sale=scan.nextInt();
    Tape t1=new Tape(name,price,play);

    t1.display();
    t1.getSales(sale);
    t1.DisplaySales();
    b1=null;
    System.gc();
    System.out.println("\nobject of book deleted");
    t1=null;
    System.gc();
    System.out.println("object of tape deleted");
  }
}


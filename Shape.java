import java.util.*;
class CustomException extends Exception
{
  public CustomException(String s)
  {
    super(s);
  }
}

class Rectangle
{
  double length,width;
  Rectangle()
  {
    this.length=1;
    this.width=1;
  }

  public double perimeter()
  {
    double per=(2*(this.length+this.width));
    return per;
  }

  public double area()
  {
    double ar=this.length*this.width;
    return ar;
  }

  public void setLength(double length)
  {
try{
    if(length<0.0 || length>20.0)
       throw new CustomException("Error: width either negative or greater than 20");
     }
       catch(CustomException e){
         System.out.println(e.getMessage());
    this.length=length;


  }
  }
  
  public void setWidth(double width)
  {
    try{
        if(length<0.0 || length>20.0)
           throw new CustomException("Error: width either negative or greater than 20");
         }
           catch(CustomException e){
             System.out.println(e.getMessage());
             }
        this.length=length;
}
}

public class Shape
{
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    double per=0;
    double ar=0;
    double len=0;
    double wid=0;
    Rectangle r1=new Rectangle();
    System.out.println("Enter length of the rectangle (between 0 and 20): ");
    len=scan.nextDouble();
    r1.setLength(len);
    System.out.println("Enter width of the rectangle (between 0 and 20): ");
    wid=scan.nextDouble();
     r1.setWidth(wid);


  per=r1.perimeter();
  ar=r1.area();
   System.out.println("perimeter= "+per);
   System.out.println("Area= "+ar);
  }
}

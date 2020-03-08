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

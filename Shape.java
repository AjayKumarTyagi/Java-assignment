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

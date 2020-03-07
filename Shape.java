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

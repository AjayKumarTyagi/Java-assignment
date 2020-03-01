import java.util.*;
abstract class Animal
{
  String name;
  int age;
  String type;
  abstract public String getName(String name);
  abstract public int getAge(int age);
  abstract public void talk();
}

class Tiger extends Animal
{
  public String getName(String name)
  {
    this.type="tiger";
    this.name=name;
    return this.name;
  }
  public int getAge(int age)
  {
    this.age=age;
    return this.age;
  }
  public void talk()
  {
    System.out.println("Tiger roars, and says ");
    System.out.println("Hello, my name is: "+this.name+" I am "+this.age+" years old, I want to eat you");
  }
}
class Monkey extends Animal
{
  public String getName(String name)
  {
    this.type="monkey";
    this.name=name;
    return this.name;
  }
  public int getAge(int age)
  {
    this.age=age;
    return this.age;
  }
  public void talk()
  {
    System.out.println("Monkey squeaks, and says ");
    System.out.println("Hello, my name is: "+this.name+" I am "+this.age+" years old, I want that banana");
  }
}

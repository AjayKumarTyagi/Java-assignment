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
class Dog extends Animal
{
  public String getName(String name)
  {
    this.type="dog";
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
    System.out.println("Dog barks, and says ");
    System.out.println("Hello, my name is: "+this.name+" I am "+this.age+" years old, Wanna play with me?");
  }
}

class Zoo
{
  Animal animal;
  List<Animal> zoo=new ArrayList<Animal>();
  void addAnimal(Animal newAnimal)
  {
    zoo.add(newAnimal);
  }
  void displayAnimals()
  {
    for (int i=0;i<zoo.size() ;i++ ) {
      animal=zoo.get(i);
      System.out.println("Type: "+animal.type+" Name: "+animal.name);
  }
}
  void displayAnimals(String animaltype)
  {
    for (int i=0;i<zoo.size() ;i++ ) {
      animal=zoo.get(i);
      if(animaltype.equals(animal.type))
      {
        System.out.println("Type: "+animal.type+" Name: "+animal.name+" Age: "+animal.age);
      }

  }
}
  void feedingTime()
  {
    for (int i=0;i<zoo.size() ;i++ ) {
      animal=zoo.get(i);
      animal.talk();
    }
  }
}

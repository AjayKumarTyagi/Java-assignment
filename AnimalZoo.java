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

public class Main
{
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    String name="";
    int choice=0,age=0,choice2=0;
    Animal tiger=new Tiger();
    Animal monkey=new Monkey();
    Animal dog=new Dog();
    Zoo zoo=new Zoo();
    do {
      System.out.println("Welcome to the Zoo");
      System.out.println("1. Add an animal to the zoo");
      System.out.println("2. Display all animals in the zoo");
      System.out.println("3. Display name and age of animals");
      System.out.println("4. Feed animals");
      System.out.println("5. Exit the zoo");
      choice=scan.nextInt();
      switch(choice)
      {
        case 1:
        System.out.println("1. Add a tiger");
        System.out.println("2. Add a monkey");
        System.out.println("3. Add a dog");
        choice2=scan.nextInt();
        scan.nextLine();
        switch(choice2)
        {
          case 1:
          System.out.println("Enter name of the tiger: ");
          name=scan.nextLine();
          tiger.getName(name);
          System.out.println("Enter the age of the tiger: ");
          age=scan.nextInt();
          scan.nextLine();
          tiger.getAge(age);
          zoo.addAnimal(tiger);
          break;
          case 2:
          System.out.println("Enter name of the monkey: ");
          name=scan.nextLine();
          monkey.getName(name);
          System.out.println("Enter the age of the monkey: ");
          age=scan.nextInt();
          monkey.getAge(age);
          zoo.addAnimal(monkey);
          break;
          case 3:
          System.out.println("Enter name of the dog: ");
          name=scan.nextLine();
          dog.getName(name);
          System.out.println("Enter the age of the dog: ");
          age=scan.nextInt();
          dog.getAge(age);
          zoo.addAnimal(dog);
          break;
          default:
            System.out.println("invalid choice");
            break;
        }
          break;
        case 2:
        zoo.displayAnimals();
        break;
        case 3:
        System.out.println("Select the types: ");
        System.out.println("1. Tiger");
        System.out.println("2. Monkey");
        System.out.println("3. Dog");
        int typeanimal=scan.nextInt();
        switch(typeanimal)
        {
          case 1:
            zoo.displayAnimals("tiger");
            break;
          case 2:
          zoo.displayAnimals("monkey");
          break;
          case 3:
          zoo.displayAnimals("dog");
          break;
          default:
          System.out.println("invalid choice");
          break;
        }
        break;
        case 4:
        zoo.feedingTime();
        break;
        case 5:
        System.out.println("Hope you have great time, See you again!");
        System.exit(0);
        break;
        default:
        System.out.println("invalid choice");
        break;
      }
    } while (true);
  }
}


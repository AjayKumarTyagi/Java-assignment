import java.util.*;
class Account
{
  String customer_name;
  static int accno=19216800;
  int accountno;
  String typeofacc;
  double balance;
  final double ser_charge=0.00314;
  final double minbalance=5000.0;
  String type="";
  double principle;
  double rate=6.0;
Account(String name,double balance)
  {
    this.customer_name=name;
    this.accountno=accno++;
    this.balance=balance;
  }
void deposite(double amt){
    this.balance+=amt;
  }
void withdrawal(double amt){
  double temp=this.balance-amt;
  if(temp<minbalance)
  {
    this.balance-=ser_charge;
    this.balance-=amt;
  }else
  this.balance-=amt;
}
void checkBalance()
{
  System.out.println("balance remaining: "+this.balance);
}
void getInterest(double amt)
{
  principle=amt;
  double amount=principle*((1+rate/100));
  System.out.println("\nInterest after 1 year: "+amount);
  amount=principle*((1+rate/100)*(1+rate/100));
  System.out.println("Interest after 2 year: "+amount);
  amount=principle*((1+rate/100)*(1+rate/100)*(1+rate/100));
  System.out.println("Interest after 3 year: "+amount+"\n");
}
}

class sav_acc extends Account
{
  sav_acc(String name,double balance)
  {
    super(name,balance);
    this.type="saving";
  }
}

class cur_acc extends Account
{
  cur_acc(String name,double balance)
  {
    super(name,balance);
    this.type="current";
  }
  void chequewithdrawal(double amt)
  {
    double temp=this.balance-amt;
    if(temp<minbalance)
    {
      this.balance-=ser_charge;
      this.balance-=amt;
    }else
    this.balance-=amt;
  }
}

class Customer
{
  Scanner scan=new Scanner(System.in);
  Account account;
  List<Account>acc =new ArrayList<Account>();
  public void addaccount(Account newAcc)
  {
    acc.add(newAcc);
  }
  public void displayAccount()
  {
    for (int i=0;i<acc.size() ;i++ ) {
      account=acc.get(i);
      System.out.println("Type: "+account.type+" \tName: "+account.customer_name+"\nAccount no: "+account.accountno+"\t");
      account.checkBalance();
  }
  }
  public void addAmount(int no,double amt)
  {
    for (int i=0;i<acc.size() ;i++ ) {
      account=acc.get(i);
      if(no==account.accountno)
      {
        account.deposite(amt);
      }
    }
  }
  
  public void addAmount(int no,int no2,double amt)
{
  for (int i=0;i<acc.size() ;i++ ) {
    account=acc.get(i);
    if(no==account.accountno)
    {
      if(account.type=="current")
      {
        System.out.println("1. Use cash to make transaction");
        System.out.println("2. Use cheque to make transaction");
        int ans=scan.nextInt();
        switch(ans)
        {
          case 1:
          account.withdrawal(amt);
          break;
          case 2:
          account.withdrawal(amt);
          break;
          default:
          System.out.println("Invalid choice, transaction failed");
          return;
        }
      }else
      account.withdrawal(amt);
    }
  }
    for (int i=0;i<acc.size() ;i++ ) {
      account=acc.get(i);
      if(no2==account.accountno)
      {
        account.deposite(amt);
      }
}
}
  
public void takeAmonut(int no,double amt)
{
  for (int i=0;i<acc.size() ;i++ ) {
    account=acc.get(i);
    if(no==account.accountno)
    {
      account.withdrawal(amt);
    }
    else{
      System.out.println("transaction failed, account no not found");
    }
  }
}
  public void calcInterest(int no)
{
  double amt;
  for (int i=0;i<acc.size() ;i++ ) {
    account=acc.get(i);
    if(no==account.accountno) // searches for account
    {
      if(account.type.equals("current"))
      {
        System.out.println("\nthis type of account does not provide interest\n");
      }else{
      amt=account.balance;
      account.getInterest(amt);
    }}
    else{
      // if acc not found shows message
      System.out.println("transaction failed, account no not found");
    }
  }
}
}

public class Bank{
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    int no,no2;
    double amt;
    String name="";
    Account acc2;
    Account acc1;
    Customer cuss=new Customer();
    do {
      // menu driven approach
      System.out.println("Welcome to the ICICI Bank \n We see, you see, I see");
      System.out.println("1. Add an account");
      System.out.println("2. Display all accounts");
      System.out.println("3. Deposite amount");
      System.out.println("4. Withdraw amount");
      System.out.println("5. See interest on your amount");
      System.out.println("6. Exit the bank");
      int choice=scan.nextInt();
      switch(choice)
      {
        case 1:
        System.out.println("1. Current account");
        System.out.println("2. Saving account");
        int choice2=scan.nextInt();
        switch (choice2) {
          case 1:
          System.out.println("Enter name: ");
          scan.nextLine();
          name=scan.nextLine();
          System.out.println("How much money you want to add? ");
          amt=scan.nextInt();
          acc2=new cur_acc(name,amt); // calls construcctor
          cuss.addaccount(acc2); // calls method to add acc in list
          break;
              case 2:
          scan.nextLine();
          System.out.println("Enter name: ");
          name=scan.nextLine();
          System.out.println("How much money you want to add? ");
          amt=scan.nextInt();
          acc1=new sav_acc(name,amt); // calls constructor
          cuss.addaccount(acc1);  // calls method to add acc in list
          break;
          default:
          System.out.println("invalid choice, account creation failed");
          break;
        }
        break;
          case 2:
        cuss.displayAccount(); // calls method to display acc info
        break;
          case 3:
        System.out.println("1. Deposite in your account");
        System.out.println("2. Deposite in anotheer account");
        int choice3=scan.nextInt();
        switch(choice3)
        {
          case 1:
          System.out.println("What is your account number? ");
          no=scan.nextInt();
          System.out.println("How much amount? ");
          amt=scan.nextInt();
          cuss.addAmount(no,amt); // calls method to deposite amount in own acc
          break;
          case 2:
          System.out.println("What is your account number? ");
          no=scan.nextInt();
          System.out.println("How much amount? ");
          amt=scan.nextInt();
          System.out.println("Amount deposite to which account? ");
          no2=scan.nextInt();
          // polymorphism achieved
          cuss.addAmount(no,no2,amt); // calls method to deposite amount in other's acc
          break;
          default:
          System.out.println("Trancsaction failed");
          break;
        }
        break;
          case 4:
        System.out.println("Enter your bank account number: ");
        no=scan.nextInt();
        System.out.println("How much money you want to withdraw? ");
        amt=scan.nextInt();
        cuss.takeAmonut(no,amt); // calls method to search for acc and withraw money
        break;

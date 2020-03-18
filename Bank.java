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

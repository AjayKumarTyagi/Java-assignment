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

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

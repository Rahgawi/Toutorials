package eidp.excercise3;

public class Konto {

 Person accountOwner;
 private int accNumber ;
 private static int kn =1000;
 private double saldo;
 private double dispokredit;





 public Konto(Person accountOwner)
{
 this.accountOwner = accountOwner;
this.accNumber = kn++;


}



 public int getAccNumber(){

  return accNumber++;
 }

 public double getSaldo()
 {
  return saldo;
 }
 public double getDispokredit() {
  return dispokredit;
 }

 public double setDispokredit(double dispokredit) {
  if(accountOwner.age<18)
  {
   System.out.println("dispo nihct möglich!");
  }
  else{
   this.dispokredit = dispokredit;
  }
  return saldo;
 }

 public double mDeposit(double cash)
 {
  if(cash<0)
  {
   System.out.println("negativer Betrag nicht möglich!");
  }
  else
  {
    saldo += cash;
  }
  return  saldo;
 }

 public double mTakeoff(double cash)
  {
   if((cash<0)||(cash>saldo))
   {
    System.out.println("negativer Betrag nicht möglich!");
   }
   else
   {
    saldo -= cash;
   }
   return  saldo;
  }

  public void tranfer(Konto receiveracc, double cash)
  {
   saldo-= cash;
   receiveracc.saldo+= cash;

      ;
  }

 @Override
 public String toString()
 {
  return
          "accountOwner=" + accountOwner +
          ", accNumber=" + accNumber +
          ", saldo=" + saldo + '}';
 }

}


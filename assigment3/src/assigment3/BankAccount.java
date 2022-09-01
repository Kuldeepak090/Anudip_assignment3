package assigment3;


class Account{
    String name, type;   //instance variable
   int acc_no;  //instance variable
   float amount;
   void details(int an,String na,String t,float a )
   {
	   acc_no=an;
	   name=na;
	   type=t;
	   amount=a;
   }   
	   void show()
	   {
		   System.out.println(acc_no+" "+name+" "+type+" "+amount);
   }
	   void deposit(float a)
	   {
		   amount+=a;
		   System.out.println("Deposit Amount"+a);
	   }
	   void withdraw(float a)
	   {
		   if(amount<a)
		   System.out.println("Insufficient balance");
		   else
		   amount=a;
		   System.out.println("Withdraw Amount"+a);
}
	   void getbalance()
	   {
		   
		   System.out.println("Balance is"+amount);
	   }
 }
//Sub class1
class CurrentAccount extends Account{  
	Account ac1=new Account();	
}
//Sub class2
class SavingAccount extends Account
{
	
}
public class BankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

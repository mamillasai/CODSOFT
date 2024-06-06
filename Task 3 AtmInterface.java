import java.util.*;

public class AtmInterface {
    
    private static String accNum="199956497";
    private static String accPin="6666";

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
         
        System.out.println("welcome to ATM");
        System.out.println("Enter your account number:  ");
        String inputAccNum=sc.nextLine();

        System.out.println("Enter your account pin number:  ");
        String inputAccPin=sc.nextLine();
        System.out.println("Enter the initial balance $:");
        Double initialBalance =sc.nextDouble();
        UserAccount u =new UserAccount(initialBalance);
        if(authentication(inputAccNum, inputAccPin))
        {
           System.out.println("authentication successful");
        
        while(true){
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdrawn");
            System.out.println("4. Exit");
            System.out.println("Enter your choice");
            int choice=sc.nextInt();
            switch(choice){
                case 1: u.CheckBalance();
                        break;
                case 2:  System.out.println("Enter the Withdrawl amount");
                         double Depositamount=sc.nextDouble();
                         u.Deposit(Depositamount);
                         break;
                case 3: System.out.println("Enter the Withdrawl amount");
                        double Withdrwanamount=sc.nextDouble();
                        u.Withdrawn(Withdrwanamount);
                        break;
                case 4: System.out.println("Thank you for visiting the ATM!");   
                System.exit(0);
                default: System.out.println("Invalid choice...please try agian ");                     
                        }
             }
        }else{
            System.out.println("Authentication failed...please try again ");
        }
   }
   private static boolean authentication(String inputAccNum, String inputAccPin){
    return accNum.equals(inputAccNum) && accPin.equals(inputAccPin);
   }
}
   
class UserAccount{
    private static double balance;
   public UserAccount(double initialbalance) {
        //TODO Auto-generated constructor stub
        this.balance=initialbalance;
    }
static void CheckBalance()
   {
    System.err.println("your balance is $: "+balance);
   }
   static void Deposit(Double amount)
   {
    if(amount>0){
     balance+= amount;
        System.out.println("Deposited successfully " );
        System.out.println("Your account balance is $ : "+balance );
    }else{
        System.out.println("Invalid amount or Deposit failure");
    }
   }
  static void Withdrawn(Double amount)
  {
    if(amount>0 && amount<=balance){
        balance-=amount;
        System.out.println("Withdrawn successfully");
        System.out.println("Your account balance is $ : "+balance ); 
    }else{
        System.out.println("Invalid amount orinsufficient balance - Withdrawn failure");
    }
  }
}


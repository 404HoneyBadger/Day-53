import java.util.ArrayList;
import java.util.Scanner;

public class BankAccountApp {
static ArrayList<BankAccount> bankAccountArray = new ArrayList<>();


    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      //creat 3 constructors 
    
      var Mary =new BankAccount(300, "Mary", 10003);
      
      while (true){
    System.out.println("Welcome to Banco Popular!");
    System.out.println("Are you an exsiting customer? (Press 0 to exit)");
    System.out.println("1 for Yes");
    System.out.println("2 for No");
    String yesOrNo = scanner.nextLine();

    if (yesOrNo.equals("1")) {
    System.out.println("Please enter the account number of the account you'd like to access");

    for (BankAccount bankAccount : bankAccountArray) {
    System.out.println(bankAccount.getName() + ": "+ bankAccount.getAccountN());
    } 
    String userBankNumInput = scanner.nextLine();
    int accountBankNum = Integer.parseInt(userBankNumInput);

    BankAccount currentAccount=null;
    for (BankAccount bankAccount : bankAccountArray) {
      if (accountBankNum==bankAccount.getAccountN()){
      currentAccount = bankAccount;
      }
    }
    if(currentAccount==null){
    currentAccount = new BankAccount();
      
      System.out.println("To better serve our customers, Banco Popular has implemented a new security feature to reduce fraud. Please answer the following questions. \nWhat is the account holder's name? ");
      String name = scanner.nextLine();
      currentAccount.setName(name);
      System.out.println("What is the balance?");
      String accountBalance = scanner.nextLine();
      currentAccount.setBalance(Double.parseDouble(accountBalance));
      currentAccount.setAccountN(accountBankNum);
      bankAccountArray.add(currentAccount);
    } 
    mainMenu(currentAccount);
  }

    else if (yesOrNo.equals("2")) {
      BankAccount newAccount = new BankAccount();
      int SetAccountNum = Mary.accountN + 1;
      System.out.println("Let's make a new account \nWhat is the name for the new account? ");
      String name = scanner.nextLine();
      newAccount.setName(name);
      System.out.println("What is the initial balance?");
      String accountBalance = scanner.nextLine();
     newAccount.setBalance(Double.parseDouble(accountBalance));
     System.out.println("Youre new account number is: " + SetAccountNum);

      bankAccountArray.add(new BankAccount());

      (bankAccountArray.get(bankAccountArray.size()-1)).setAccountN(bankAccountArray.size()-1);
      (bankAccountArray.get(bankAccountArray.size()-1)).setName(name);
      (bankAccountArray.get(bankAccountArray.size()-1)).setBalance(Double.parseDouble(accountBalance));
      System.out.println(bankAccountArray);
    }else if (yesOrNo.equals("0")){
      System.out.println("Thank you for banking at Banco Popular!");
      break;
    }else {
      System.out.println("Invalid entry, Bank App restart");
    }}}
    
  public static void mainMenu(BankAccount currAccount) {
    var Cheri = new BankAccount(2000, "Cheri", 10001);

    while (true) {
    Scanner scanner= new Scanner(System.in);
    System.out.println("Hello " + currAccount.getName());
    System.out.println("Main Menu");
    System.out.println("1 <- Balance \n2 <- Withdrawl \n3 <- Deposit \n4 <- Transfer");
    String response = scanner.nextLine();
    if(response.equals("1")){
      System.out.println(currAccount.getBalance());
    }else if(response.equals("2")){
      System.out.println("Your current balance is: "+ currAccount.accountBalance + "\n Enter amount to withdraw");
      String withdraw = scanner.nextLine();
      double withdrawD = Double.parseDouble(withdraw);
      currAccount.withdrawal(withdrawD);
      System.out.println("Your new account balance is: " + currAccount.accountBalance);
    }else if(response.equals("3")){
      System.out.println("Your current balance is: "+ currAccount.accountBalance + "\n Enter amount to deposit");
      String deposit = scanner.nextLine();
      double depositD = Double.parseDouble(deposit);
      currAccount.deposit(depositD);
      System.out.println("Your new account balance is: " + currAccount.accountBalance);
    }else if(response.equals("4")){
      System.out.println("Enter the amount you want to transfer:");
      String sumString= scanner.nextLine();
      double sum = Double.parseDouble(sumString);
      System.out.println("Choose the account that will recieve funds");
      String otherAccount = scanner.nextLine();  
      
      currAccount.transfer( Cheri, sum);
      System.out.println("You have sucessfully transferred $" + Double.toString(sum) + " to account " + otherAccount + "\nNew balance for your account  " + currAccount.accountN + " is: "+ Double.toString(currAccount.accountBalance)  + "\nNew balance for account " + otherAccount + " is: " + Double.toString(Cheri.accountBalance) );
    
    }
  }
}
}


// String answer= "no";
      
// while(answer.equals("no")){
// System.out.println("Please enter your bank password >.>");
// String password = scanner.nextLine();
// System.out.println("Please enter your license number >.>");
// String license = scanner.nextLine();
// System.out.println("Please enter your social security number >.>");
// String ssNumber = scanner.nextLine();
// System.out.println("Please verify this is the correct information by entering 'yes' or 'no':");
// System.out.println("Password: " + password + "\nLicense number: " + license + "\nSocial security number: " + ssNumber );
// // System.out.println("License number: " + license);
// // System.out.println("Social security number: " + ssNumber);
// answer = scanner.nextLine();
// if (answer.equals("yes")){
//   System.out.println("You still here? We done wiped out your accounts and opened about 100k in credit already. \nThank you for banking at Banco Popular!");
//  }
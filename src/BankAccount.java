public class BankAccount {


  public static BankAccount otherAccount;
  public double accountBalance;
  public String name;
  public int accountN;

  public BankAccount(int accountBalance1, String name1, int accountN1) {
     
      this.accountBalance = accountBalance1;
      this.name = name1;
      this.accountN = accountN1;
  }

  public BankAccount(){}

  public double deposit(double cashDeposit) {
      return this.accountBalance += cashDeposit;
  }

  public double withdrawal(double cashWithd) {
      return this.accountBalance -= cashWithd;
  }

  public String getName(){
      return this.name;
}
  public void setName(String setName){
      name = setName;
  }

  public double getBalance(){
      return this.accountBalance;
  }
  public void setBalance(double setBalance){
      accountBalance = setBalance;
  }

  public void setAccountN(int setAccountN){
      accountN = setAccountN;
  }

  public int getAccountN(){
      return this.accountN;
  }

  public void transfer(BankAccount otherAccount, double sum){
      accountBalance -= sum;
      otherAccount.accountBalance += sum;
  }

  @Override
  public String toString(){
      return name + "'s account balance: " + accountBalance;
  }
}
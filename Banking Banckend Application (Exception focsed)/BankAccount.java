public class BankAccount {
    final private int accountNumber;
    private static int nextAccountNumber =1001;
    private String accountHolderName;
    private double balance;


    public BankAccount(String accountHolderName, double balance){
      if(accountHolderName.isBlank()){
         throw new IllegalArgumentException("Accountholder name cannot be Null");
      }
     if(balance<0){
        throw new InvalidAmountException("Balance cannot be less than 0");
     }
        this.balance = balance;


      this.accountHolderName = accountHolderName;
      accountNumber=nextAccountNumber;
        nextAccountNumber++;

    }

    public int getAccountNumber() {
      return accountNumber;
   }

    public String getAccountHolderName() {
       return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
      if (accountHolderName.isBlank()){
         throw new IllegalArgumentException("Name cannot be empty");
      }
       this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
       return balance;
    }

    public void deposit(double amount){
      if( amount<=0){
         throw new InvalidAmountException("Deposit Unsuccessfull! Please Chose an amount more than zero.");
      }
         balance +=amount;
    }

    public void withdraw (double amount){
      if(amount<=0){
         throw new InvalidAmountException("withdraw unsuccessfull. Amount cannot be 0 or less than 0.");
      }
      if( amount > balance){
         throw new InsufficientBalanceException("withdraw unseccessfull. Insufficient balance!");
      }
      balance -= amount;
      }

      public void transfer(BankAccount receiver, double amount){
         if(receiver == null){
            throw new IllegalArgumentException("Reciever cannot be null");
         }
         if( receiver.accountNumber == this.accountNumber){
            throw new IllegalArgumentException("Account numbers are same. cannot perform the transfer.");
         }
         this.withdraw(amount);
         receiver.deposit(amount);

      }
      public void display(){
         System.out.println("------------------");
         System.out.println("Account Number: "+getAccountNumber());
         System.out.println("Name: "+getAccountNumber());
         System.out.println("Balance: "+getBalance());
      }
    }


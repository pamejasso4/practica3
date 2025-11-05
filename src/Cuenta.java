import java.util.Date;

public class Cuenta {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    


    public Cuenta(){
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
        this.dateCreated = new Date();

    }
    public Cuenta(int id, double balance){
     this.id = id;
     this.balance = balance;
     this.annualInterestRate= 0;
     this.dateCreated = new Date();
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance; 
    }

    public double getAnnualInterestRate(){
        return annualInterestRate;

    }

    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }


    public Date getdateCreated(){
        return dateCreated;

    }

    public double getMonthlyInterestRate(){
        return (annualInterestRate/100) /12 ;
    }

    public double getMonthlyInterest(){
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double amount){
        balance -=amount;

    }

    public void deposit(double amount){
        balance += amount;
    }

}

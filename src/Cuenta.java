import java.sql.Date;

public class Cuenta {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;
    private double cantidad;


    public void CrearCuenta(){
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
        this.dateCreated = newDate();

    }
    public void cuenta(int id, double balance){
     this.id = 0;
     this.balance = 0;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }


    public Date getdateCreated(){
        return dateCreated;

    }

    public double getMonthlyInterestRate(){
        return getMonthlyInterestRate();
    }

    public String getMonthlyInterest(){
        return (balance * annualInterestRate/12)/100 + "%";
    }

    public double getwithdraw(){
        return cantidad;
    }

    public double deposit(){
        return cantidad = 3000;


    }


}

public class App {
    public static void main(String[] args) throws Exception {
       Cuenta cuenta1 = new Cuenta(1122, 20000);
       cuenta1.setAnnualInterestRate(4.5); 
       
       cuenta1.withdraw(2500);
       cuenta1.deposit(3000);
       
       
       
        System.out.println("Saldo actual: $" + cuenta1.getBalance());
        System.out.println("Interés mensual: $" + cuenta1.getMonthlyInterest());
        System.out.println("Cuenta creada en: "+ cuenta1.getdateCreated());
    }
}



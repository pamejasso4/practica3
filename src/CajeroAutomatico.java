import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        Cuenta[] cuentas = new Cuenta[10];
        for (int i = 0; i < cuentas.length; i++) {
            cuentas[i] = new Cuenta(i, 100);
        }

        
        while (true) {
            System.out.print("Ingrese una identificación (0-9): ");
            int id = input.nextInt();

            
            if (id < 0 || id > 9) {
                System.out.println("ID inválido\n");
                continue; 
            }

            Cuenta cuentaActual = cuentas[id];
            int opcion = 0;

            
            do {
                System.out.println("\n MENÚ");
                System.out.println("1. Ver saldo");
                System.out.println("2. Retirar dinero");
                System.out.println("3. Depositar dinero");
                System.out.println("4. Salir");
                System.out.print("Seleccione una opción: ");
                opcion = input.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Saldo actual: $" + cuentaActual.getBalance());
                        break;

                    case 2:
                        System.out.print("Cantidad a retirar: $");
                        double retiro = input.nextDouble();
                        cuentaActual.withdraw(retiro);
                        System.out.println("Retiro exitoso. Nuevo saldo: $" + cuentaActual.getBalance());
                        break;

                    case 3:
                        System.out.print("Cantidad a depositar: $");
                        double deposito = input.nextDouble();
                        cuentaActual.deposit(deposito);
                        System.out.println("Depósito exitoso. Nuevo saldo: $" + cuentaActual.getBalance());
                        break;

                    case 4:
                        System.out.println("Se ha cerrado la sesión\n");
                        break;

                    default:
                        System.out.println("Opción inválida.");
                        break;
                }
            } while (opcion != 4); 
        }
    }
}

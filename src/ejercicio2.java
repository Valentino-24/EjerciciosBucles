import java.util.Scanner;
public class ejercicio2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cantEmpleados,horas;
        int tarifa=15;
        System.out.println("Ingrese la cantidad de empleados: ");
        cantEmpleados=sc.nextInt();
        for (int i=1;i<=cantEmpleados;i++){
            System.out.println("Ingrese las horas trabajadas del empleado "+i+".");
            horas=sc.nextInt();
            System.out.println("El salario del empleado "+i+" es de $"+horas*tarifa);
        }
    }
}

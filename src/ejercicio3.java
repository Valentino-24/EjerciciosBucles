import java.util.Scanner;
public class ejercicio3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int cantProductos,i,stock;
        System.out.println("Ingrese la cantidad de productos: ");
        cantProductos=sc.nextInt();
        i=1;
        while(i<=cantProductos){
            System.out.println("Ingrese la cantidad disponible del producto "+i+": ");
            stock=sc.nextInt();
            if (stock<5){
                System.out.println("El stock del producto "+i+" es menor de 5 unidades. Es necesario realizar un pedido.");
            }
            i++;
        }
    }
}

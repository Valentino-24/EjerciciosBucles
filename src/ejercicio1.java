import java.util.Scanner;
public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] actividades = {"estudiar", "hacer ejercicio", "leer", "su tiempo libre"};
        int total=0;

        for (String actividad:actividades){
            System.out.println("Ingrese las horas dedicadas a "+actividad+": ");
            int horas=sc.nextInt();
            total += horas;
        }

        System.out.println("Su tiempo total dedicado es de "+total+" horas.");
    }
}
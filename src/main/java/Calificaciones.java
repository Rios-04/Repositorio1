import java.util.Scanner;

public class Califiaciones {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int opcion = teclado.nextInt();

        while (opcion != 3) {
            System.out.println("=====================================");
            System.out.println("      CONTROL DE CALIFICACIONES");
            System.out.println("=====================================");
            System.out.println("1. Registrar calificaciones");
            System.out.println("2. Mostrar estadisticas");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");



        switch (opcion) {
            case 1:
                //Registrar calificaciones//

                break;

            case 2:
               //Mostrar estadisticas//
                break;

            case 3:
                //Salir//
                break;

            default:
                //Opcion no valida//
                break;
        }

        teclado.close();
    }
}

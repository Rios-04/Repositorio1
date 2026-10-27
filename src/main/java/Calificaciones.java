import java.sql.SQLOutput;
import java.util.Scanner;

public class Calificaciones {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        int aprobados=0;
        int reprobados=0;
        double SumaPromedios =0;

        while (opcion != 3) {
            System.out.println("=====================================");
            System.out.println("      CONTROL DE CALIFICACIONES");
            System.out.println("=====================================");
            System.out.println("1. Registrar calificaciones");
            System.out.println("2. Mostrar estadisticas");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    //Registrar calificaciones//
                    System.out.println("==============");
                    System.out.println("REGISTRAR ESTUDIANTE");
                    System.out.println("==============");
                    System.out.println("¿CUÁNTOS ESTUDIANTES REGISTRAS?");
                    int cantidad = teclado.nextInt();
                    teclado.nextLine();

                    for(int i=1; i <=cantidad ;i++)
                    {
                        System.out.println("Nombre:");
                        String nombre = teclado.nextLine();
                        System.out.println("Evaluación 1:");
                        int calf1 = teclado.nextInt();
                        System.out.println("Evaluación 2");
                        int calf2 = teclado.nextInt();
                        System.out.println("Evaluación 3");
                        int calf3 = teclado.nextInt();
                        teclado.nextLine();

                        double promedio = (calf1+calf2+calf3)/3;
                        System.out.println("Promedio : ",promedio);
                        if (promedio>=6)
                        {
                            System.out.println("APROBADO");
                            aprobados++;
                        }
                        else{
                            System.out.println("REPROBADO");
                            reprobados++;
                        }
                    }

                    break;

                case 2:
                    //Mostrar estadisticas//
                    break;

                case 3:
                    System.out.println("Fin del programa");
                    break;

                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }

    }
}

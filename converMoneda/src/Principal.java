import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner moneda = new Scanner(System.in);
        System.out.println("Introduzca precio mondea Moneda: ");
        double cantidad = moneda.nextDouble();
        System.out.println("instrusca el precio: ");
        double precio = moneda.nextDouble();


        double total = cantidad * precio;
        System.out.println(total);



       int opcion = 0; // tocar

        String menu = """
                Escribe la opcion de cambio de desea realizar
                1) Dolar =>> Pesp argentino
                2) Peso argentino =>> Dolar
                3) Dolar =>> Real Brasileño
                4) Real Brasileño =>> Dolar
                5) Dolar =>> Peso colombiano
                6) Peso colombiano =>> Dolar
                7) Salir
                """;
        Scanner teclado = new Scanner(System.in);
        while (opcion != 7) {
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Dolar =>> Pesp argentino");

                    break;
                case 2:
                    System.out.println("Peso argentino =>> Dolar");
                    break;
                case 3:
                    System.out.println("Dolar =>> Real Brasileño");
                    break;
                case 4:
                    System.out.println("Real Brasileño =>> Dolar");
                    break;
                case 5:
                    System.out.println("Dolar =>> Peso colombiano");
                    break;
                case  6:
                    System.out.println("Peso colombiano =>> Dolar");
                    break;
                case  7:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Opcion no Valida");

            }

        }
    }
}

import java.util.Scanner;

public class UI {
    private Calc calc;

    public UI() {
        calc = new Calc();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Elija una operación: suma, resta, multiplicacion, salir");
            String operacion = scanner.nextLine();

            if (operacion.equals("salir")) {
                break;
            }

            System.out.println("Ingrese el primer número:");
            int n1 = scanner.nextInt();
            System.out.println("Ingrese el segundo número:");
            int n2 = scanner.nextInt();
            scanner.nextLine(); // Clear the buffer

            int resultado = 0;

            switch (operacion) {
                case "suma":
                    resultado = calc.suma(n1, n2);
                    break;
                case "resta":
                    resultado = calc.resta(n1, n2);
                    break;
                case "multiplicacion":
                    resultado = calc.multiplicacion(n1, n2);
                    break;
                default:
                    System.out.println("Operación no reconocida.");
                    continue;
            }

            System.out.println("El resultado es: " + resultado);
        }

        scanner.close();
    }

    public static void main(String[] args) {
        UI ui = new UI();
        ui.start();
    }
}

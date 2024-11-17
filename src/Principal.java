import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ExchangerateAPI exchange = new ExchangerateAPI();
        MostrarResultados display = new MostrarResultados();
        Monedas result = null;

        var menuOpciones = """
                *****************************************
                Sea bienvenido/a al Conversor de Moneda =]
                
                1) Dolar =>> Peso argentino
                2) Peso argentino =>> Dolar
                3) Dolar =>> Real brasileno
                4) Real brasileno =>> Dolar
                5) Dolar =>> Peso colombiano
                6) Peso colombiano =>> Dolar
                7) Salir
                Elija una opcion valida
                *****************************************
                """;

        while (true) {
            System.out.println(menuOpciones);
            var busqueda = lectura.nextLine().trim();

            if (busqueda.equals("7")) {
                System.out.println("Terminó la operación.");
                break;
            }

            System.out.println("Ingrese el monto que desea convertir:");

            String montoInput = lectura.nextLine().trim();

            if (montoInput.isEmpty()) {
                System.out.println("Por favor ingrese un monto.");
                continue;
            }

            if (montoInput.isEmpty()) {
                System.out.println("Por favor ingrese un monto.");
                continue;
            }

            double amount;

            try {
                amount = Double.parseDouble(montoInput);
                if (amount <= 0) {
                    System.out.println("Por favor ingrese un número mayor a 0.");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Número inválido. Por favor ingrese un valor numérico.");
                continue;
            }

            switch (busqueda) {
                case "1":
                    result = exchange.tipoDeMoneda("USD", "ARS", amount);
                    break;
                case "2":
                    result = exchange.tipoDeMoneda("ARS", "USD", amount);
                    break;
                case "3":
                    result = exchange.tipoDeMoneda("USD", "BRL", amount);
                    break;
                case "4":
                    result = exchange.tipoDeMoneda("BRL", "USD", amount);
                    break;
                case "5":
                    result = exchange.tipoDeMoneda("USD", "COP", amount);
                    break;
                case "6":
                    result = exchange.tipoDeMoneda("COP", "USD", amount);
                    break;
                default:
                    System.out.println("Opción inválida. Por favor ingrese un número válido.");
                    continue;
            }

            if (result != null) {
                display.mostrar(result);
            }
        }

        lectura.close();
    }
}


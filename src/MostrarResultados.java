public class MostrarResultados {
    public void mostrar(Monedas result){
        if (result == null){
            System.out.println("No se pudo realizar la conversion. Por favor intentar nuevamente");
            return;
        }
        System.out.println(result);
    }
}

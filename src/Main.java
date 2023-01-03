import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List listaVehiculos = new ArrayList();
        listaVehiculos.add(new Vehiculo("Merce des","E",55));
        listaVehiculos.add(new AutoBus("Mercedes","M20",100,20));
        listaVehiculos.add(new Turismo("BMW","525",50,4));
        listaVehiculos.add(new Turismo("Audi","A4",55,4));
        listaVehiculos.add(new AutoBus("Mercedes","M10",120,30));
        listaVehiculos.add(new Turismo("VW","Passat",35,4));
        listaVehiculos.add(new Turismo("Audi","A3",30,2));
        listaVehiculos.add(new Turismo("Mercedes","E",60,4));
        listaVehiculos.add(new Vehiculo("Audi","A3",30));
        imprimirLista((ArrayList)listaVehiculos);
    }



    private static void imprimirLista(ArrayList lista){
        for (int i = 0;i<lista.size();i++ ){
            Vehiculo v = (Vehiculo)lista.get(i);
            v.ImprimirAtributos();
            System.out.println("");
        }
    }
}

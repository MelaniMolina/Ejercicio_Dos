public class AutoBus extends Vehiculo {
      private int numPlazas;

    public AutoBus(String marca, String modelo,double precioAlquiler, int numPlazas) {
        super(marca, modelo,precioAlquiler);
        setPlazas(numPlazas);
    }
    public void setPlazas(int numPlazas){
        this.numPlazas = numPlazas;
    }
    public void ImprimirAtributos(){
        super.ImprimirAtributos();
        System.out.println("\t"+"Plazas: "+numPlazas);
    }
}

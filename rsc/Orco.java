public class Orco extends Bestias {


    private static int contadorInstancias;

    public Orco(String nombre){
        super(300,45,nombre);
        Orco.contadorInstancias++;
    }
    
    public static int getInstancias(){
        return Orco.contadorInstancias;
    }
}

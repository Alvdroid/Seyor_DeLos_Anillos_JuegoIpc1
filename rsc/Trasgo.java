public class Trasgo extends Bestias{

    private static int contadorInstancias;

    public Trasgo(String nombre){
        super(325,46,nombre);
        Trasgo.contadorInstancias++;
    }
 
    public static int getInstancias(){
        return Trasgo.contadorInstancias;
    }
}

public class Bestias extends Personaje {


    private static int instanciasBestias;

    public Bestias(int vida, int armadura,int ataqueMaximo, String nombre){
        super(vida, armadura, ataqueMaximo, nombre, false);
        Bestias.instanciasBestias++;
    }

    public static int getInstancias(){
        return Bestias.instanciasBestias;
    }
    
}

public class Bestias extends Personaje {


    private static int instanciasBestias;

    public Bestias(int vida, int armadura, String nombre){
        super(vida, armadura, 90,nombre, false);
        Bestias.instanciasBestias++;
    }

    public static int getInstancias(){
        return Bestias.instanciasBestias;
    }
    
}

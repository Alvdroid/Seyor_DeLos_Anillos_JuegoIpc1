public class Heroes extends Personaje {

    private static int instanciasHeroes;

    public Heroes(int vida, int armadura,int ataqueMaximo, String nombre){
        super(vida, armadura, ataqueMaximo, nombre, true);
        Heroes.instanciasHeroes++;
    }

    public static int getInstancias(){
        return Heroes.instanciasHeroes;
    }
    
}

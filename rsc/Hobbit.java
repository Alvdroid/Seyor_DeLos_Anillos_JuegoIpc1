public class Hobbit extends Heroes {

    private int ataqueMaximo;
    private static int contadorInstancias;

    /** constructor */
    public Hobbit(String nombre, int ataqueMaximo){
        super(200, 40, ataqueMaximo, nombre);
        this.ataqueMaximo = ataqueMaximo;
        Hobbit.contadorInstancias++;
    }
    
    public static int getInstancias(){
        return Hobbit.contadorInstancias;
    }
    public int getArmadura(){
        return 45;
    }
    public int getAtaque(){
        return ataqueMaximo;
    }
}

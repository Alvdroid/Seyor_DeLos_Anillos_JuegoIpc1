public class Trasgo extends Bestias{

    private int ataqueMaximo;
    private static int contadorInstancias;

    public Trasgo(String nombre, int ataqueMaximo){
        super(325, 30, ataqueMaximo, nombre);
        this.ataqueMaximo = ataqueMaximo;
        Trasgo.contadorInstancias++;
    }
 
    public static int getInstancias(){
        return Trasgo.contadorInstancias;
    }
    public int getArmadura(){
        return 75;
    }
    public int getAtaque(){
        return ataqueMaximo;
    }
}

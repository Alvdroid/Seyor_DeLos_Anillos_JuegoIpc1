public class Orco extends Bestias {

    private int ataqueMaximo;
    private static int contadorInstancias;

    public Orco(String nombre, int ataqueMaximo){
        super(300,45, ataqueMaximo, nombre);
        this.ataqueMaximo = ataqueMaximo;
        Orco.contadorInstancias++;
    }
    
    public static int getInstancias(){
        return Orco.contadorInstancias;
    }
    public int getArmadura(){
        return 45;
    }
    public int getAtaque(){
        return ataqueMaximo;
    }
}

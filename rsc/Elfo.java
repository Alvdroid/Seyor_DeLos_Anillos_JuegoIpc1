public class Elfo extends Heroes {

    private int ataqueMaximo;
    private static int contadorInstancias;

    public Elfo(String nombre, int ataqueMaximo){
        super(250, 60, ataqueMaximo, nombre);
        this.ataqueMaximo = ataqueMaximo;
        contadorInstancias++;
    }
    public static int getInstancias(){
        return contadorInstancias;
    }   
    public int getArmadura(){
        return 45;
    }
    public int getAtaque(){
        return ataqueMaximo;
    }
}

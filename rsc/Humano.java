public class Humano extends Heroes {

    private int ataqueMaximo;
    private static int contadorInstancias;

    public Humano(String nombre, int ataqueMaximo){
        super(180,75, ataqueMaximo, nombre);
        this.ataqueMaximo = ataqueMaximo;
        Humano.contadorInstancias++;
    }

    public static int getInstancias(){
        return contadorInstancias;
    }   
    public int getArmadura(){
        return 75;
    }
    public int getAtaque(){
        return ataqueMaximo;
    }
}

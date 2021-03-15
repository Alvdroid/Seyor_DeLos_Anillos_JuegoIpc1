public class Hobbit extends Heroes {

    private static int contadorInstancias;

    /** constructor */
    public Hobbit(String nombre){
        super(200, 40, nombre);
        Hobbit.contadorInstancias++;
    }
    
    public static int getInstancias(){
        return Hobbit.contadorInstancias;
    }
    
}

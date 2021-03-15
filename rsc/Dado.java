public class Dado {

    public Dado(){
    }

    public static int tirarDado(int valorMinimo, int valorMaximo, int cantDados){
        int dado;
        int resultado = valorMinimo;
        for (int i = 1; i <= cantDados; i++) {
            dado =(int) Math.floor(Math.random()*(valorMaximo-valorMinimo+1)+valorMinimo);
            if (resultado < dado)
                resultado = dado;
        }
        return resultado;
    }
    
}

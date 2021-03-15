import java.util.Scanner;

public class juego {
        Scanner scan = new Scanner(System.in);

    private Bestias ejercitoBestias[];
    private Heroes ejercitoHeroes[];

    private final int CANTIDAD = 5;

    //private int contadorHumanos;
    
    public juego(){
    
    
        ejercitoBestias = new Bestias[CANTIDAD];
        ejercitoHeroes = new Heroes[CANTIDAD];
    }

    public void presentarPersonajes(Personaje ejercito[]){

        if (ejercito.length> 0 ){
            String tempo = "";
            if (ejercito[0] instanceof Bestias){
                tempo = "Bestia";
            }
            else{
                tempo = "Heroe";
            }

            System.out.println("\nPresentando ejercito de "+tempo);
            //ejemplo con operador ternario
            /**System.out.println("\nPresentando ejercito de "+
                            (ejercito[0] instanceof Bestias?"Bestias":"Herores")
                            );**/

            for (int i = 0; i < ejercito.length; i++) {
                ejercito[i].saludar();
            }

        }
        else {
            System.out.println("No hay un ejercito ");
        }
    }

    public void jugar(){
        System.out.println("Bienvenido al juego del señor de los anillos: \n\n");
        
        this.inicializarHeroes();
        this.inicializarBestias();

        this.presentarPersonajes(ejercitoBestias);
        this.presentarPersonajes(ejercitoHeroes);
        
    }

    public void inicializarHeroes(){
        int random = 0;
        for (int i = 0; i < ejercitoHeroes.length; i++) {
            random = Dado.tirarDado(0, 2, 1);
            switch (random) {
                case 0:
                    ejercitoHeroes[i] = new Humano("Humano "+Humano.getInstancias());
                    break;
                case 1:
                    ejercitoHeroes[i] = new Elfo("Elfo "+Elfo.getInstancias());
                    break;
                case 2:
                    ejercitoHeroes[i] = new Hobbit("Hobbit "+Hobbit.getInstancias());
                    break;
            }
        }
    }

    public void inicializarBestias(){
        int random = 0;
        for (int i = 0; i < ejercitoBestias.length; i++) {
            random = Dado.tirarDado(0, 1, 1);
            switch (random) {
                case 0:
                    ejercitoBestias[i] = new Orco("Orco "+Orco.getInstancias());
                    break;
                case 1:
                    ejercitoBestias[i] = new Trasgo("Trasgo "+Trasgo.getInstancias());
                    break;
            }
        }
    }
}

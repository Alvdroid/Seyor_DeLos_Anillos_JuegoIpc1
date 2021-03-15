import java.util.Scanner;

public class juego {

    Scanner scan = new Scanner(System.in);

    private Bestias ejercitoBestias[];
    private Heroes ejercitoHeroes[];

    private int NUMEJERCITOS;

    //private int contadorHumanos;
    
    public juego(){

        System.out.println("Ingrese la catidad de integrantes para los 2 ejercitos");
        System.out.println("Siendo el un maximo de 6 y minimo de 1");
        NUMEJERCITOS = scan.nextInt();
        ejercitoBestias = new Bestias[NUMEJERCITOS];
        ejercitoHeroes = new Heroes[NUMEJERCITOS];
        
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
        System.out.println("Bienvenido al juego del señor de los anillos:\n");

        if(NUMEJERCITOS > 0 && NUMEJERCITOS < 7){
                
        
        
        this.inicializarHeroes();
        this.inicializarBestias();

        this.presentarPersonajes(ejercitoBestias);
        this.presentarPersonajes(ejercitoHeroes);
        this.pelea();

            }
        else{
            System.out.println("Numero de ejercitos no permitidos");
        }
    }

    public void inicializarHeroes(){
        int random = 0;
        for (int i = 0; i < ejercitoHeroes.length; i++) {
            random = Dado.tirarDado(0, 2, 1);
            switch (random) {
                case 0:
                    ejercitoHeroes[i] = new Humano("Humano numero "+(Humano.getInstancias()+1), Dado.tirarDado(0, 100, 2));
                    break;
                case 1:
                    ejercitoHeroes[i] = new Elfo("Elfo numero "+(Elfo.getInstancias()+1), Dado.tirarDado(0, 100, 2));
                    break;
                case 2:
                    ejercitoHeroes[i] = new Hobbit("Hobbit numero "+(Hobbit.getInstancias()+1), Dado.tirarDado(0, 100, 2));
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
                    ejercitoBestias[i] = new Orco("Orco numero "+(Orco.getInstancias()+1), Dado.tirarDado(0, 90, 2));
                    break;
                case 1:
                    ejercitoBestias[i] = new Trasgo("Trasgo numero "+(Trasgo.getInstancias()+1), Dado.tirarDado(0, 90, 2));
                    break;
            }
        }
    }

    public void pelea(){
        int contadorPelea=1;
        int resultadoPelea;
        for (int z = 0; z < NUMEJERCITOS; z++){
            System.out.println("\n    --------Pelea " + contadorPelea + " --------");

            if(ejercitoHeroes[z].getNombre() == "Elfos numero " && ejercitoBestias[z].getNombre() == "Orcos numero"){
                if((ejercitoHeroes[z].getAtaque()) > (ejercitoBestias[z].getArmadura())){
                    resultadoPelea = (((ejercitoHeroes[z].getAtaque())+((ejercitoHeroes[z].getAtaque()) / 10)) - (ejercitoBestias[z].getArmadura()));
                    System.out.println("Aumentando nivel de rabia para Elfos");
                    primeraPelea(z, resultadoPelea);
                    
                    
                    if((ejercitoBestias[z].getAtaque()) > (ejercitoHeroes[z].getArmadura())){    
                        regresarPelea(z, resultadoPelea);
                    }else{
                        System.out.println(ejercitoBestias[z].getNombre() + " no regreso ataque porque el ataque es menor a la armadura del oponente");
                    }
                }else{
                    System.out.println("No hay daño porque el ataque de " + ejercitoHeroes[z].getNombre() + " es menor a la armadura del oponente " + ejercitoBestias[z].getNombre());
                }
            }
            else{
                if(ejercitoHeroes[z].getNombre() == "Hobbit numero " && ejercitoBestias[z].getNombre() == "Trasgo numero"){
                        resultadoPelea = (((ejercitoHeroes[z].getAtaque())-5 )) - (ejercitoBestias[z].getArmadura());
                        System.out.println("Disminuyendo nivel de potencia ofenciva para Hobbit");
                    if((ejercitoHeroes[z].getAtaque()) > (ejercitoBestias[z].getArmadura())){
                        primeraPelea(z, resultadoPelea);
                        
                        if((ejercitoBestias[z].getAtaque()) > (ejercitoHeroes[z].getArmadura())){    
                            regresarPelea(z, resultadoPelea);
                        }else{
                            System.out.println(ejercitoBestias[z].getNombre() + " no regreso ataque porque el ataque es menor a la armadura del oponente");
                        }
                    }else{
                        System.out.println("No hay daño porque el ataque de " + ejercitoHeroes[z].getNombre() + " es menor a la armadura del oponente " + ejercitoBestias[z].getNombre());
                        }
                }else{          
            if((ejercitoHeroes[z].getAtaque()) > (ejercitoBestias[z].getArmadura())){
                resultadoPelea = (ejercitoHeroes[z].getAtaque()) - (ejercitoBestias[z].getArmadura());
                primeraPelea(z, resultadoPelea);
                
                if((ejercitoBestias[z].getAtaque()) > (ejercitoHeroes[z].getArmadura())){    
                    regresarPelea(z, resultadoPelea);
                }else{
                    System.out.println(ejercitoBestias[z].getNombre() + " no regreso ataque porque el ataque es menor a la armadura del oponente");
                }
            }else{
                System.out.println("No hay daño porque el ataque de " + ejercitoHeroes[z].getNombre() + " es menor a la armadura del oponente " + ejercitoBestias[z].getNombre());
            }

        }
            contadorPelea++;
            }
        }
    }
    public void regresarPelea(int z, int resultadoPelea){
        if((ejercitoBestias[z].getAtaque()) > (ejercitoHeroes[z].getArmadura())){    
            resultadoPelea = (ejercitoBestias[z].getAtaque()) - (ejercitoHeroes[z].getArmadura());
            System.out.println("\n" + ejercitoBestias[z].getNombre() + " regreso ataque a " + ejercitoHeroes[z].getNombre());
            System.out.println("Resultado de pelea entre " + ejercitoBestias[z].getNombre() + " y " + ejercitoHeroes[z].getNombre() + ":");
            int vidaResultado2 = ((ejercitoBestias[z].getVida()) - (resultadoPelea));

            System.out.println("Vida de " + ejercitoBestias[z].getNombre() +" es de " + vidaResultado2);
            System.out.println("Vida de " + ejercitoHeroes[z].getNombre() +" es de " + ejercitoHeroes[z].getVida());
        }else{
            System.out.println(ejercitoBestias[z].getNombre() + " no regreso ataque porque el ataque es menor a la armadura del oponente");
        }
    }
    public void primeraPelea(int z, int resultadoPelea){
                     System.out.println(ejercitoHeroes[z].getNombre() + " ataco a " + ejercitoBestias[z].getNombre());
                    System.out.println("Resultado de pelea entre " + ejercitoHeroes[z].getNombre() + " y " + ejercitoBestias[z].getNombre() + ":");
                    int vidaResultado = ((ejercitoBestias[z].getVida()) - (resultadoPelea));

                    System.out.println("Vida de " + ejercitoBestias[z].getNombre() +" es de " + vidaResultado);
                    System.out.println("Vida de " + ejercitoHeroes[z].getNombre() +" es de " + ejercitoHeroes[z].getVida());
        
    }
}

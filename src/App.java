/* suma numeros */
public class App {
    public static void main(String[] args) throws Exception {
        
        /* ejercicio suma de numeros */
        Suma(3,3,4);

       /* ejercicio coche */
        Coche miCoche = new Coche(4);
        miCoche.agregarPuerta(1);
        miCoche.mostrarPuertas();
    }

    /* funcion de suma */
    public static void Suma(int numero, int numero2, int numero3){
        int resultado= numero + numero2 + numero3;
        System.out.println(resultado);
    }

}

/* clase coche */

    class Coche{
       public int puertas;

        public Coche(int puertas){
            this.puertas=puertas;
        }
        public void agregarPuerta(int puerta){
             this.puertas = this.puertas + puerta;
        }
        public void mostrarPuertas(){
            System.out.println(puertas);
        }
     }
    
    
    
    

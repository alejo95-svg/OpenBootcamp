public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int total = suma(a,b,c);                               
        System.out.println("la suma es: "+ total);

        coche miCoche = new coche();
        miCoche.SumaPuertas();
        System.out.println("las puertas del coche son: "+ miCoche.Npuertas);

    }
    
    public static int suma (int a, int b, int c){
        return a+b+c;
    }
}

class coche {
    public int Npuertas = 0;

    public void SumaPuertas (){
        this.Npuertas++;
    }

}

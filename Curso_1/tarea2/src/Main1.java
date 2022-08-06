
public class Main1 {
    public static void main(String[] args) {
        //Declaracion de variables
        int numeroIf = -15;
        String condicion;
        int numeroWhile = 0;

        System.out.println();

        //Ciclo If
        if (numeroIf > 0) {
            condicion = "positivo";
        }
        else {
            condicion = "negativo";
        }
        System.out.println("el numero " + numeroIf+ " es " + condicion);
        //Fin Ciclo If

        // Ciclo While
        while(numeroWhile < 3){
            numeroWhile +=1;
            System.out.println("el numero es: " + numeroWhile);
        }
        //Fin Ciclo While

        //Ciclo Do While
        do{
            numeroWhile = 3;
            System.out.println("el numero es: " + numeroWhile);
        }
        while(numeroWhile < 3);
        //Fin Ciclo Do While

        //Ciclo For
        for(int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println("el numero es: " + numeroFor);
        }
        //Fin Ciclo For

        //Ciclo Switch
        int estacion = 0;
        switch (estacion){
            case 0:
                System.out.println("Estamos en Invierno");
                break;
            case 1:
                System.out.println("Estamos en Primavera");
                break;
            case 2:
                System.out.println("Estamos en Verano");
                break;
            case 3:
                System.out.println("Estamos en Otoño");
                break;
            default:
                System.out.println("No existe una estacion para este valor de variable");
        }







    }

    
}
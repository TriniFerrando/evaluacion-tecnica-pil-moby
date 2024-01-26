package main.java.com.pil.moby.evaluacion_tecnica.primer_cuestionario;

//Primera Evaluación (mes 1)
public class EvaluacionTecnicaPil {
    public static void main(String[] args) {
        imprimirBienvenidaEvaluacionTecnica();

        int IntegerNumber=10;
        double DecimalNumber=5.3;
        byte ByteNumber=120;

        imprimirConsigna(1);
        System.out.println("Numero entero: " + IntegerNumber);
        System.out.println("Numero decimal: " + DecimalNumber);
        System.out.println("Numero byte: " + ByteNumber + "\n");

        imprimirConsigna(2);
        int sum = IntegerNumber + 1000;
        int difference = IntegerNumber - 5;
        System.out.println("Suma= " + sum + ", Difference= " + difference + "\n");


        imprimirConsigna(3);
        //punto A
        if (IntegerNumber > DecimalNumber) {
            System.out.println("El integer es mas grande que el double: " + IntegerNumber);
        } else {
            System.out.println("Error. El integer NO es mas grande que el double");
        }

        //punto B
        System.out.println("Valor inicial: " + IntegerNumber);
        while (IntegerNumber <= ByteNumber) {
            IntegerNumber *= 2;
        }
        System.out.println("Valor final: " + IntegerNumber);

        //punto C
        int iterations = IntegerNumber/3;
        for(int i=0; i<iterations; i++){
            System.out.println("Iteracion: " + (i+1));
        }
    }

    private static void imprimirBienvenidaEvaluacionTecnica() {
        System.out.println("*******************************************");
        System.out.println("Bienvenidos a la primera Evaluación Técnica." + "\n" + "Les deseamos muchos éxitos!");
        System.out.println("*******************************************\n");
    }
    private static void imprimirConsigna(int numeroConsigna) {
        System.out.println("**********");
        System.out.println("CONSIGNA " + numeroConsigna);
        System.out.println("**********\n");
    }

}
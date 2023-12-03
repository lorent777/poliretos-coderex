package Figuras;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Ingrese el numero de elementos: ");
        int tamanioFigura = reader.nextInt();

        Figura1Asteristico oFigura1 = new Figura1Asteristico();
        System.out.println("\n[ Figura 1 ] - Cuadrado con asterísticos(*): ");
        oFigura1.CuadroConAsteriscos(tamanioFigura);

        Figura2AteriscoMas oFigura2 = new Figura2AteriscoMas();
        System.out.println("\nFigura del cuadrado con For (*+): ");
        oFigura2.AteriscoMasCuadradoFor(tamanioFigura);

        Figura5Piramide oFigura5 = new Figura5Piramide();
        System.out.println("\nFigura piramide invertida con(*):");
        oFigura5.Piramideasterisco(tamanioFigura);
        System.out.println();

        Figura6TrianguloLleno oFigura6 = new Figura6TrianguloLleno();
        System.out.println("\n[Figura 6 ]- Triángulo lleno con asteriscos(*) : ");
        oFigura6.TrianguloLleno(tamanioFigura);

        Figura7EscalerasIzq oFigura7 = new Figura7EscalerasIzq();
        System.out.println("\nEscaleras hacia la izquierda: ");
        oFigura7.EscalerasIzqFor(tamanioFigura);
        System.out.println();

        Figura10Escalera oFigura10 = new Figura10Escalera();
        System.out.println("\nEscalera con dos patrones: ");
        oFigura10.Escalera(tamanioFigura);
        System.out.println();

        Figura12TrianguloInvertido oFigura12 = new Figura12TrianguloInvertido();
        System.out.println("\nTriangulo con numeros invertido: ");
        oFigura12.TrianguloInvertido(tamanioFigura);
        System.out.println();

        Figura15EscaleraPascal oFigura15 = new Figura15EscaleraPascal();
        System.out.println("\nEscalera de Pascal: ");
        oFigura15.Pascal(tamanioFigura);
        System.out.println();

        Figura17NumerosX oFigura17 = new Figura17NumerosX();
        System.out.println("\nNumeros en X: ");
        oFigura17.NumerosX(tamanioFigura);

        
        reader.close();
    }
}

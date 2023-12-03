package CadenaCaracteres;

import java.util.Scanner;

public class App {
        public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        Cadena1Contarvocales oCadena1 = new Cadena1Contarvocales();
        System.out.print("Ingresa una frase: ");
        String fraseingresada = reader.nextLine();
        oCadena1.contarvocal(fraseingresada);
        System.out.println();

        Cadena3EliminarVocal oCadena3 = new Cadena3EliminarVocal();
        System.out.println("Elimina vocales de una palabra");
        System.out.print("Ingresa una vocal: ");
        String vocal = reader.nextLine();
        System.out.print("Ingrese una palabra: ");
        String palabra = reader.nextLine();
        oCadena3.EliminarVocal(vocal, palabra);
        System.out.println();

        Cadena6FraseinvertidaCaps oCadean6 = new Cadena6FraseinvertidaCaps();
        System.out.print("Ingresa una frase: ");
        String fraseoriginal = reader.nextLine();
        oCadean6.InversoYmayuscula(fraseoriginal);
        System.out.println();

        Cadena4EliminarLetra oCadena4 = new Cadena4EliminarLetra();
        System.out.print("Elimina las letras repetidas de la frase: \n");
        oCadena4.EliminarLetra();
        System.out.println();

        System.out.println("\nJuego de los anagramas");
        Cadena8Anagramas oCadena8 = new Cadena8Anagramas();
        oCadena8.Anagramas();
        System.out.println();

        Cadena9LetrasAlternantes oCadena9 = new Cadena9LetrasAlternantes();
        oCadena9.LetrasAlternantes();
        System.out.println();
        
        reader.close();

        }
}

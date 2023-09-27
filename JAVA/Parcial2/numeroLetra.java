package Parcial2;
import java.util.Scanner;
import org.apache.commons.lang3.text.WordUtils;
import org.apache.commons.lang3.text.WordUtils;
import org.apache.commons.lang3.text.translate.NumberTranslator;
import org.apache.commons.lang3.text.translate.Translate;


public class numeroLetra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese numero a convertir: ");
        int number = scanner.nextInt();

        String words = convertToWords(number);
        System.out.println(words);
    }


    public static String convertToWords(int number) {
        return WordUtils.capitalizeFully(EnglishNumberToWords.convert(number));
    }
}
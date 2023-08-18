package Lab1;

//este codigo muestra la cantidad de letras que quedan de la frase "Ejemplo de ejercicio para la GLORIOSA UFG" si le quitamos las vocales minuslas y mayusculas.
public class miPensamiento {

public static void main(String[] args) {
    String miPensamiento = "Ejemplo de ejercicio para la GLORIOSA UFG";
    String dato = "aeiouAEIOU";
    int miVariable = 0;
        
    for (char c: miPensamiento.toCharArray()) { 
        if (dato.contains(String.valueOf(c))) {
            miVariable++;
 }
            else

        System.out.println("El valor es " + miVariable);
}
}
}

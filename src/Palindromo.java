import java.util.Stack;

public class Palindromo {
    public static void main(String[] args) {

        String palavra = "arara";
        int baixo = 0;
        int cima = palavra.length() - 1;
        boolean isPalindromo = true;

        while (baixo < cima) {
            if(palavra.charAt(baixo) != palavra.charAt(cima)){
                isPalindromo = false;
            }
            baixo++;
            cima--;
        }

        System.out.println(isPalindromo ? "É um palindromo" : "Não é um palindromo");


    }
}

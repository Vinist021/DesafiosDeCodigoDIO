package desafios.primeiro;

import java.util.Scanner;

public class KeywordsETiposPrimitivos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int idade = scanner.nextInt();

        if(idade < 18){
            System.out.println("Menor de idade");
        }
        else if(idade <= 64){
            System.out.println("Maior de idade");
        }
        else{
            System.out.println("Idoso");
        }

        scanner.close();
    }
}

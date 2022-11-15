import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*
Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
1. "Telefonou para a vítima?"
2. "Esteve no local do crime?"
3. "Mora perto da vítima?"
4. "Devia para a vítima?"
5. "Já trabalhou com a vítima?"
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
"Cúmplice" e 5 como "Assassina". Caso contrário, ele será classificado como "Inocente".
*/

public class CulpadoCrime {
    public static void main(String[] args) throws Exception {
        
        Scanner leia = new Scanner(System.in);
        List<String> perguntasSobreUmCrime = new ArrayList<>();

        perguntasSobreUmCrime.add("Telefonou para a vítima? ");
        perguntasSobreUmCrime.add("Esteve no local do crime? ");
        perguntasSobreUmCrime.add("Mora perto da vítima? ");
        perguntasSobreUmCrime.add("Devia para a vítima? ");
        perguntasSobreUmCrime.add("Já trabalhou com a vítima? ");

        Iterator<String> iterator = perguntasSobreUmCrime.iterator();
        int quantidadeSim = 0;
        System.out.println(" ");

        while (iterator.hasNext()) {

            String next = iterator.next();
            System.out.print(next); 
            char resposta = leia.next().charAt(0);
            if (resposta == 's') quantidadeSim += 1;
        }

        System.out.println(" ");
        System.out.print("Classificação: ");
        switch (quantidadeSim) {

            case 1:
                System.out.println("Inocente"); break;
            case 2:
                System.out.println("Suspeita"); break;
            case 3:
            case 4:
                System.out.println("Cúmplice"); break;
            case 5:
                System.out.println("Assassina"); break;
        }
        leia.close();
    }
}
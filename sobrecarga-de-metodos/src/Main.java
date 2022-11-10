import java.io.Console;
import java.util.Locale;
import java.util.Scanner;

// ATENÇÃO: primeira versão do código. Melhorias ainda serão implementadas.
public class Main {

    public static void main(String[] args) throws Exception {
        
        Quadrilateros calculoArea = new Quadrilateros();
        Scanner leia = new Scanner(System.in).useLocale(Locale.US);
        Console espera = System.console();

        while (true) {

            System.out.println("\n    CÁLCULO DE ÁREAS\n");
            System.out.println("      (1) Quadrado\n      (2) Retângulo\n      (3) Trapézio\n      (0) Sair\n");
            System.out.print("Opção: ");
            int opcao = leia.nextInt();

            switch (opcao) {

                case 1:  
                    System.out.print("Lados(L), em cm: ");
                    double lados = leia.nextDouble();
                    System.out.println("A área do QUADRADO é = " + calculoArea.calcularArea(lados) + " cm²");
                    System.out.print("\n Pressione <ENTER> para continuar...");
                    espera.readLine();
                    break;                 
                case 2:
                    System.out.print("Base(B), em cm: ");
                    double base = leia.nextDouble();
                    System.out.print("Altura(A): ");
                    double altura = leia.nextDouble();
                    System.out.println("A área do RETÂNGULO é = " + calculoArea.calcularArea(base, altura) + " cm²");
                    System.out.print("\n Pressione <ENTER> para continuar...");
                    espera.readLine();  
                    break;                  
                case 3:                   
                    System.out.print("Base maior(B1), em cm: ");
                    double base1 = leia.nextDouble();
                    System.out.print("Base menor(b2), em cm: ");
                    double base2 = leia.nextDouble();
                    System.out.print("Altura(A), em cm: ");
                    double altura2 = leia.nextDouble();
                    System.out.println("A área do TRAPÉZIO é = " + calculoArea.calcularArea(base1, base2, altura2) + " cm²");
                    System.out.print("\n Pressione <ENTER> para continuar...");
                    espera.readLine();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Erro: Opção inválida!\n");
                    break;
            }

            if (opcao == 0) {

                leia.close();
                break;
            }
        }

        System.out.println("Sucesso: Execução terminada.");
    }
}
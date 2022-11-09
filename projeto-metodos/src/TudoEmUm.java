import com.tabajara.calculadora.ModuloCalculadora;

import com.tabajara.emprestimo.ModuloEmprestimo;

import com.tabajara.mensagem.Saudacoes;

import java.util.Scanner;

import java.util.Locale;

/*
 * ATENÇÃO!
 * 
 * O tratamento de exceções ainda não foi implementado,
 * portanto, poderá apresentar Exceptions caso um valor
 * de tipo incorreto seja inserido em alguma entrada.
 */

public class TudoEmUm {

    public static void main(String[] args) {    
        
        Saudacoes mensagem = new Saudacoes();
        
        try (Scanner ler = new Scanner(System.in).useLocale(Locale.US);) {

            do {
                String saudacao = mensagem.saudacao();
                String data = mensagem.dataAtual();
                String hora = mensagem.horaAtual();

                System.out.println("\n====================================");
                System.out.println("********** TUDO-EM-UM APP **********");
                System.out.println("====================================");
                System.out.println("            Menu Inicial            ");
                System.out.println("------------------------------------");
                System.out.println("\n          1 - Calculadora\n          2 - Empréstimos\n          0 - Sair\n");
                System.out.println(hora + "     " + saudacao + "   " + data);
                System.out.println("------------------------------------");
                
                System.out.print("Escolha uma opção: ");
                int opcao = ler.nextInt();

                switch (opcao) {

                    case 1:
                        ModuloCalculadora.calcular();
                        break;
                    case 2:
                        ModuloEmprestimo.emprestimo();
                        break;
                    case 0:
                        System.out.print("Deseja sair? [S/n] ");
                        char sair = ler.next().charAt(0);

                        if (sair == 's') break;
                        else if (sair == 'n') {

                            opcao = 1;
                            break;

                        }
                    default:
                        System.out.println("\nErro: opção inválida!");
                        break;

                }

                if (opcao == 0) break;

            } while (true);

            System.out.println("\nSucesso: Execução terminada.");

        }        
    }    
}
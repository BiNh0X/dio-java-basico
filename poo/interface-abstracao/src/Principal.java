import com.empresa.administrativo.Funcionario;
import com.empresa.vendas.Cliente;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {
        
        // Implementação de interface.

        Cliente cliente = new Cliente();
        Scanner leia = new Scanner(System.in);

        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Endereço: " + cliente.getEndereco());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Idade: " + cliente.getIdade());

        System.out.println("");

        // Abstração, herança.
        
        Funcionario funcionario = new Funcionario();

        System.out.println("****** CADASTRO DE FUNCIONÁRIO *******\n");
        System.out.print("Digite o nome: ");
        String nome = leia.nextLine();
        funcionario.setNome(nome);

        System.out.print("Digite o cargo: ");
        String cargo = leia.nextLine();
        funcionario.setCargo(cargo);

        System.out.print("Setor: ");
        String setor = leia.nextLine();
        funcionario.setSetor(setor);

        System.out.print("Matrícula: ");
        int matricula = leia.nextInt();
        funcionario.setMatricula(matricula);

        System.out.println("");

        System.out.println("Cargo: " + funcionario.getCargo() + "\nNome : " 
        + funcionario.getNome() + "\nSetor: " + funcionario.getSetor() 
        + "\nMatrícula: " + funcionario.getMatricula());
        System.out.println("Funcionário cadastrado com sucesso.");
        leia.close();
    }
}
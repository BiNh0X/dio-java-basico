import com.empresa.vendas.Faxineiro;
import com.empresa.vendas.Funcionario;
import com.empresa.vendas.Gerente;
import com.empresa.vendas.Vendedor;

import edu.fabio.polimorfismo.ClasseFilha1;
import edu.fabio.polimorfismo.ClasseFilha2;
import edu.fabio.polimorfismo.ClassePai;

public class Main {
    public static void main(String[] args) throws Exception {
       
        ClassePai[] classes = new ClassePai[] {new ClasseFilha1(), new ClasseFilha2(), new ClassePai()};

        for (ClassePai classe : classes) {

            classe.metodo1();
        }

        System.out.println("");

        for (ClassePai classe : classes) {

            classe.metodo2();
        }

        System.out.println("");

        ClasseFilha2 classeFilha2 = new ClasseFilha2();
        classeFilha2.metodo2();
       
        /* 
        Exercício 2 - Parte 1

        // Criando normalmente um Objeto.
        Funcionario funcionario = new Funcionario();

        // Utilizando o upcast.
        Funcionario faxineiro = new Faxineiro();
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();

        // Utilizando o downcast (gera uma Exception)
        Gerente gerente_ = (Gerente) new Funcionario();
        */
    }
}
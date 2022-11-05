public class MeuSalario {

    public static void main(String[] args) {
        
     double salarioMensal = 1200.53;
     double mediaSalario = 1250.89;
     int quantidadeDependentes = 1;
     int mediaDependentes = 2;
     
     System.out.println(("Salário Mensal x Dependentes = " + ((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes))));

     boolean salarioBaixo = (salarioMensal < mediaSalario);
     boolean muitosDependentes = (quantidadeDependentes >= mediaDependentes);

     // Pode-se também fazer assim:
     if (salarioBaixo && muitosDependentes) {

        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
        System.out.println("Auxilio aprovado? " + recebeAuxilio);

     }
     else {

        System.out.println("Auxilio negado.");

     }

    }
    
}

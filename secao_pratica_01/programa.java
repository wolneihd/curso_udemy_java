package secao_pratica_01;

import secao_pratica_01.entities.Empresa;
import secao_pratica_01.entities.Endereco;
import secao_pratica_01.entities.Funcionario;
import secao_pratica_01.enums.Cargo;

public class programa {
    public static void main(String[] args) {
        
        Empresa empresa = new Empresa("Rio Art", new Endereco("Rua Frederico Jense",4992,"Blumenau","SC"));

        empresa.adicionarFuncionario(new Funcionario(1,"Wolnei Hellmann Dircksen", 3500.00, Cargo.ANALISTA));   
        empresa.adicionarFuncionario(new Funcionario(2,"Antônio José de Almeida", 2700.00, Cargo.DESENVOLVEDOR));    
        
        empresa.getEndereco().mostrarEndereco();
        empresa.getEndereco().setNumero(125);
        empresa.getEndereco().setRua("Rua XV de Novembro");
        empresa.getEndereco().mostrarEndereco();

        empresa.listarFuncionarios();

        empresa.atualizarSalarioFuncionario(1, 4000.00);
        empresa.removerFuncionario(2);

        empresa.listarFuncionarios();
    }
}

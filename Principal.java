import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Principal {
    private List<Funcionario> funcionarios;

    public static void main(String[] args) {
        Principal principal = new Principal();

    }

    public Principal() {
        this.funcionarios = new ArrayList<>();
    }

    public void cadastrarFuncionario(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
    }

    public void exibirFuncionarios() {
        if (funcionarios.isEmpty()) {
            System.out.println("A lista de funcionários está vazia.");
        } else {
            System.out.println("Lista de Funcionários:");
            for (Funcionario funcionario : funcionarios) {
                System.out.println(funcionario);
            }
        }
    }

    public void novoFuncionario(String nome, LocalDate dataNascimento, double salario, String funcao) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome(nome);
        funcionario.setDataNascimento(dataNascimento);
        funcionario.setSalario(salario);
        funcionario.setFuncao(funcao);
        this.cadastrarFuncionario(funcionario);
    }

    
}

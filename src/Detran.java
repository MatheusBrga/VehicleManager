import java.util.HashMap;
import java.util.Map;

public class Detran {
    private Map<String, Veiculo> veiculosCadastrados;
    private Map<String, Proprietario> proprietariosCadastrados;

    public Detran(){
        this.veiculosCadastrados = new HashMap<>();
        this.proprietariosCadastrados = new HashMap<>();
    }

    public void cadastrarProprietario(Proprietario p){
        if(!proprietariosCadastrados.containsKey(p.getCpf())){
            proprietariosCadastrados.put(p.getCpf(), p);
            System.out.println("Proprietario cadastrado!\n");
        } else {
            System.out.println("Erro: CPF já cadastrado!\n");
        }
    }

    public void cadastrarVeiculo(String cpf, Veiculo v){
        if(proprietariosCadastrados.containsKey(cpf)){
            if(!veiculosCadastrados.containsKey(v.getPlaca())){
                proprietariosCadastrados.get(cpf).adicionarVeiculo(v);
                veiculosCadastrados.put(v.getPlaca(), v);
                System.out.println("Veiculo cadastrado com sucesso!\n");
            } else {
                System.out.println("Erro: Placa já cadastrada!\n");
            }
        } else{
            System.out.println("Erro: CPF não encontrado!\n");
        }
    }

    public void buscarVeiculoPorPlaca(String placa){
        if(veiculosCadastrados.containsKey(placa)){
            veiculosCadastrados.get(placa).exibirDetalhes();
        } else {
            System.out.println("Veículo não encontrado!");
        }
    }

    public void buscarVeiculoPorProprietario(String cpf){
        if(proprietariosCadastrados.containsKey(cpf)){
            proprietariosCadastrados.get(cpf).exibirVeiculos();
        } else{
            System.out.println("Proprietario não encontrado!\n");
        }
    }
}

import java.util.ArrayList;

public class Proprietario {
    private String nome;
    private String cpf;
    private ArrayList<Veiculo> veiculos;

    public Proprietario(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
        this.veiculos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void adicionarVeiculo(Veiculo v){
        veiculos.add(v);
        System.out.println("Veículo adicionado!");
    }

    public void exibirVeiculos(){
        for(Veiculo v: veiculos){
            System.out.println("Veículo de " + getNome());
            v.exibirDetalhes();
        }
    }
}

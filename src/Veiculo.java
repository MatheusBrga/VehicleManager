public class Veiculo {
    private String marca;
    private String modelo;
    private String placa;
    private int ano;

    public Veiculo(String marca, String modelo, String placa, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public String getPlaca(){
        return placa;
    }

    public int getAno(){
        if(ano > 0){
            return ano;
        } else {
            System.out.println("Ano incorreto!");
        }
        return 0;
    }

    public void exibirDetalhes(){
        System.out.println("\n======================");
        System.out.println("INFORMAÇÕES DO VEICULO");
        System.out.println("======================\n");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Placa: " + placa);
        System.out.println("Ano: " + ano+ "\n");

    }
}

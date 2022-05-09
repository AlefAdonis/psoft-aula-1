
public class Produto {

    private String id;
    private String nome;
    private String fabricante;

    public Produto(String nome, String fabricante){
        this.nome = nome;
        this.fabricante = fabricante;
        this.id = nome + "0001";
    }

    public String getId(){
        return this.id;
    }

    public String getNome(){
        return this.nome;
    }

    @Override
    public String toString(){
        return "Id: " + this.id +
                "\nNome: " + this.nome +
                "\nFabricante: " + this.fabricante;

    }
}

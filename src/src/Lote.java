public class Lote {

    private String id;
    private Produto produto;
    private int quantidade;

    public Lote(Produto produto, int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
        this.id = "8080" + produto.getId();
    }

    @Override
    public String toString(){
        return "Id: " + this.id +
                "\nTipo do Produto: " + this.produto.getNome() +
                "\nQuantidade: " + this.quantidade;
    }
}

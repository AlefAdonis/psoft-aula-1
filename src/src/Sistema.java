import java.util.Scanner;

public class Sistema {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        String fabricante = sc.nextLine();
        int quantidade = sc.nextInt();
        Produto p = new Produto(nome, fabricante);
        Lote l1 = new Lote(p, quantidade);

        System.out.println("--Produto--");
        System.out.println(p.toString());
        System.out.println("\n--Lote--");
        System.out.println(l1.toString());
    }
}

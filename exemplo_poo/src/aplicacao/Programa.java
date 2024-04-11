package aplicacao;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
	Scanner teclado = new Scanner (System.in);
	Produto produto = new Produto();
	
	System.out.println ("Informe o produto que será cadastrado: ");
	Produto.produto = teclado.next();
	
	System.out.println ("Informe a quantidade: ");
	Produto.quantidade = teclado.nextDouble();
	
	System.out.println ("Informe o preço individual: ");
	Produto.preco = teclado.nextDouble();
	
	teclado.close();
	
	System.out.println ("Confirmação: " + produto.produto + "Estoque atual: " + produto.quantidade + "Preço:" +produto.preco);
	
	System.out.println ("Deseja inserir mais produto? Quantos: ");
	int estoque=teclado.nextInt();
	
	produto.addProduto(estoque);
	
	System.out.println ("Atualização: " +produto.produto + ", Estoque atual: " +produto.quantidade + produto.quantidade + "Preço: " +produto.preco);
	
	System.out.println ("Atualmente, alguma venda foi realizada? ");
	estoque=teclado.nextInt();
	produto.subProduto(estoque);
	
	System.out.println ("Atualização pós vendas: " +produto.produto+ "Estoque atual: " +produto.quantidade+ ", Preço: " +produto.preco);
	teclado.close();
}
}

package aplicacao;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
	Scanner teclado = new Scanner (System.in);
	Produto produto = new Produto();
	
	System.out.println ("Informe o produto que ser� cadastrado: ");
	Produto.produto = teclado.next();
	
	System.out.println ("Informe a quantidade: ");
	Produto.quantidade = teclado.nextDouble();
	
	System.out.println ("Informe o pre�o individual: ");
	Produto.preco = teclado.nextDouble();
	
	teclado.close();
	
	System.out.println ("Confirma��o: " + produto.produto + "Estoque atual: " + produto.quantidade + "Pre�o:" +produto.preco);
	
	System.out.println ("Deseja inserir mais produto? Quantos: ");
	int estoque=teclado.nextInt();
	
	produto.addProduto(estoque);
	
	System.out.println ("Atualiza��o: " +produto.produto + ", Estoque atual: " +produto.quantidade + produto.quantidade + "Pre�o: " +produto.preco);
	
	System.out.println ("Atualmente, alguma venda foi realizada? ");
	estoque=teclado.nextInt();
	produto.subProduto(estoque);
	
	System.out.println ("Atualiza��o p�s vendas: " +produto.produto+ "Estoque atual: " +produto.quantidade+ ", Pre�o: " +produto.preco);
	teclado.close();
}
}

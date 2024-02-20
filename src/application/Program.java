package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidade.Produto;
import entidade.ProdutoImportado;
import entidade.ProdutoUsado;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat  sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Produto> list = new ArrayList<>();
		
		System.out.println("Entre com o número de produtos a serem lidos");
		int n = sc.nextInt();
		
		for(int i =0;i<n;i++) {
			System.out.println("Dados do produto #"+(i+1)+":");
			System.out.print("comum, usado ou importado (c,u,i)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Preço: ");
			Double preco = sc.nextDouble();
			
			if(ch=='i') {
				System.out.print("Taxa: ");
				Double taxa = sc.nextDouble();
				Produto prod = new ProdutoImportado(nome,preco,taxa);
				prod.precototal();
				list.add(prod);
			}else if(ch =='u') {
				System.out.print("Informe a data de fabricação: ");
				Date fabricacao = sdf.parse(sc.next());
				Produto prod = new ProdutoUsado(nome,preco,fabricacao);
				prod.precototal();
				list.add(prod);	
			}else {
				Produto prod = new Produto(nome,preco);
				prod.precototal();
				list.add(prod);
			}
			
		}
		
		
		System.out.println();
		System.out.println("ETIQUETAS: ");
		System.out.println("<------------------------------>");
		
		for(Produto prod : list) {
			System.out.println(prod.getNome()+" - R$"+ String.format("%.2f" ,prod.precototal()));
		}
		
		sc.close();

	}

}

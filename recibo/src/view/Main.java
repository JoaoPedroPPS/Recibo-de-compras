package view;
import recibo.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ItemVenda leite = new ItemVenda("Leite", 7.50,3);
		ItemVenda pao = new ItemVenda("Pão Francês", 3.49,7);
		ItemVenda coca = new ItemVenda("Coca-Cola", 5.50,2);
		
		Venda venda = new Venda("07/05/2022", "13:00");
		venda.addItem(leite);
		venda.addItem(pao);
		venda.addItem(coca);
		
		System.out.print(venda);

	}

}

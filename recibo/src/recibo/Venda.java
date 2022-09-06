package recibo;
import java.util.ArrayList;
public class Venda {
String data;
String hora;
double total = 0;
ArrayList<ItemVenda> listaCompra = new ArrayList<>();

public void addItem(ItemVenda item) {
    listaCompra.add(item);
}

public double calculaTotal() {
    for(ItemVenda i : listaCompra) {
        total += i.subTotal();
    }
    return total;
}

public void removeItem(ItemVenda item) {
    listaCompra.remove(item);
}

public Venda(String data, String hora) {
    
    this.data = data;
    this.hora = hora;
}

public void setData(String data) {
    this.data = data;
}

public String getData() {
    return this.data;
}

public void setHora(String hora) {
    this.hora = hora;
}
public String getHora() {
    return this.hora;
}

public String formataListaCompra() {
    String format = " ";
    for(ItemVenda i : listaCompra) {
        format += i.toString();
    }
    return format;
}
@Override
public String toString() {
    return "Data: " + this.getData() + "\nHora: " + this.getHora() + 
    		"\nlista de Compras:\n" + this.formataListaCompra() + 
    		"\nTotal= " + this.calculaTotal();
}

}
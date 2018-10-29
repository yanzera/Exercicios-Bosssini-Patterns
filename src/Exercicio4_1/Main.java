package Exercicio4_1;

import java.util.Iterator;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		Object[][] pares = new String[][] { { "BMW", "Mercedes", "Fiat", "Toyota", "Audi", "Honda" }, { "X6", "CLK 230", "Palio", "Corolla", "A4", "Civic" } };

		
		@SuppressWarnings("rawtypes")
		Map mapa = new NovoMapa(pares);

		
		for (@SuppressWarnings("rawtypes")
		Iterator iter = mapa.entrySet().iterator(); iter.hasNext();) {
			@SuppressWarnings("rawtypes")
			Map.Entry entry = (Map.Entry) iter.next();
			System.out.println(entry.getKey() + " ==> " + entry.getValue());
		}
	}
}

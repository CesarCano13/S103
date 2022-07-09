package n1exercici1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		Month mes1 = new Month("Enero");
		Month mes2 = new Month("Febrero");
		Month mes3 = new Month("Marzo");
		Month mes4 = new Month("Abril");
		Month mes5 = new Month("Mayo");
		Month mes6 = new Month("Junio");
		Month mes7 = new Month("Julio");
		Month mes9 = new Month("Septiembre");
		Month mes10 = new Month("Octubre");
		Month mes11 = new Month("Noviembre");
		Month mes12 = new Month("Diciembre");

		Month mes8 = new Month("Agosto");

		// ArrayList
		ArrayList<Month> meses = new ArrayList<Month>();

		meses.add(mes1);
		meses.add(mes2);
		meses.add(mes3);
		meses.add(mes4);
		meses.add(mes5);
		meses.add(mes6);
		meses.add(mes7);
		meses.add(mes9);
		meses.add(mes10);
		meses.add(mes11);
		meses.add(mes12);

		meses.add(7, mes8);

		for (int i = 0; i < meses.size(); i++) {
			System.out.println(meses.get(i).getNom());
		}
		System.out.println("*************************************************");

		// HashSet y añadimos los objetos de meses
		HashSet<Month> mesesha = new HashSet<Month>(meses);

		// Imprimir con iterador
		Iterator<Month> it = mesesha.iterator();

		while (it.hasNext()) {
			String nomMeses = it.next().getNom();
			System.out.println(nomMeses);
		}
		System.out.println("*************************************************");

		/*
		 * //Imprimir con for each for (Month month : mesesha) {
		 * System.out.println(month.getNom()); }
		 */

	}

}

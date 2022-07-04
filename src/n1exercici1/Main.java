package n1exercici1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		Month mes1 = new Month("enero");
		Month mes2 = new Month("febrero");
		Month mes3 = new Month("marzo");
		Month mes4 = new Month("abril");
		Month mes5 = new Month("mayo");
		Month mes6 = new Month("junio");
		Month mes7 = new Month("julio");
		Month mes9 = new Month("septiembre");
		Month mes10 = new Month("octubre");
		Month mes11 = new Month("noviembre");
		Month mes12 = new Month("diciembre");

		Month mes8 = new Month("agosto");

		// ArrayList
		ArrayList<Month> meses = new ArrayList<Month>();

		meses.add(mes1);
		meses.add(mes2);
		meses.add(mes3);
		meses.add(mes4);
		meses.add(mes5);
		meses.add(mes6);
		meses.add(mes7);
		meses.add(mes8);
		meses.add(mes9);
		meses.add(mes10);
		meses.add(mes11);
		meses.add(mes12);

		for (int i = 0; i < meses.size(); i++) {
			System.out.println(meses.get(i).getNom());
		}

		// HashSet ME PERMITE DUPLICADOS
		Set<Month> mesesha = new HashSet<Month>();

		mesesha.add(mes1);
		mesesha.add(mes2);
		mesesha.add(mes3);
		mesesha.add(mes4);
		mesesha.add(mes5);
		mesesha.add(mes6);
		mesesha.add(mes7);
		mesesha.add(mes8);
		mesesha.add(mes9);
		mesesha.add(mes10);
		mesesha.add(mes11);
		mesesha.add(mes12);

		System.out.println(mesesha);

	}

}

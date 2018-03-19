package com.ipartek.formacion.capitulo3;

public class ComprarMesas {

	public static void main(String[] args) {
		System.out.println("Listado de mesas");
		System.out.println("****************");

		Mesa m1 = new Mesa();
		Mesa m2 = new Mesa(1);
		Mesa m3 = new Mesa(-3);

		m1.setNumeroPatas(-2);

		System.out.println(m1.toString());
		System.out.println(m1);
		System.out.println(m2);
	}

}

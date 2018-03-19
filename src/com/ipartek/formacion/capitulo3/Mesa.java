//1.Definicion package
package com.ipartek.formacion.capitulo3;

//2.Imports 

//3.Definicion de la Clase
public class Mesa {
	final int PRECIO_PATA = 1;
	final int PRECIO_M2 = 5;
	final int PRECIO_MATERIAL_MADERA = 4;
	final int PRECIO_MATERIAL_ACERO = 8;
	final int PRECIO_MATERIAL_ALUMINIO = 10;
	final int PRECIO_MATERIAL_PLASTICO = 2;
	final int PRECIO_COLOR_CUSTOM = 23;
	final String PRECIO_COLOR_NAME_CUSTOM = "CustomName";

	final int MATERIAL_MADERA = 1;
	final int MATERIAL_ACERO = 2;
	final int MATERIAL_ALUMINIO = 3;
	final int MATERIAL_PLASTICO = 4;

	// 4.Atributos (siempre PRIVATE para mantener la encapsulación)
	private int numeroPatas;
	private int dimension;
	private String color;
	private int material;

	///////// 5.Metodos //////////

	// 5.1 Constructores
	public Mesa() {
		super();
		this.numeroPatas = 4;
		this.color = "Blanco";
		this.dimension = 1;
		this.material = 1;
	}

	public Mesa(int numeroPatas) {
		super();
		// this.numeroPatas = numeroPatas;
		setNumeroPatas(numeroPatas);
	}

	// 5.2 Getters & Setters
	public int getNumeroPatas() {
		return numeroPatas;
	}

	public void setNumeroPatas(int numeroPatas) {

		this.numeroPatas = (numeroPatas < 0) ? 0 : numeroPatas;
	}
	// 5.3 Otros

	@Override
	public String toString() {
		return "Mesa [numeroPatas=" + numeroPatas + "]";
	}

	// Comentario de linea
	/* Comentario de bloque */

	/**
	 * Sirve para documentar
	 * 
	 */

}

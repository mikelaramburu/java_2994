package com.ipartek.formacion.capitulo3;

// Comentario de linea
/* Comentario de bloque */

/**
 * Sirve para documentar
 * 
 */

// 1.Definicion package

// 3.Definicion de la Clase
public class Mesa {
	final int PRECIO_PATA = 1;
	final int PRECIO_M2 = 5;
	final int PRECIO_MATERIAL_MADERA = 4;
	final int PRECIO_MATERIAL_ACERO = 8;
	final int PRECIO_MATERIAL_ALUMINIO = 10;
	final int PRECIO_MATERIAL_PLASTICO = 2;
	final int PRECIO_COLOR_CUSTOM = 23;
	final String PRECIO_COLOR_NAME_CUSTOM = "CustomName";

	public static final int MATERIAL_MADERA = 1;
	public static final int MATERIAL_ACERO = 2;
	public static final int MATERIAL_ALUMINIO = 3;
	public static final int MATERIAL_PLASTICO = 4;

	// 4.Atributos (siempre PRIVATE para mantener la encapsulación)
	private int numeroPatas;
	private int dimension;
	private String color;
	private int material;

	///////// 5.Metodos //////////

	// 5.1 Constructores
	public Mesa() {

		// Llamar siempre a super
		super();

		// inicializar los atributos
		this.numeroPatas = 4;
		this.color = "Blanco";
		this.dimension = 1;
		this.material = MATERIAL_MADERA;
	}

	public Mesa(int numeroPatas, int dimension, String color, int material) {
		this(); // Llamar siempre al constructor por defecto
		this.numeroPatas = numeroPatas;
		this.dimension = dimension;
		this.color = color;
		this.material = material;
	}

	public Mesa(int numeroPatas, int i) {
		super();
		// this.numeroPatas = numeroPatas;
		setNumeroPatas(numeroPatas);
	}

	// 5.2 Getters & Setters

	public void setNumeroPatas(int numeroPatas) {

		this.numeroPatas = (numeroPatas < 0) ? 0 : numeroPatas;
	}

	public int getNumeroPatas() {
		return numeroPatas;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMaterial() {
		return material;
	}

	public void setMaterial(int material) {
		this.material = material;
	}

	public int getDimension() {
		return dimension;
	}

	public void setDimension(int dimension) {
		this.dimension = dimension;
	}

	public String getColor() {
		return color;
	}

	// 5.3 Otros

	@Override
	public String toString() {
		return "Mesa [numeroPatas=" + numeroPatas + ", dimension=" + dimension + ", color=" + color + ", material="
				+ material + "]";
	}

	/**
	 * Calculamos el precio de la mesa en funcion de los materiales usados
	 * 
	 * @see consultar toals las constantes definidas para los precios
	 * @return int precio en €
	 */

	public int getPrecio() {
		int result = 0;

		return result;
	}

}

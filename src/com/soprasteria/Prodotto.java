package com.soprasteria;

public class Prodotto {
	private String codice;
	private String nome;
	private String marca;
	private Double prezzo;
	private Double iva;

	public Prodotto(String codice, String nome, String marca, Double prezzo, Double iva) {
		this.codice = codice;
		this.nome = nome;
		this.marca = marca;
		this.prezzo = prezzo;
		this.iva = iva;
	}

	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(Double prezzo) {
		this.prezzo = prezzo;
	}

	public Double getIva() {
		return iva;
	}

	public void setIva(Double iva) {
		this.iva = iva;
	}

}

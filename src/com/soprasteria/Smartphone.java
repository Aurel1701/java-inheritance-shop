package com.soprasteria;

public class Smartphone extends Prodotto {
	private String imei;
	private int memoria;
	
	public Smartphone (String codice, String nome, String marca, Double prezzo, Double iva) {
		super(codice, nome, marca, prezzo, iva);
		this.imei = imei;
		this.memoria = memoria;
	}
	
	 
    @Override
    public String toString() {
    	return super.toString() + "-" + imei  + "ed ha" + memoria + "gb";
    }
    
    public String imei() {
        return imei;
    }

    public int getMemoria() {
        return memoria;
    }


}


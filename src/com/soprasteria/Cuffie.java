package com.soprasteria;

public class Cuffie extends Prodotto {
	String colore;
	Boolean wireless;
	
	public Cuffie (String codice, String nome, String marca, Double prezzo, Double iva) {
		super(codice, nome, marca, prezzo, iva);
	}
	
	 
    @Override
    public String toString() {
    	return super.toString() + "è" + colore  + "ed è" + wireless;
    }
    
    public boolean wireless() {
        return wireless;
    }

    public String getColore() {
        return colore;
    }


}

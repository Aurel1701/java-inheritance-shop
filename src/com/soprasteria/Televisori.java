package com.soprasteria;

public class Televisori extends Prodotto {
    public int dimensioni;
    public Boolean smart;
    
    public Televisori (String codice, String nome, String marca, Double prezzo, Double iva) {
		super(codice, nome, marca, prezzo, iva);
		this.dimensioni = dimensioni;
		this.smart = smart;
	}
    
    @Override
    public String toString() {
    	return super.toString() + "è di" + dimensioni  + "ed è" + smart;
    }
    
    public int dimensioni() {
        return dimensioni;
    }

    public Boolean getSmart() {
        return smart;
    }


}

package br.com.heranca;

public class iPhone extends Smartphone {

    private boolean temFaceID;

    public iPhone(String marca, String modelo, boolean temFaceID) {
        super(marca, modelo);
        this.temFaceID = temFaceID;
    }

    public boolean isTemFaceID() {
        return temFaceID;
    }
}
package br.com.heranca;

public class Smartphone {
    private String marca;
    private String modelo;

    public Smartphone(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
}
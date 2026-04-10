package br.com.heranca;

public class Android extends Smartphone {

    private boolean temPlayStore;

    public Android(String marca, String modelo, boolean temPlayStore) {
        super(marca, modelo);
        this.temPlayStore = temPlayStore;
    }

    public boolean isTemPlayStore() {
        return temPlayStore;
    }
}
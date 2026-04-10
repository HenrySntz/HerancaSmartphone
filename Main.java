package br.com.heranca;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== TESTE SMARTPHONES ===");

        Android samsung = new Android("Samsung", "S23", true);
        iPhone iphone = new iPhone("Apple", "iPhone 14", true);

        System.out.println(samsung.getMarca() + " - " + samsung.getModelo());
        System.out.println("PlayStore: " + samsung.isTemPlayStore());

        System.out.println(iphone.getMarca() + " - " + iphone.getModelo());
        System.out.println("FaceID: " + iphone.isTemFaceID());
    }
}
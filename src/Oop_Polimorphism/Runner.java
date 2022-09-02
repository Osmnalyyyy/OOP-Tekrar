package Oop_Polimorphism;

public class Runner {
    public static void main(String[] args) {
        Civciv civciv1 = new Civciv();
        Ordek ordek = new Ordek();

        hayvanSesCikar(civciv1);
        hayvanSesCikar(ordek);
    }

    public static void hayvanSesCikar(Animal animal) {
        animal.sesiCikar();

    }


}

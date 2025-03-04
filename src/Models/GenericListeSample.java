package Models;


public class GenericListeSample {
    public static void main(String[] args) {

        // Generic Tipler T olarak farklı tipler için tanımlanabilen sınıflardır. Bu sayede sınıf farklı tipler ile çalıabilme becerisi kazanmış olur.
        // Type safe çalışmamızda sağlar.
        GenericListe<Integer> numaralar = new GenericListe<>(10);
        numaralar.add(100,0);
        numaralar.add(200,1);

        GenericListe<String> isimler = new GenericListe<>(5);
        isimler.add("Ali",0);
        isimler.add("Ahmet",1);



    }
}

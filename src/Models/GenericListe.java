package Models;

// T Listeye eklenecek olan tipler
public class GenericListe<T> {

    T[] liste;

    public GenericListe(int size) {
        liste = (T[]) new Object[size]; // size şu olan bir dizi newle
    }

     public void add(T element, int index) {
         liste[index] = element;
     }

}

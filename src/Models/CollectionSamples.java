package Models;

import Repository.Category;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSamples {
     public static void main(String[] args) {

         // ekleme,silme, güncelleme, filtereleme,sıralama gibi işlemleri collection sınıfı ile yapabiliriz
         ArrayList<Integer> numbers = new ArrayList<>();
         numbers.add(1);
         numbers.add(2);
         numbers.add(3);

         ArrayList<Integer> numbers2 = new ArrayList<>();

         numbers.remove(0);

         int size = numbers.size();
         numbers.contains(2); // içinde 2 olan bir kayıt varmı
         numbers.get(1); // 1 numaralı indekse ait değeri getir
         numbers.clear(); // listedeki tüm elemanları temizle
         numbers.addAll(numbers2); // bir kolekisyona başka bir koleksiyondaki değeri ekledik.

         numbers.set(0,5); // değeri set et.

         Collections.sort(numbers); // düzden sıralama
         Collections.reverse(numbers); // tersten sıralama

         ArrayList<Cat> cats = new ArrayList<>(10);

         Cat c = new Cat("kedi1");
         Cat c2 = new Cat("kedi2");

         cats.add(c);
         cats.add(c2);
    }
}

import Models.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // static sınıflara ismi üzerinden erişebiliriz.
       String sonuc = StringHelper.concatenate("ali","can");

       double random =  Math.random() * 101; // 0-100

        // Instance alınan sınıfları newleyerek çağırırız
        Cat cat = new Cat("şerafettin");
        cat.SetName("");

        // Not: Abstract sınıflar instance alamazlar
        // Animal animal = new Animal();

        // Animal sınıfına diğer sınıfların methodlarını ortak özelliklerini yönetmek için Abstraction yapmış olduk
        Animal fish = new Fish("nemo");
        fish.takeBreath(); // farklı nefes alma şekillerine sahip olmaları polymorphism

        Animal cat2 = new Cat("garfield");
        cat2.takeBreath();


        // Enum kullanım şekli
        System.out.println("Days Enum ->" + Days.Monday);
        System.out.println("CarTypes ->" +CarTypes.SUV.getValue());

        // Enumdaki tüm değerleri ekrana yazdıran program
        for (Days day : Days.values()) {
            System.out.println(day);
        }


        // Recordlarda değer ilk intialize aşamasında oluşur
        // bir dahada değer değiştirilemez
        // bu sebeple immutable bir tiptir.
        // Record tipler class gibi nesnelerin referans eşitliğe bakmaz, iki nesne arasındaki değer eşitliğine bakar.
        Location location = new Location(45.2,32.2,311);

        Location location2 = new Location(45.2,32.5,311);

        // location.equals(location2); bu kodda Location class olsaydı sonuç false çıkardı. Çünkü classlar ramdeki referans pointer eşitliğine bakar. ama record sadece değer eşitliğine bakar.
        System.out.println(location.equals(location2)); // true


    }
}
import Models.Animal;
import Models.Cat;
import Models.Fish;
import Models.StringHelper;

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

    }
}
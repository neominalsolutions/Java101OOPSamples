package Models;
// extends keyword ile Animadaki nefes alma takeBreath özelliğinin Cat sınıfına aktarılmasıdır.
// bir sınıf birden fazla interfaceden özellik kazanbilirken sadece tek bir sınıftan kalıtım alabilir.
public class Cat extends Animal implements Swimable,Walkable {


    // Ramde Heap üzerinde nesne referansı oluşurken ilk olarak bu constructor tetiklenir.
    // constructor default olarak boştur.
    public Cat(String name) {
        super(name); // kalıtım aldığın sınıfın constructor'ına değeri gönder.
    }

    private String name;

    // fieldlara değer aktarırken getter setter methodlar ile fieldlara kontrolü bir şekilde veri aktarmamız encapsulation
    public void  SetName(String name) {

        if(name.isEmpty())
        {
            this.name = "kedi";
        }
        else {
            this.name = name.trim();
        }

    }

    public String GetName() {
        return name;
    }


    // @Override annotation kullanarak bu özelliğinin super kalıtım aldığımız sınıftan bizim istedeğimiz şekil çalışmasını sağlıyoruz.
    @Override
    public void takeBreath() {
        System.out.println("Akciğer solunumu yapar");
        // super.takeBreath();
    }

    @Override
    public void swim() {
        System.out.println("Yüzmeyi pek sevmez. suyun yüzeyinde yüzebilir");
    }

    @Override
    public void walk() {
        System.out.println("4 ayağı üzerinde yürür");
    }
}

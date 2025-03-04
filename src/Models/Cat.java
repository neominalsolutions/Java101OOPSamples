package Models;
// extends keyword ile Animadaki nefes alma takeBreath özelliğinin Cat sınıfına aktarılmasıdır.
public class Cat extends Animal {


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
}

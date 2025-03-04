package Models;

// Static sınıflar gibi instance alınamamyan sınıflardır
// fakat static sınıflardan farklı bu sınıf instance alıacak olan sınıflara rehberlik eder yol gösterir.
// OOP daki abstraction konusuna bir örnek teşkil eder
// her hayvanın bir isminin olması gerekir dedik. Animal sınıftan bir instance alacağımız zaman sınıfı ismi ile oluşturmak istedik.
public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // hayvanın bir nefes alma özelliği ama bu davranışı nasıl kullanacağını bilmiyoruz.
   public abstract void takeBreath();

}

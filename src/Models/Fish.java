package Models;

// implements keyword ile bir sınıf interface üzerinden bir yetenek alabiliyor.

public class Fish  extends Animal implements Swimable {

    public Fish(String name) {
        super(name);
    }

    @Override
    public void takeBreath() {
        System.out.println("Balık Solungaç solunumu yapar");
    }

    @Override
    public void swim() {
        System.out.println("Denizin altında 5m de yüzerim");
    }

    // bir balığın yüzmesi ile bir kedinin suda yüzmesi farklı, polimorfik davranış
}

// Not: Polymophsim ise bir canlının bir özelliği farklı şekillerde uygulayabilme yeteneği.
// Animal abstract sınıfına sahip olan nefes alma özelliği, balıklar için solungaç ile yapılırken, kedi için akciğer ile yapıldı.

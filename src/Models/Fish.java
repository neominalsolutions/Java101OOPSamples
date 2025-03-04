package Models;

public class Fish  extends Animal {

    public Fish(String name) {
        super(name);
    }

    @Override
    public void takeBreath() {
        System.out.println("Balık Solungaç solunumu yapar");
    }
}

// Not: Polymophsim ise bir canlının bir özelliği farklı şekillerde uygulayabilme yeteneği.
// Animal abstract sınıfına sahip olan nefes alma özelliği, balıklar için solungaç ile yapılırken, kedi için akciğer ile yapıldı.

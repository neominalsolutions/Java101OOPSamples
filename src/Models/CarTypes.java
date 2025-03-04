package Models;

// Sabit listelere enum, enumaration deriz.
// kod yazarken bu sabitler ile çalışmak daha kolay olması ve hata yapmamızı engellemek amaçlı yaygın kullanılan bir tip
public enum CarTypes {
    Sport(200),
    SUV(300),
    Hackback(500);

    private int value;
    // constructor, value constructor üzerinden set edildi
    CarTypes(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}




// CarTypes.Sport
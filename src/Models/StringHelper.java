package Models;

// Not: Bazen bir sınıf ile çalışırken amaç sınıfın içerisinde özellikleri methodlara erşibilir olmakdır. İlla sınıfa ait instance örnek oluşturmayız.

// StringHelper sh = new StringHelper();
// StringHelper.concatenate("ali","can");
// Biz bu şekilde sınıf ismi üzerinden özelliklerine direk erişlen sınıflara static sınıf diyoruz.
// final yazarsak sınıf mühürlenir başka bir sınıf bu final olarak işaretlenen sınıftan kalıtım alamaz. amacımız genel olarak static sınıflarda final ile kalıtım almadan yazmakdır.
public final class StringHelper {

    // Contructor yapıcı method; sınıf ile aynı isimde olan özel bir method'tur.
    // static sınıfların contructor'ı private olarak işaretlenmiştir.


    public  static  String concatenate(String a, String b) {
        return a.trim() + " " + b.trim();
    }

}

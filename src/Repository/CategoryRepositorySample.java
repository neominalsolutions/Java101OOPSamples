package Repository;

import java.sql.SQLException;
import java.util.Scanner;

public class CategoryRepositorySample {
    public static void main(String[] args) {

        // Not: kodda bir hata olup olmadığını try bloğu içerisine yazarız
        try {
            // veritabanına nesnelerin gönderilmeden önceki sınıf hali
            Category c = new Category();

            Scanner sc = new Scanner(System.in);
            System.out.println("Kategorinin ismini giriniz");
            c.setName(sc.next());


            System.out.println("Kategorinin açıklamasını giriniz");
            c.setDescription(sc.next());

            // veritabanı işlemlerini yöneten sınıf servis
            CategoryRepository cr = new CategoryRepository();
            cr.insert(c);

            // nesnel yaklaşım ile veri tabanına kayıt atıyoruz.

        } catch (SQLException e) { // hata varsa catch bloğu hatayı yakalar.
            System.out.println(e.getMessage());
        } catch (StringEmptyException e) { // kendi hatamız
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("İşlem bitti");
        }


    }
}

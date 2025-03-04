package Repository;

import java.sql.SQLException;
import java.util.ArrayList;

public class CategoryRepositoryLoadDataSample {
    public static void main(String[] args) {


        try {
            CategoryRepository repository = new CategoryRepository();
            ArrayList<Category> categories =  repository.findAll();

            // veritabanındaki tüm kategorileri ekrana yazdır.
            // herbir nesne içinde dönüş yapmak oop de forin foreach yapısı kullanırız.
            // for'un kolleksiyonlar ile çalışan hali
            for (Category category : categories) {
                System.out.println(category.getId() + " " + category.getName() + " " + category.getDescription());
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

package Repository;

import java.sql.*;
import java.util.ArrayList;

// servis sınıfları
// işlem yapan sınıflarımız servis sınıfı oluyor
public class CategoryRepository extends RepositoryBase<Category> {
    // veritabanı bağlantı nesnesi
    private Connection connection;
    private String url = "jdbc:mysql://localhost:3306/northwind";
    private String user = "root";
    private String password = "admin";

    public CategoryRepository() {
        super();
    }


    // polymorphism uyguladık
    @Override
    public void save(Category entity) {
        System.out.println("Kategoriye göre kayıt");
    }

    // throws SQLException method içerisinde böyle bir hata durumu oluşabilir demek
    @Override
    public void insert(Category entity) throws SQLException {

        connection = DriverManager.getConnection(url, user, password);
        System.out.println("Veritabanı bağlantısı başarılı oldu");


        String query = "insert into categories(CategoryName,Description) values(?,?)";
        // JDBCde update,insert ve delete işlemleri için sorguyu işleyebilmek için kullanılan bir sınıf. Parametrelerin güvenli olarak geçişini sağlayan SQL ınjection ataklarına kapalı bir sınıf. PreparedStatement
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setString(1, entity.getName());
        ps.setString(2, entity.getDescription());

        // executeUpdate methodu sorgu veritabanına gönderilerek çalıştırılır.
        int rowsAffected = ps.executeUpdate(); // işlem başarılı ise int result olarak etkilenen kayıt sayısı döner

        if (rowsAffected > 0) {
            System.out.println("Ekleme başarılı");
        } else {
            System.out.println("Kayıt başarısız");
        }

        // veritabanı bağlantısını kapasın
        ps.close();
        connection.close();

    }

    @Override
    public ArrayList<Category> findAll() throws SQLException {
        connection = DriverManager.getConnection(url, user, password);
        System.out.println("Veritabanı bağlantısı başarılı oldu");

        // Not parametresiz çalışırken normal statement
        // String pquery = "select * from categories where ıd=?";
        // parametreli çalışırken prepared statement kullanırız.
        String query = "select * from categories";
        // parametre yoksa normal statement nesnesi oluşturduk
        Statement statement = connection.createStatement();
        // ilgili sorgu sonucu okuma işlem yapan
        ResultSet resultSet = statement.executeQuery(query);

        ArrayList<Category> categories = new ArrayList<>();

        while (resultSet.next()) { // tabloda kayıt okuna bildiği sürece tekrarlı işlem

            Category category = new Category();
            category.setId(resultSet.getInt("CategoryID"));
            category.setName(resultSet.getString("CategoryName"));
            category.setDescription(resultSet.getString("Description"));

            // kategori nesneni oluşturp bunuda kategori koleksiyonuna ekletiyoıruz
            categories.add(category);
        }

        // kaynakların tüketiltikten sonra kapatılması uygulama performansı açısında önemli
        statement.close();
        connection.close();

        return categories;

    }
}

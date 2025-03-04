package Repository;

import java.sql.SQLException;
import java.util.ArrayList;

public class ProductRepository extends  RepositoryBase<Product> {
    @Override
    public void save(Product entity) {
        System.out.println("Ürüne göre kayıt");
    }

    @Override
    public void insert(Product entity) throws SQLException {

    }

    @Override
    public ArrayList<Product> findAll() throws SQLException {
        return null;
    }
}

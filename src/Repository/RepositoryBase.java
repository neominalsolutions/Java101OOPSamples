package Repository;

import java.sql.SQLException;
import java.util.ArrayList;

// T tipi Entity Interfaceden Implemente olmalıdır
// Bu konuya Code defensing diyoruz
// Entity tipinden türeyen sınıfların Generic bir şekilde kaydolmasını sağlar
public abstract class RepositoryBase<T extends Entity> {

    public abstract void save(T entity);
    public abstract void insert(T entity) throws SQLException;
    public abstract ArrayList<T> findAll() throws SQLException;
}
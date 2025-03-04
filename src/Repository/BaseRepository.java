package Repository;

public class BaseRepository<T extends Entity> {
    public void save(T entity) {
        System.out.println("Kaydet");
    }
}

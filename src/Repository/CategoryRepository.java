package Repository;

// servis sınıfları
// işlem yapan sınıflarımız servis sınıfı oluyor
public class CategoryRepository extends RepositoryBase<Category> {

    // polymorphism uyguladık
    @Override
    public void save(Category entity) {
        System.out.println("Kategoriye göre kayıt");
    }
}

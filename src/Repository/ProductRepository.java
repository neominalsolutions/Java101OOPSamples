package Repository;

public class ProductRepository extends  RepositoryBase<Product> {
    @Override
    public void save(Product entity) {
        System.out.println("Ürüne göre kayıt");
    }
}

package Repository;

public class RepositorySample {
    public static void main(String[] args) {

        Product p = new Product();
        p.setId(584545L);


        // 1.kullanım
        ProductRepository pRepo = new ProductRepository();
        pRepo.save(p);

        // 2. kullanım
        BaseRepository<Product> productRepo = new BaseRepository<>();
        productRepo.save(p);

        // ------------------------------------------------ //

        Category c = new Category();
        c.setId(1);

        // 1.kullanım
        CategoryRepository cRepo = new CategoryRepository();
        cRepo.save(c);

        // 2. kullanım
        BaseRepository<Category> categoryRepo = new BaseRepository<>();
        categoryRepo.save(c);


    }
}

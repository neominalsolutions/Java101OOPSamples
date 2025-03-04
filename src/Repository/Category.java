package Repository;

// Kategori tablosunu temsil eden program sınıf
// Entity veri tabanındaki sutunlara değerlerin gönderecek olan sınıflar
// POJO -> Plain Old Java Object
public class Category extends EntityBase<Integer> {

    private  String name; // kategorinin ismi
    private String description; // sınıfta açıklama bilgilerini tutarız


    public String getName() {
        return name;
    }
    public void setName(String name) {

        // kod burada kesilir. ve ilgili hata kullanıcıya gösterilir.
        if(name.isEmpty()){
            throw  new StringEmptyException("Name cannot be empty");
        }

        this.name = name.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {

        if(description.isEmpty()){
            throw  new StringEmptyException("Description cannot be empty");
        }

        this.description = description.trim();
    }
}
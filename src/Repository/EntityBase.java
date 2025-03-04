package Repository;

public abstract class EntityBase<TKey extends Number> implements Entity {
    private TKey Id; // kaydın dbdeki Idsi


    public TKey getId() {
        return Id;
    }

    public void setId(TKey Id) {
        this.Id = Id;
    }
}
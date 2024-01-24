package model;

public class Professor extends Person{
    private Category category;

    public Professor(String name, String identity,  Category category) {
        super(name, identity);
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}

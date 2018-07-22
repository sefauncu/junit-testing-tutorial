package animal;

public abstract class Animal {
    // test 10

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
        //return name + "Tekir";
    }

    public void setName(String name) {
        this.name = name;
    }
}

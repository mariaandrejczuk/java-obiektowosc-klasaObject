import java.util.Objects;

public class Cat extends Animal {
    private String goesOutside;

    public Cat(String name, int age, String color, String goesOutside) {
        super(name, age, color);
        this.goesOutside = goesOutside;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "goesOutside='" + goesOutside + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return Objects.equals(goesOutside, cat.goesOutside);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), goesOutside);
    }
}

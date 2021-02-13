import java.util.Objects;

public class Dog extends Animal {
    private String isBigMediumSmall;

    public Dog(String name, int age, String color, String isBigMediumSmall) {
        super(name, age, color);
        this.isBigMediumSmall = isBigMediumSmall;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(isBigMediumSmall, dog.isBigMediumSmall);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isBigMediumSmall);
    }
}

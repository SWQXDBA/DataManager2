
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Person implements Serializable {
    String name;
    int age;
    List<Card> list;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(list, person.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, list);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", list=" + list +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Card> getList() {
        return list;
    }

    public void setList(List<Card> list) {
        this.list = list;
    }
}

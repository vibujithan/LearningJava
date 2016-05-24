public class Person {

    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Person() {
    }

    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        } else if (obj instanceof Person) {
            Person otherPerson = (Person) obj;
            if (this.name == otherPerson.name && this.age == otherPerson.age) {
                System.out.println(otherPerson.name);
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 17 * (this.name == null ? 0 : this.name.hashCode()) + 31 * this.age;
    }
}
public abstract class LivingBeing {

    private int age;

    void setAge(int age) {
        this.age = age;
    }

    int getAge() {
        return age;
    }

    abstract void breathe();
    abstract void eat();

}

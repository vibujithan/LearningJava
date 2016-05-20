import java.util.Date;

public class Animal implements Cloneable{

    private String name;
    private Date born;

    Animal() {
        System.out.println("Name is not initialized");
    }

    Animal(String name){
        this.name=name;
        this.born=new Date();
    }

    String getName(){
        return this.name;
    }

    Date getBorn(){
        return born;
    }

    @Override
    protected final Object clone() throws java.lang.CloneNotSupportedException {
        return super.clone();
    }
}

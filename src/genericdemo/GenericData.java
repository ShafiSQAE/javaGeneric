package genericdemo;

public class GenericData<T>{

    T age;

    //constructor
    public GenericData(T age){
        this.age=age;
    }

    //Method

    public T getAge(){
        return age;
    }
}

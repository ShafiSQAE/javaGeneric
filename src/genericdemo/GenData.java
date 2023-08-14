package genericdemo;

public class GenData <T extends Number>{

    private T salary;

    public GenData(T salary){
        this.salary=salary;
    }

    public T printSalary(){
        return salary;
    }
}

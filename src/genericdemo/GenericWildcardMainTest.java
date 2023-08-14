package genericdemo;

public class GenericWildcardMainTest {
    public static void main(String[] args) {

        GenData<Integer> intData=new GenData<>(500000);
        System.out.println("The salary in integer is: "+intData.printSalary()+" BDT");

        GenData<Double> doubleData=new GenData<>(60000000.5);
        System.out.println("The salary in double is: "+doubleData.printSalary()+" BDT");

        GenData<Float> floatData= new GenData<>(40444.50f);
        System.out.println("The salary in floating is :"+floatData.printSalary()+" BDT");
    }
}

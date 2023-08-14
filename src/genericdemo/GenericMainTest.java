package genericdemo;

public class GenericMainTest {
    public static void main(String[] args) {

        GenericData<Integer> genericData=new GenericData<>(30);
        System.out.println("Integer Age is: "+genericData.getAge());

        GenericData<Float> genericData1=new GenericData<>(30.5f);
        System.out.println("Floating Age is :"+genericData1.getAge());

        GenericData<String> genericData2=new GenericData<>("Thirty Years");
        System.out.println("The Texted Age is: "+genericData2.getAge());
    }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {

        DynamicArray dynamicArray=new DynamicArray(5);



        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(3);
        dynamicArray.add(4);
        dynamicArray.add(5);
        dynamicArray.add(6);


        dynamicArray.remove(3);
        dynamicArray.remove(4);
        dynamicArray.remove(5);
        System.out.println(dynamicArray.size());
        System.out.println(dynamicArray);


    }
}
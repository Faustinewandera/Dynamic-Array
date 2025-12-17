
//Dynamic array is an array when it's storage capacity depletes, it declares another one and initialize it.
public class DynamicArray {
    int size;
    int capacity=10;
    Object[] array;

    public DynamicArray(){
        this.array = new Object[capacity];
    }
    //this defines the array capacity
    public DynamicArray(int capacity) {
        this.capacity = capacity;
        array = new Object[capacity];
    }
    //this defines add method that allow adding of data/element in the array
    public void add(Object data){

        if(size>=capacity){
            grow();
        }
        array[size++]=data;
    }
    //this defines the method that allow to insert the array in the array
    public void  insert(int index,Object data){
        if (size>=capacity){
            grow();
        }
        for (int i = size; i > index; i--) {
            array[i]=array[i-1];
        }
        array[index]=data;
        size++;
    }

    //this method is for the removal of the element/data in the array list

    public void  remove(Object data){
        for (int i = 0; i < size; i++) {
            if (array[i]==data){
                for (int j = i+1; j < size; j++) {
                    array[j]=array[j-1];
                }
                array[size-1]=null;
                size--;
                if (size<=(int)(capacity/3)){
                    shrink();
                }
                break;
            }
        }
     }

     //this method is responsible for  shifting of the array element to fill the
     // gap created after removal of an element thus the array size shrink
    private void shrink() {
        Object[] temp = new Object[size];
        for (int i = 0; i < size; i++) {
            temp[i] = array[i];
        }
    }
//this search the element in the array by the index
    public int search(Object data){
        for (int i = 0; i < size; i++) {
            if (array[i]==data){
                return i;            }
        }
        return -1;
    }
    //this element grows the array size upon the add of the element inside the array list
    private void grow(){
        int newCapacity=capacity*2;
        Object[] newArray = new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];

        }
       capacity = newCapacity;
        array = newArray;

    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public String toString(){

        String string="";
        for(int i=0;i<size;i++){
            string+=array[i]+"\n";
        }
        if (string!=""){
            string="["+string.substring(0,string.length()-2)+"]";
        }
        else {
            string="[]";
        }

        return string;
    }

}

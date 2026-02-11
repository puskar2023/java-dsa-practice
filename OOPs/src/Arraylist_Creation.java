import java.util.*;

public class Arraylist_Creation {
    public static class Arraylist{
        int[] arr = new int[2];
        int idx = 0;
        int size = 0;
        public void add(int a){
            if(size == arr.length){
                int[] brr = Arrays.copyOf(arr, arr.length*2);
                arr = new int[brr.length];
                arr = Arrays.copyOf(brr, brr.length);
            }
            arr[idx++] = a;
            size++;
        }
        public void print(){
            for(int i: arr){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        Arraylist l = new Arraylist();
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(6);
        System.out.println(l.size);
        l.print();
    }
}

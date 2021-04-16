package atong.springboot.jenkins;


import java.util.*;
import java.util.function.*;

public class array {

    public static <T> T[]  arraymerge(T[] array1, T[] array2){
        T[] result = Arrays.copyOf(array1,array1.length+array2.length);
        System.arraycopy(array2, 0, result, array1.length, array2.length);
        Arrays.sort(result);
        return  result;
    }

    public static void main(String[] args) {
        Integer[] a1={1,3,5};
        Integer[] a2={2,4,6};
        Character[] c1={'a','c','b'};
        Character[] c2={'g','f','h'};
        Integer[] a3=array.arraymerge(a1,a2);
        Character[] c3=array.arraymerge(c1,c2);
        for (int i=0;i<c3.length;i++){
            System.out.println(c3[i]);
        }
    }

}

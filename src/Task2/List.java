package Task2;

import java.util.ArrayList;
import java.util.Iterator;

public class List {

    public static void main(String[] args) {

        ArrayList <String> arrayList = new ArrayList<>();

        for (int i =0; i<10 ; i++){

            arrayList.add("Str" + i);

        }

        Iterator iterator = arrayList.iterator();

        while (iterator.hasNext()){
            Object str = iterator.next();
            System.out.println(str);

        }


    }

}

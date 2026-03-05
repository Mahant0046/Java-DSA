package StriverDSA.src.Practice;

import java.util.*;

public class LlUsingCollections {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        LinkedList<Integer> list=new LinkedList<>();
//                new LinkedList<>(Arrays.asList(1, 5, 7, 3 , 8, 2, 3));

        int n=sc.nextInt();
        for (int i = 0; i <n ; i++) {
            list.add(i+1);
        }

//        for (int i = 0; i <n ; i++) {
//            list.add(sc.nextInt());
//        }
//        for (int a:list)
//            System.out.print(a+" ");
        System.out.println(list);

        Iterator<Integer> iterator=list.iterator();
        while (iterator.hasNext())
        {
            if (iterator.next()>25)
                iterator.remove();
        }


//        list.removeIf(num ->num>25);

//        Stream<Integer> arr= list.stream().filter(a->a<25);
//        arr.forEach(i-> System.out.print(i+" "));
        System.out.println(list);


    }
}

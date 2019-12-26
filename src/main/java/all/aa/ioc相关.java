package all.aa;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ioc相关 {



    public static void main(String[] args) {







        Integer  gaga [] ={1,2,3};
        List list11 = Arrays.stream(gaga).collect(Collectors.toList());
   System.out.println(list11.getClass());
        int  gaga2 [] ={1,2,3};
        List list111 = Arrays.stream(gaga2).boxed().collect(Collectors.toList());
        System.out.println(list111.getClass());

        String  haha [] ={"1","2"};
        List<String> list1 = (new ArrayList<>( Arrays.asList(haha)));
        System.out.println(list1.getClass());
        //class java.util.Arrays$ArrayList
        List list =new ArrayList();
        System.out.println(list.getClass());
        //class java.util.ArrayList
//结果是2
/*  int myArrays[] ={1,2};
 List list = Arrays.asList(myArrays);
 System.out.println(list.get(1));*/
/*        java.lang.ArrayIndexOutOfBoundsException: 1
        at java.util.Arrays$ArrayList.get(Arrays.java:3841)
        at all.aa.ioc相关.main(ioc相关.java:20)*/


     /*   AnnotationConfigApplicationContext  aa = new AnnotationConfigApplicationContext();
        aa.getBean(Student.class);*/
    }





    }



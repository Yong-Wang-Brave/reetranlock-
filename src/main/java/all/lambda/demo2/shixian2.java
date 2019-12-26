package all.lambda.demo2;


import all.lambda.person;

import java.util.Arrays;
import java.util.List;

public class shixian2 {


    public static void main(String[] args) {
        List<person> persons = Arrays.asList(

                new person("aa", "11", 1),
                new person("bb", "22", 2),
                new person("cc", "33", 33)
        );


        // jiancheAndzhixing(persons,p->p.getLastName().startsWith("22"),p->System.out.println(p));



     persons.stream().filter(person -> person.getLastName().startsWith("22")).forEach(person -> System.out.println(person));
     persons.stream().filter(person -> person.getLastName().startsWith("22")).forEach(System.out::println);
    }}

//
//public static void jiancheAndzhixing(List<person>  persons, Predicate<person> jc, Consumer<person> zx){
//
//    //方式二*//*
//    //
//    for(person p:persons){
//
//        if(jc.test(p)){
//           zx.accept(p);
//        }
//
//    }
////   //方式一
//
//    persons.forEach(p -> {  if(jc.test(p)){
//                                    zx.accept(p);
//                                               }});
//
//}
//
//}

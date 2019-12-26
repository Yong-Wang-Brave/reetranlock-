package all.lambda.demo3optional;

import all.lambda.person;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class optiaonal {


 static  person person =new person("wy","ff",2);

    static Optional<person> p = Optional.of(person);

    public static void main(String[] args) {
       System.out.println(fangfasi());
        List<person> persons = Arrays.asList(

                new person("aa", "11", 1),
                new person("bb", "22", 2),
                new person("cc", "33", 33)
        );

        Optional<List<person>> pp = Optional.of(persons);
        //方式1   常规操作
      /*  if(persons!=null){
            return   ;
        }else {

            return ;
        }*/
/*
     if (pp.isPresent()){

         return ;

     }*/

//方式二  输出的写法

/*        if (persons!=null){

     System.out.println(persons);

        }

pp.ifPresent(System.out::println);*/

//[person(firstName=aa, lastName=11, age=1), person(firstName=bb, lastName=22, age=2), person(firstName=cc, lastName=33, age=33)]


//方式三  if else的写法
    /*    if (persons!=null){

            return ;

        }else{

            return ;
        }


        return pp.orElse();
*/


    }

    //方式四  多个为空情况的判断
    public static String fangfasi() {
        {
   /*         if (person != null) {

                String name = person.getFirstName();

                if (name != null) {

                    return "发个";
                }else {
                    return null;
                }


            }else {

                return null;
            }
        }
*/


   return  p.map(p->p.getFirstName()).map(name->"发个" ).orElse(null);
    }




}}
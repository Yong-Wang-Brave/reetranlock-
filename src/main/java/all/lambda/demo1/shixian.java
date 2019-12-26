package all.lambda.demo1;

import all.lambda.person;

import java.util.Arrays;
import java.util.List;

public class shixian {




public static void main(String[] args){
      List<person> persons = Arrays.asList(

            new person("aa","11",1),
            new person("bb","22",2),
            new person("cc","33",33)
 );

    jiancheAndzhixing(persons,p->p.getLastName().startsWith("11"),p->System.out.println(p));


}


public static void jiancheAndzhixing(List<person>  persons,jiance jc,zhixing zx){

    for(person p:persons){

        if(jc.jiancefangfa(p)){

        zx.zhixing(p);

        }




    }






}







;








}

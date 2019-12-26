package all.骚操作;

import all.lambda.person;
import lombok.val;
import lombok.var;
import all.lambda.person;
import org.eclipse.jdt.core.dom.Name;

import javax.swing.text.StyledEditorKit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client {
    
public static void main(String[] args){

    String xx=null;
    //if(xx.equals("aa"))

    for(int i=0;i<10;i++){

System.out.println(i);

    }



    //7 args.length>0.if
    if (args.length>0) {

    }
//8cast强转 name.cast
    Object name="wy";
   // ((String) name)



    //var 补全 "jack".var



    String jack = "jack";
    int i = 20;
    person student = new person("a","b",1);
//6 for 循环

    List<String>   list = Arrays.asList("a","b","c");

    //list.for 可以打印出下面的
    for (String s : list) {
    }


    //list.fori
    for (int i1 = 0; i1 < list.size(); i1++) {
        
    }


}


    //2  person.null自动补全

    //3 person.notnull判断
    //4  person.nn判断
public int add(person person ){

    if (person == null) {

    }
//3
    if (person != null) {

    }
    //4
    if (person != null) {

    }

//8 11.return
    return 11;


}
}

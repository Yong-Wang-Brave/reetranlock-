package all.zerenlian;


import java.util.function.Function;
import java.util.function.UnaryOperator;

public class test {
public static void main(String[] args){
    ProcessingObject<String> p1 = new HeaderTextProcessing();
    ProcessingObject<String> p2 = new SpellingCheckerProcessing();
  p1.setSuccessor(p2);
String  result =p1.handler("good");
System.out.println(result);
//good good study good

  // p2.setSuccessor(p1);
//String  result2 =p2.handler("ban");
//System.out.println(result2);

//good good study banana
//如果不屏蔽代码Exception in thread "main" java.lang.StackOverflowError   递归无限调用了，你忘记写递归退出的条件了。

   //第二种方式
    UnaryOperator<String> headerProcessing =(String text)->"From"+text;


    UnaryOperator<String>  spellCheckProcessing=(String text )->text.replace("ban","banana");


    Function<String,String> function=headerProcessing .andThen(spellCheckProcessing);
 
    
    System.out.println(function.apply("ban"));

    //Frombanana



    UnaryOperator<String>  spellCheckProcessing1=(String text )->text.concat("ban");


    Function<String,String> function2=headerProcessing .andThen(spellCheckProcessing1);


System.out.println(function2.apply("hah"));

//Fromhahban

//第三种方式


    Function<String,String> headProcessor =(String text)->"huhu"+text;

    Function<String,String> spellProcessor=(String text )->text.replace("ban","banana");

    Function<String,String> function3=headProcessor.compose(spellProcessor);

    System.out.println(function3.apply("luckyban"));

    //huhuluckybanana
}


}
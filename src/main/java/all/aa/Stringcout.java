package all.aa;

/*截取字符串中的字串*/

import org.apache.commons.collections.bag.SynchronizedSortedBag;

import java.util.HashMap;

public class Stringcout {
    public static void main(String[] args){
        int  number=0;

        String aa = "aareferfeadadadqabcdwdewfgiregjiegjiabcfjijfoijoabcjjfpj";
        String abc = "abc";
        for (int i = 0; i < aa.length(); i++) {

            if(aa.indexOf("abc")!=-1){

             number++;

           aa=aa.substring(aa.indexOf("abc")+3);


            }

            System.out.println(number);
        }


    }

}

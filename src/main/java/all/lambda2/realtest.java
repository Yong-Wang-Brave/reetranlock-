package all.lambda2;


//策略模式的实现同一个接口的不通实现。
public class realtest {
    
    public static void main(String[] args){
//分别引入各个对象实现。
        test tt =new test(new IsDd());
        Boolean  daan1 =tt.toUser("a");
        test tt2 =new test(new IsNumber());
        Boolean  daan2 =tt2.toUser("77");
        System.out.println(daan1);
        System.out.println(daan2);

       //lambda实现
       test test1 =new test((String s)->s.matches("[a-z]+"));
        System.out.println(test1.toUser("c"));
       test test2 =new test((String s)->s.matches("\\d+"));
        System.out.println(test2.toUser("1"));
    } 
    
    
    
}

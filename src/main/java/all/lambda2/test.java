package all.lambda2;

public class test {
//引入接口，并搞一个公共方法
private ValidationStrategy jiekou;

public test(ValidationStrategy jiekou){

    this.jiekou=jiekou;
}

public  boolean toUser(String s){

return  jiekou.execute(s);
}









}

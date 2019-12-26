package all.lambda2;
//定义接口实现2
public class IsNumber implements ValidationStrategy{


    @Override
    public boolean execute(String s) {
        return s.matches("\\d+");
    }
}

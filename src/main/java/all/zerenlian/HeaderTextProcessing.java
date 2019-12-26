package all.zerenlian;

public class HeaderTextProcessing extends ProcessingObject<String> {

    @Override
    protected String handleWork(String input) {
        return input.replace("ban","banana");
    }
}

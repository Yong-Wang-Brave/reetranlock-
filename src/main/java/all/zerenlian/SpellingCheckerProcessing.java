package all.zerenlian;

public class SpellingCheckerProcessing  extends ProcessingObject<String> {

    @Override
    protected String handleWork(String input) {
        return "good good study "+input;
    }
}

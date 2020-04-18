import Languages.JavaCommentSpec;
import contracts.Removable;

/*
I have classes for readable and fast ways of counting the lines.
To make it extendable, I made the whole project extendable.
I didn't make a different class just for it. It's simpler to
understand and reuse.
 */

public class Main {

    public static void main(String[] args) {
        Removable python = new JavaCommentSpec();
        LineProcessor processor = new LineProcessor(python);

        ReadableMode readableMode = new ReadableMode(processor);
        SpeedMode speedMode = new SpeedMode(processor);

        readableMode.makeItReadable("countFile.java");
        speedMode.makeItFast("countFile.java");
    }
}

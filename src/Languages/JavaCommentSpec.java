package Languages;

import contracts.Removable;

public class JavaCommentSpec implements Removable {
    @Override
    public boolean shouldRemove(String line) {
        return lineIsStartOfComment(line) || line.isEmpty() || lineIsInComment(line) || lineIsEndOfComment(line);
    }

    private boolean lineIsStartOfComment (String line) {
        return line.startsWith("//") || line.startsWith("/*");

    }

    private boolean lineIsInComment (String line) {
        return line.startsWith("*") && !line.startsWith("*/");

    }

    private boolean lineIsEndOfComment (String line) {
        return line.endsWith("*/");
    }
}

import contracts.Removable;

class LineProcessor {
    private Removable language;
    LineProcessor(Removable language){
        this.language = language;
    }

    boolean isComment(String line) {
        return language.shouldRemove(line);
    }
}

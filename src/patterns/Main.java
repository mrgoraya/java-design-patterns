package patterns;

import patterns.momento.Editor;
import patterns.momento.History;

public class Main {
    public static void main(String[] args) {
        var editor = new Editor();
        var history = new History();

        editor.setContent("a");
        history.push(editor.createState());

        editor.setContent("b");
        history.push(editor.createState());

        editor.setContent("c");
        history.push(editor.createState());

        editor.setContent("d");
        editor.restoreContent(history.pop()); // undo

        System.out.println(editor.getContent());
    }
}

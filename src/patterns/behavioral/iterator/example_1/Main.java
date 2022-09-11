package patterns.behavioral.iterator.example_1;

public class Main {
    public static void main(String[] args) {
        var history = new BrowserHistory();
        history.push("a");
        history.push("b");

        Iterator iterator = history.createIterator();
        while (iterator.hasNext()) {
            var url = iterator.current();
            System.out.println(url);
            iterator.next();
        }
    }
}

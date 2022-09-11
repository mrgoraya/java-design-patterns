package patterns.behavioral.iterator.example_1;

public interface Iterator {
    boolean hasNext();
    String current();
    void next();
}
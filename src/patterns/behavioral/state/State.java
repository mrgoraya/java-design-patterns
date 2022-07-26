package patterns.behavioral.state;

public class State {
    public static void main(String[] args) {
        var canvas = new Canvas();
        canvas.setCurrentTool(new EraserTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }
}

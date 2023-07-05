package Bridge;

public class Main {
    public static void main(String[] args) {
        Display[] displays = new Display[3];
        displays[0] = new Display(new StringDisplayImpl("Hello, Korea."));
        displays[1] = new CountDisplay(new StringDisplayImpl("Hello, World."));
        displays[2] = new CountDisplay(new StringDisplayImpl("Hello, Universe."));

        for (Display d : displays) {
            d.display();
        }

        ((CountDisplay) displays[2]).multiDisplay(5);
    }
}
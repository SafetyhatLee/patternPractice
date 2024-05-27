import java.util.ArrayList;

public class Modula {

    boolean open = false;
    ArrayList<Module> modules;

    public Modula() {
        modules = new ArrayList<>();
        Controller con = new Controller();
    }

    public static float dist(Module a, Module b) {
        return (float) Math.sqrt((a.x-b.x)*(a.x-b.x)+(a.y-b.y)*(a.y-b.y));
    }

    public void addModule(int x, int y) {
        modules.add(new Module(x, y));
        // Add links between the new module and other neighboring modules
    }

    public boolean access(Module m, User accessor) {
        for (User u : m.register) {
            if (u.hashCode() == accessor.hashCode()) {return true;}
        }
        return false;
    }

}

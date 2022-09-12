import java.util.ArrayList;

public abstract class Application {
    public ArrayList<Object> Services = new ArrayList<Object>();
    public ArrayList<Object> Configuration = new ArrayList<Object>();

    public abstract void run();
}

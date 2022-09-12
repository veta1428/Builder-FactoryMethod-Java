public class WebApplication extends Application {
    public Object webHost;

    @Override
    public void run() {
        System.out.println("Web app is running\n\nWith configuration:");

        for(int i = 0; i < super.Configuration.size(); i++) {
            System.out.println(super.Configuration.get(i));
        }

        System.out.println("With registered services:\n");
        for(int i = 0; i < super.Services.size(); i++) {
            System.out.println(super.Services.get(i));
        }
    }
}

public class DesktopApplication extends Application {

    @Override
    public void run() {
        System.out.println("Desktop app is running\nWith configuration:");
        for(int i = 0; i < super.Configuration.size(); i++) {
            System.out.println(super.Configuration.get(i) + "\n");
        }
        System.out.println("With registered services:\n");
        for(int i = 0; i < super.Services.size(); i++) {
            System.out.println(super.Services.get(i) + "\n");
        }       
    }
}

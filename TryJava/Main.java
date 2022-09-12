import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ApplicationBuilder builder = ApplicationBuilderFactory.createBuilder(BuilderType.WebApplicationBuilder);

        // assume we read this from some configuration file
        HashMap settings = new HashMap<String, String>();
        settings.put("ConnectionString", "Server=(localdb)...");

        builder
            .addConfiguration(settings)
            .addService("DependencyInjection")
            .addService("Mediator")
            .addService("Email sending service");

        Application app = builder.build();

        app.run();
    }
}
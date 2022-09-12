public class DesktopApplicationBuilder extends ApplicationBuilder {

    public Application build() {
        DesktopApplication desktopApp = new DesktopApplication();
        desktopApp.Configuration = super.Configuration;
        desktopApp.Services = super.Services;
        return desktopApp;
    }

    public IApplicationBuilder addService(Object service) {
        super.Services.add(service);
        return this;
    }

    public IApplicationBuilder addConfiguration(Object config) {
        super.Configuration.add(config);
        return this;
    }
}

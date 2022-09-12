public class WebApplicationBuilder extends ApplicationBuilder {

    public Application build() {
        WebApplication webApp = new WebApplication();
        webApp.Configuration = super.Configuration;
        webApp.Services = super.Services;
        webApp.webHost = new String("Assume this is a host");
        return webApp;
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

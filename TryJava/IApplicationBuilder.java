

public interface IApplicationBuilder {
    public Application build();
    public IApplicationBuilder addService(Object service);
    public IApplicationBuilder addConfiguration(Object config);
}

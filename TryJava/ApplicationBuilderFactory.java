public class ApplicationBuilderFactory {
    public static ApplicationBuilder createBuilder(BuilderType type) {
        switch (type)
        {
            case WebApplicationBuilder:
                return new WebApplicationBuilder();
            case DesktopApplicationBuilder:
                return new DesktopApplicationBuilder();
            default:
                throw new EnumConstantNotPresentException(type.getClass(), type.name());
        }
    }
}

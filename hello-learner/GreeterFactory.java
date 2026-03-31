public class GreeterFactory {
    public static IGreeter create(String type) {
        return switch (type.toLowerCase()) {
            case "official" -> new OfficialGreeter();
            case "cool"     -> new CoolGreeter();
            default         -> throw new IllegalArgumentException(
                    "Unknown greeter type: " + type);
        };
    }
}

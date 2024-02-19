import java.util.HashMap;
import java.util.Map;
public class PrototypeRegistry {
    private static Map<String, Prototype> prototypes = new HashMap<>();

    static {
        prototypes.put("ConcretePrototype1", new ConcretePrototype1("Prototype 1"));
        prototypes.put("ConcretePrototype2", new ConcretePrototype2(2));
    }

    static Prototype getPrototype(String type) {
        return prototypes.get(type).clone();
    }
}

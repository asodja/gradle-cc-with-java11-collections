import java.util.*;

public class MyUtils {

    public static List<String> newPreJava11List(String... values) {
        return new ArrayList<>(newJava11List(values));
    }

    public static Set<String> newPreJava11Set(String... values) {
        return new HashSet<>(newJava11Set(values));
    }

    public static Map<String, String> newPreJava11Map(String key, String value) {
        return new HashMap<>(newJava11Map(key, value));
    }

    public static List<String> newJava11List(String... values) {
        return List.of(values);
    }

    public static Set<String> newJava11Set(String... values) {
        return Set.of(values);
    }

    public static Map<String, String> newJava11Map(String key, String value) {
        return Map.of(key, value);
    }
}

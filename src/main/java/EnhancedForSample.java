import java.util.List;

public class EnhancedForSample {

    public static void main(String[] args) {

        List<String> names = List.of("yamada", "tanaka", "yasuda", "suzuki", "iida");
        filterNameContainingA(names);
    }

    public static void filterNameContainingA(List<String> names) {
        names.stream()
                .filter(name -> name.contains("a"))
                .forEach(System.out::println);
    }
}

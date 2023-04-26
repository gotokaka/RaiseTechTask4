import java.util.List;

public class StreamSample {

    public static void main(String[] args) {
        List<String> names = List.of("yamada", "tanaka", "yasuda", "suzuki", "iida");
        List<String> result = names.stream()
                .filter(name -> name.contains("a"))
                .toList();
        System.out.println(result);
    }
}


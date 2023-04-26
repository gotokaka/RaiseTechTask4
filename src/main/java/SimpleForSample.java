import java.util.List;
import java.util.stream.IntStream;

public class SimpleForSample {

    public static void main(String[] args) {
        /*for文をStreamに変換し出力*/

        List<String> names = List.of("yamada", "tanaka", "yasuda", "suzuki", "iida");
        List<String> result = IntStream.range(0, names.size()).filter(i -> names.get(i).contains("a"))
                .mapToObj(names::get)
                .toList();

        System.out.println(result);
    }
}


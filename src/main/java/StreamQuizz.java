import java.util.List;

public class StreamQuizz {
    public static void main(String[] args) {
        List<String> names = List.of("yamada", "tanaka", "yasuda", "suzuki", "iida");
        sortedResult(names);
    }

    /*Listを昇順に並べたものを出力。メソッド参照で記述*/
    public static void sortedResult(List<String> names) {
        names.stream().sorted().forEach(System.out::println);

        /*"y"から始まる要素を数えて出力。*/
        long count = names.stream().filter(name -> name.startsWith("y")).count();
        System.out.println(count);

        /*Listに"yamada"があるかtrueかfalse*/
        boolean hasYamada = names.stream().anyMatch(name -> name.equals("yamada"));
        System.out.println(hasYamada);

        /*Listの名前を大文字に変換、メソッド参照に変更して出力*/
        names.stream().map(String::toUpperCase).toList().forEach(System.out::println);
    }
}

import java.util.List;

public class StreamQuizz {
    /*メソッド参照で書けそうな部分を書き換えた。ただ冗長になっている部分もある気がする*/
    public static void main(String[] args) {
        List<String> names = List.of("yamada", "tanaka", "yasuda", "suzuki", "iida");

        sortedResult(names);
        countY(names);
        anyMatchYamada(names);
        toUpperCase(names);
    }

    /*Listを昇順に並べたものを出力。メソッド参照で記述*/
    public static void sortedResult(List<String> names) {
        names.stream().sorted().forEach(System.out::println);
    }

    /*"y"から始まる要素を数えて出力。*/
    public static void countY(List<String> names) {
        long count = names.stream().filter(name -> name.startsWith("y")).count();
        System.out.println(count);

    }

    /*Listに"yamada"があるかtrueかfalse。メソッド参照を追加*/
    public static void anyMatchYamada(List<String> names) {
        boolean hasYamada = names.stream().anyMatch("yamada"::equals);
        System.out.println(hasYamada);
    }

    /*Listの名前を大文字に変換、メソッド参照に変更して出力*/
    public static void toUpperCase(List<String> names) {
        names.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}

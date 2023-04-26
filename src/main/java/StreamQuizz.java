import java.util.List;

public class StreamQuizz {
    public static void main(String[] args) {
        List<String> names = List.of("yamada", "tanaka", "yasuda", "suzuki", "iida");

        /*Listを昇順に並べたものを出力*/
        List<String> sortedResult = names.stream().sorted().toList();
        System.out.println(sortedResult);

        /*"y"から始まる要素を数えて出力*/
        long count = names.stream().filter(name -> name.startsWith("y")).count();
        System.out.println(count);

        /*Listに"yamada"があるかtureかfalse*/
        boolean hasYamada = names.stream().anyMatch(name -> name.equals("yamada"));
        System.out.println(hasYamada);

        /*Listの名前を大文字に変換、ラムダ式をメソッド参照へ変更、出力*/
        names.stream().map(String::toUpperCase).toList().forEach(System.out::println);
    }
}

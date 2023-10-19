import java.util.Arrays;
import java.util.List;
//import java.util.function.Predicate;

public class PredicateEx {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("Java", "Python", "Kotlin", "JavaScript", "C", "PHP");

        //Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 3;

        palavras.stream()
            .filter(p -> p.length() < 5)
            .forEach(System.out::println);
    }
}

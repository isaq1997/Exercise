import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(2, 3, 4, 5);


        List<Integer> square = number.stream().map(x -> x * x).collect(Collectors.toList());
        System.out.println(square);

        List<String> names = Arrays.asList("Reflection","Collection","Stream");
        List<String> result = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
        System.out.println(result);

        List <Integer> number1 = Arrays.asList(2,3,4,5);
        int even = number1.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
        System.out.println(even);


    }
}
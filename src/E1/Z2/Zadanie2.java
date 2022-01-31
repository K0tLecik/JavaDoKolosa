package E1.Z2;

import java.io.File;
import java.math.BigInteger;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.Objects;

public class Zadanie2
{
    public static void main(String[] args)
    {
        Arrays.stream(IntSequence.of(1,2,3,4).toArray()).forEach(System.out::print);
        System.out.println("\n");
        Arrays.stream(IntSequence.squares((long)4).toArray()).forEach(obj -> System.out.print("["+obj+"]"));
        System.out.println("\n");

        File file = new File("src/E1");
        String[] st = file.list();

        Arrays.stream(st).map(i->{if (!i.contains(".xd"))return i;return null;}).filter(Objects::nonNull).forEach(System.out::println);

    }

    public interface IntSequence
    {
        static Stream<Integer> of(Integer... a)
        {
            Stream<Integer> stream1 = Stream.of(a);
            Stream<Integer> stream2 = Stream.iterate(1, i -> 1).limit(100);
            return Stream.concat(stream1, stream2);
        }

        static Stream<BigInteger> squares(Long a)
        {
            Stream<BigInteger> stream1 = Stream.iterate(BigInteger.valueOf(a), i -> i.add(BigInteger.ONE)).map(i -> i.multiply(i)).limit(100);
            return stream1;
        }
    }
}

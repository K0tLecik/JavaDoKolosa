package E1.Z1;

import java.time.LocalDate;
import java.math.BigInteger;

public class Zadanie1
{
    public static void main(String[] args)
    {
        BigInteger[] sortedBigInts = new BigInteger[]{new BigInteger("5"), new BigInteger("17"), new BigInteger("94"), new BigInteger("901"), new BigInteger("901"), new BigInteger("5236")};
        BigInteger[] unsortedBigInts = new BigInteger[]{new BigInteger("7246"), new BigInteger("901"), new BigInteger("9"), new BigInteger("523")};
        LocalDate[] sortedDates = new LocalDate[]{LocalDate.of(2020,8,2), LocalDate.of(2020,10,16), LocalDate.of(2020,11,21), LocalDate.of(2021,4,13)};
        LocalDate[] unsortedDates = new LocalDate[]{ LocalDate.of(2021,8,29), LocalDate.of(2019,11,1), LocalDate.of(2020,3,6), LocalDate.of(2021,12,3)};
        String[] sortedStrings = new String[]{"a", "b", "c", "d"};
        String[] unsortedStrings = new String[]{"b", "a", "c", "d"};

        System.out.println(ArrayUtil.isSorted(sortedBigInts));
        System.out.println(ArrayUtil.isSorted(unsortedBigInts));
        System.out.println(ArrayUtil.isSorted(sortedDates));
        System.out.println(ArrayUtil.isSorted(unsortedDates));
        System.out.println(ArrayUtil.isSorted(sortedStrings));
        System.out.println(ArrayUtil.isSorted(unsortedStrings));

    }

    static class ArrayUtil
    {
        public static <T extends Comparable<T>>boolean isSorted(T[] array)
        {
            for (int i = 0; i < array.length - 1; i++)
            {
                if (array[i + 1].compareTo(array[i]) < 0)
                {
                    return false;
                }
            }
            return true;
        }
    }
}

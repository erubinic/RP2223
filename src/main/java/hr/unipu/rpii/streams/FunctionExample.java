package hr.unipu.rpii.streams;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        int number = 10;

        // imp
        System.out.println(decrementByOne(number));

        int firstResult = decrementByOne(number);
        int secondResult = divideByTwo(firstResult);
        System.out.println(secondResult);

        // dec
        Function<Integer, Integer> decrementByOne = n -> n - 1;
        System.out.println(decrementByOne.apply(number));

        firstResult = decrementByOne.apply(number);

        Function<Integer, Integer> divideByTwo = n -> n / 2;

        secondResult = divideByTwo.apply(firstResult);
        System.out.println(secondResult);

        //

        int result = decrementByOne.andThen(divideByTwo).apply(number);
        System.out.println(result);

        //

        BiFunction<Integer, Integer, Float> decrementNumberByOneAndDivideBySecondNumber =
                (num, dividend) -> {
                  float res =  num - 1;

                  if(dividend == 0)
                      throw new IllegalArgumentException("Dividend can't be 0.");

                  return res / dividend;
                };

        float res = decrementNumberByOneAndDivideBySecondNumber.apply(number, 2);
        System.out.println(res);
    }

    static int decrementByOne(int number) {
        return number - 1;
    }

    static int divideByTwo(int number) {
        return number / 2;
    }
}

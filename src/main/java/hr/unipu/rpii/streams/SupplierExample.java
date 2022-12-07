package hr.unipu.rpii.streams;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        System.out.println(getRandomNumber());

        Supplier<Integer> getRandomNumber = () -> (int) (Math.random() * 100);
        System.out.println(getRandomNumber.get());
    }

    public static int getRandomNumber() {
        return (int) (Math.random() * 100);
    }
}

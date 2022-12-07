package hr.unipu.rpii.streams;

public class BasicRunnableExample {
    public static void main(String[] args) {
        validator("Pero", "Peric", () -> System.out.println("Nije uneseno prezime"));

        Runnable nijeUnesenoPrezime = () -> System.out.println("Nije uneseno prezime");

        validator("Pero", null, nijeUnesenoPrezime);
    }

    public static void validator(String name, String lastName, Runnable other) {
        System.out.println("Ime:" + name);

        if (lastName != null)
            System.out.println("Prezime:" + lastName);
        else
            other.run();
    }
}

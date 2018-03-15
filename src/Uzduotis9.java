public class Uzduotis9 {

    public static void main(String[] args) {

        String sk = sveikasSkaicius('b','d');

        System.out.println(sk);

    }

    public static String sveikasSkaicius(Character a, char b) {

        String s = a.toString() + b;
        return s;
    }
}

package lesson3;

public class MainClassLessonThree {
    public static void main(String[] args) {
        ex0();
    }

    private static void ex0() {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

        System.out.println(s1 == s5);
        System.out.println(s1.equals(s5));
    }
}


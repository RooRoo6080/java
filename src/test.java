public class test {
    public static void main (String[] args) {
        ArrayMaker am = new ArrayMaker();
        for (Integer i : am.arrayMaker(1, 23)) {
            System.out.print(i + " ");
        }
        System.out.println(am.arrayMaker(1, 23)[5]);
    }
}
public class Main {
    public static void main(String[] args) {
        StringBuffer strBuffer = new StringBuffer("Я люблю пить пиво!");
        System.out.println(strBuffer.toString());
        strBuffer.reverse();
        System.out.println(strBuffer.toString());
    }
}
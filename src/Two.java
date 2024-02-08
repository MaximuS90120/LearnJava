public class Two {
    public static void main(String[] args) {
        String[] a = { " Я "," люблю "," пить "," пиво "," ! "};
        for (int i=0; i<a.length; i++){
            System.out.print(a[i]);
        }

        System.out.println();

        int c = 0;

        for (int i=0; i<a.length; i++){
            c = a.length - 1 - i;
            System.out.print(a[c]);
        }
    }
}
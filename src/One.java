public class One {
    public static void main(String[] args) {

                int mass[] = new int[12];

                int maxint = Integer.MAX_VALUE;
                int minint = Integer.MIN_VALUE;

                for (int i = 0; i < mass.length; i++) {
                    mass[i] = (int)(Math.random() * maxint);;
                    System.out.print(mass[i] + " ");

                }

                int max = mass[0];
                int index = 0;

                for (int i = 0; i < mass.length; i++) {
                    if (mass[i] >= max ) {
                        max = mass[i];
                        index = i;
                    }
                }

                System.out.println();
                System.out.println("Самое большое число: " + max);
                System.out.println("Индекс самого большого числа: " + index);
            }
        }

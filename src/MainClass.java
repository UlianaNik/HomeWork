public class MainClass {
    public static void main(String[] args) {
        System.out.println("Hello");

        //2. Инициализация значений
        byte k = -89;
        short w = -32700;
        int pt = 25000 * 258;
        long d = 12325654654654654L;
        float h = -7.58f;
        char s = 69;
        char x = 'T';
        boolean p = false;
        //System.out.println(x);

        calcResult(7, 8.3f, 15, 25.7f);
        calcTrue(-7, 9);
        negPos(-10);
        posNeg(10);
        printHola("Lukas");

        if (visokGod(2000)) {
            System.out.println("високосный");
        } else {
            System.out.println("Не Високосный");
        }

    }


    // 3.метод вычисления выражения
   public static float calcResult (float a, float b, float c, float d) {
        float result = a * (b + (c / d));
        //System.out.println("Результат вычислений" + " " + result);
        return (result);
    }

    // П. 4. Не поняла, почему не возвращается true или false в отладчике!:(
    public static boolean calcTrue (int numOne, int numSec) {
        int sum = numOne + numSec;
        return ((sum >= 10) && (sum <= 20));
    }


    // п. 5
   public static void negPos(int number) {
        if (number >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    // п. 6 То же, что и в п. 4 - не поняла, почему не выводится true/false? будто игнорирует код
   public static boolean posNeg(int v) {
        return v < 0;
    }


    // п. 7
    public static void printHola(String word) {
        System.out.println("*************");
        System.out.println("Hi" + "," + " " + word);
        System.out.println("*************");
    }

    //п. 8
    public static boolean visokGod(int year) {

        //условие должно быть true для високосного года!
        return (year%4==0 && year %400 == 0) || (year%4 == 0 && year%100!= 0);
                    }

}
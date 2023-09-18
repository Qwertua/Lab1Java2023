public class Main {
    public static void main(String[] args) {
        try {
            CalculatingTask1 calculatingTask1 = new CalculatingTask1();

            System.out.println(calculatingTask1.calcMethod(3, 4, 9, 10));
        } catch (IllegalArgumentException e) {
            System.out.println("Перевірте коректність введених даних " +  e.getMessage());
        }

    }
}

public class CalculatingTask1 {
    public double calcMethod(int a, int b, int m, int n){
        int ID = 5387;
        int C3 = ID % 3;
        int C = C3;
        double result = 0;
        if ((a>n) || (b>m)){
            throw new IllegalArgumentException("Некоректно введені результати , відповідь буде 0");
        }
        if (a<C) {
            throw new IllegalArgumentException("Ділення на 0");
        }


        for (int i = a ; i <= n ; i++){

            for (int j = b; j <= m ; j++ ) {
                result += (double) (i + j) / (i - C);
            }
        }
        return result;
    }

}

public class CalculatingTask1 {
    public int calcMethod(int a, int b, int m, int n){
        int ID = 5387;
        int C2 = ID % 2;
        int C3 = ID % 3;
        int C5 = ID % 5;
        int C7 = ID % 7;
        int C = C3;
        int result = 0;

        if ((a>n) && (b>m)){
            throw new IllegalArgumentException();

        }

        for (int i = a ; i < n ; i++){
        for (int j = b; j < m ; j++ ){
            if (((i-C) == 0)){
                throw new IllegalArgumentException();
            }
            result = result + ((i+j) / (i -C));
        }



        }
        return result;




    }

}

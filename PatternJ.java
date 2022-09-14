public class PatternJ {

    public static void main (String[] args){
        int n = 8;
        for (int i = 0; i < n; i++){
            for (int j = 0; j<n; j++){
                if (   (j == n - 1 && i != n - 1) || (i > (n / 2) - 1 && j == 0 && i != n - 1 )){
                    System.out.print("*");
                    //j==1 && i==n-1 && i==n-2 && i==n-3 ||i==n-1 && j==1 &&j==2 && j==3
                }else {
                    System.out.print(" ");

                }
            }
            System.out.println();
        }
    }
}

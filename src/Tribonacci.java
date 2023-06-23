public class Tribonacci {
    public static void main(String[] args) {

        int T0 = 0, T1 = 1, T2 = 1;
        int n = 25;
        int res = 0;
        for (int i = 1; i <= n - 2; i++) {
            res = T2 + T1 + T0;
            T0 = T1;
            T1 = T2;
            T2 = res;

        }
        System.out.print(res);
    }
}

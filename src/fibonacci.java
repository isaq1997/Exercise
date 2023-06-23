public class fibonacci {
    public static void main(String[] args) {
        int a1=1;
        int a2=2;
        int res=0;
        int n=3;



        for (int i=1;i<=n-2;i++){
            res=a1+a2;
            a1=a2;
            a2=res;
        }
        System.out.println(res);

    }
}

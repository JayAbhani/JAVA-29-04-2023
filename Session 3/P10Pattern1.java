public class P10Pattern1 {
    public static void main(String[] args) {
        int n = 5;
        int st = 1;

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=st; j++) {
                System.out.print("*\t");
            }
            System.out.println();
            st++;
        }
    }
}

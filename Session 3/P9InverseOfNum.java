public class P9InverseOfNum {
    public static void main(String[] args) {
        int n = 23415;
        int position = 1;
        int inv = 0;

        while(n > 0) {
            int ld = n % 10;
            inv = inv + (position * (int)Math.pow(10, ld-1));
            n = n / 10;
            position++;
        } 
        System.out.println(inv);
    }
}

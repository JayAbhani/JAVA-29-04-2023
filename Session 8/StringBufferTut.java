public class StringBufferTut {
    public static void main(String[] args) {
        StringBuffer sbfr = new StringBuffer("jay");
        StringBuilder sbdr = new StringBuilder("itv");

        String str = "physics";
        StringBuffer sbfr1 = new StringBuffer();    //capacity=16
        StringBuffer sbfr2 = new StringBuffer(str);
        StringBuffer sbfr3 = new StringBuffer(20);
    }
}

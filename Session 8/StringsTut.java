public class StringsTut {
    public static void main(String[] args) {
//        String str1 = "jay";
//        System.out.println(str1);
//
//        String str2 = new String("abhani");
//        System.out.println(str2);
//
//        String str3 = "itv";
//        str3 = "itvedant";
//        System.out.println(str3);

        char[] c = {'j', 'a', 'y'};
        String myName = new String(c);
        System.out.println(myName);

        StringBuffer sbfr = new StringBuffer("abc");
        StringBuilder sbdr = new StringBuilder("xyz");
        String str4 = new String(sbfr);
        String str5 = new String(sbdr);
    }
}

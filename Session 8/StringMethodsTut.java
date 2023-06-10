public class StringMethodsTut {
    public static void main(String[] args) {

        String str = "physics";
        String str2 = "chemistry";
        String str3 = "  maths    ";
        String str4 = "cse";
        String str5 = "cse";
        String str6 = "Cse";

        System.out.println(str.length());   //length()

        System.out.println(str.charAt(3));  //charAt()

        System.out.println(str.substring(2));   //substring()
        System.out.println(str.substring(2, 5));

        System.out.println(str.concat(str2));       //concat()
        System.out.println(str + str2);

        System.out.println(str.indexOf('h'));       //indexOf()
        System.out.println(str.indexOf("si"));
        System.out.println(str.indexOf('f'));
        System.out.println(str.indexOf("s", 4));

        //lastIndexOf()

        System.out.println(str.toUpperCase());      //toLoweCase()

        //toUpperCase()

        System.out.println(str3.trim());    //trim()

        System.out.println(str.replace('h', 'm'));      //replace()
        System.out.println(str.replace('s', 't'));

        System.out.println(str4.equals(str5));      //equals()
        System.out.println(str5.equalsIgnoreCase(str6));    //equalsIgnoreCase()
    }
}


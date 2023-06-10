import java.util.ArrayList;

class Assignment1 {
    public static void main(String[] args) {
        // question-1
        // ArrayList<Integer> al = new ArrayList<>();
        // al.add(2);
        // al.add(4);
        // al.add(7);
        // int sum = findSum(al);
        // System.out.println(sum);


        // question-2
        ArrayList<String> al = new ArrayList<>();
        al.add("jay");
        al.add("jainam");
        al.add("neha");
        al.add("jinal");
        int count = countStrings(al, "j");
        System.out.println(count);
    }

    public static int findSum(ArrayList<Integer> al) {
        int sum = 0;
        for(int i=0; i<al.size(); i++) {
            sum = sum + al.get(i);
        }
        return sum;
    }

    public static int countStrings(ArrayList<String> al, String prefix) {
        int count = 0;
        for(int i=0; i<al.size(); i++) {
            if(al.get(i).startsWith(prefix)) {
                count = count + 1;
            }
        }
        return count;
    }

}
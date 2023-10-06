package StringProg;

public class CountingDuplicateChar {
    public static void main(String[] args) {
        String str="Aarambh";
        int count=0;
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i)=='a'||str.charAt(i)=='A'){
                count++;
            }
        }
        System.out.println(count);
    }
}

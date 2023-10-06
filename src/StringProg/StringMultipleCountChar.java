package StringProg;
class StringMultipleCountChar{
    public static void main(String[] args) {
        String str="tdit";
        int[]count=new int[256];
        for (int i = 0; i <str.length() ; i++) {
            char c=str.charAt(i);
            count[c]++;
        }
        for (int i = 0; i < count.length ; i++) {
            if (count[i]>0){
                System.out.println((char)i+"="+count[i]);
            }
        }
    }
}


class SecondMethod{
        static final int MAX_CHAR = 256;
        static void getOccurringChar(String str){
            int count[] = new int[MAX_CHAR];
            int len = str.length();
            for (int i = 0; i < len; i++)
                count[str.charAt(i)]++;
            char ch[] = new char[str.length()];
            for (int i = 0; i < len; i++) {
                ch[i] = str.charAt(i);
                int find = 0;
                for (int j = 0; j <= i; j++) {
                    if (str.charAt(i) == ch[j])
                        find++;
                }

                if (find == 1)
                    System.out.println("Number of Occurrence of "+ str.charAt(i) +" is:"+count[str.charAt(i)]);
            }
        }
        public static void main(String[] args)
        {
            String str = "tdit";
            getOccurringChar(str);
        }
}


class Demo{
    public static void main(String[] args) {
        String s="HapPyHeLlo";
        //String str=s.toLowerCase();
        String str=s.toUpperCase();
        int sum=0;
        int[]count=new int[256];
        for (int i = 0; i <str.length() ; i++) {
            char c=str.charAt(i);
            count[c]++;
            sum=sum+str.charAt(i);
        }
        System.out.println(sum);
        for (int i = 0; i < count.length ; i++) {
            if (count[i]>0){
                System.out.println((char)i+"="+count[i]);
            }
        }
    }
}

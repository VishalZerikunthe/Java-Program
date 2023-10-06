package StringProg;
import java.util.StringJoiner;
public class StringJoiner1 {
    public static void main(String[] args) {
        StringJoiner sj=new StringJoiner(",","[","]");
        sj.add("hi").add("hello").add("bye");
        System.out.println(sj);

        StringJoiner sj1=new StringJoiner(":");
        sj1.add("hello").add("hi").add("bye");
        System.out.println(sj1);
    }
}


import java.util.*;

public class LyricWord {
    public static final String[] lyric = {"you","say","it","best","when","you", " say","nothing","at","all"};

    public static void main(String[] args) {
        List words = new ArrayList();
        for ( String w : lyric)
            words.add(w);

        for (Object o : words)
            System.out.println("\n-------------------------------");
        System.out.println("Contain [you]" + words.contains("you"));
        System.out.println("Contains [me]?:" + words.contains("me"));
        System.out.println("Where's [say]?:" + words.indexOf("say"));
        System.out.println("Where's the last [say]?: " +words.lastIndexOf("say"));

        Collections.sort(words);

        for (Object o : words){
            System.out.println(o + " ");
        }
    }
}

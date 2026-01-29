import java.util.HashMap;
import java.util.Map;

class CharacterPattern{
    private char character;
    private String[] pattern;

    public CharacterPattern(char character, String[] pattern){
        this.character = character;
        this.pattern = pattern;
    }
    public String getLine(int index){
        return pattern[index];
    }
    public char getCharacter(){
        return character;
    }
}
public class OOPSBannerApp {
    public static void main(String[] args) {
        Map<Character, CharacterPattern> bannerMap = new HashMap<>();

        bannerMap.put('O', new CharacterPattern('O', new String[]{
                "    ***    ",
                " **     ** ",
                "**       **",
                "**       **",
                "**       **",
                " **     ** ",
                "    ***    "
        }));

        bannerMap.put('P', new CharacterPattern('P', new String[]{
                "******  ",
                "**    **",
                "**    **",
                "******  ",
                "**      ",
                "**      ",
                "**      "
        }));

        bannerMap.put('S', new CharacterPattern('S', new String[]{
                "    *****  ",
                "  **       ",
                " **        ",
                "   ***     ",
                "      **   ",
                "     **    ",
                "*****     "
        }));
        renderBanner("OOPS", bannerMap);
    }
    private static void renderBanner(String word, Map<Character, CharacterPattern> bannerMap){

        for (int i=0;i<7;i++){
            StringBuilder line = new StringBuilder();

            for(char cp: word.toCharArray()){
                CharacterPattern bannerCharacter = bannerMap.get(cp);
                line.append(bannerCharacter.getLine(i)).append(" ");
            }
            System.out.println(line);
        }
    }
}
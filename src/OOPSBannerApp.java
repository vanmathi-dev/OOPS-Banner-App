public class OOPSBannerApp {
    public static void main(String[] args) {
        String[] oopsArrayLoop = {
                String.join("", "    ***    ", " ", "    ***    "," ", "******  ","    *****  "),
                String.join(""," **     ** ", " "," **     ** "," ", "**    **", "  **       "),
                String.join("", "**       **", " ","**       **"," ", "**    **"," **        "),
                String.join("", "**       **", " ","**       **"," ",  "******  ",  "   ***     "),
                String.join("", "**       **", " ","**       **"," ", "**      ", "      **   "),
                String.join("", " **     ** ", " "," **     ** "," ", "**      ", "     **    "),
                String.join("",  "    ***    ", " ",  "    ***    "," ","**      ", "*****     ")
        };

        for (String line : oopsArrayLoop){
            System.out.println(line);
        }
    }
}
public class OOPSBannerApp {
    public static void main(String[] args) {
        String[] o = getOPattern();
        String[] p = getPPattern();
        String[] s = getSPattern();

        String[] banner = new String[o.length];

        for (int i = 0; i<o.length; i++){
            banner[i] =o[i] +" "+o[i] + " "+ p[i] +" "+s[i];
        }

        for (String line: banner){
            System.out.println(line);
        }
    }
    //Method to generate O pattern
    private static String[] getOPattern(){
        return new String[]{
                "    ***    ",
                " **     ** ",
                "**       **",
                "**       **",
                "**       **",
                " **     ** ",
                "    ***    ",
        };
    }
    //Method to generate P pattern
    private static String[] getPPattern(){
        return new String[]{
                "******  ",
                "**    **",
                "**    **",
                "******  ",
                "**      ",
                "**      ",
                "**      "
        };
    }
    private static String[] getSPattern(){
        return new String[]{
                "    *****  ",
                "  **       ",
                " **        ",
                "   ***     ",
                "      **   ",
                "     **    ",
                "*****     "
        };
    }
}
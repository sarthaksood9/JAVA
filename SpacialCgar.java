import java.util.Scanner;

public class SpacialCgar {
    public static void main(String[] args) {
        String s;
        int l = 0;
        int n = 0;
        int scr = 0;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        int len=s.length();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // System.out.println(s.charAt(i));
            if (Character.isLetter(ch)) {
                l++;
            } else if (Character.isDigit(ch)) {
                n++;
            }
            else{
                scr++;
            }
        }
        float alLen=(float)l*100/len;
        float NumLen=n*100/len;
        float SpcLen=scr*100/len;
        System.out.println("Alphabet Are:-" + alLen+"%");
        System.out.println("Number Are:-" + NumLen+"%");
        System.out.println("sp Are:-" + SpcLen+"%");


        System.out.println((float) l*100/len);


        // System.out.println(n/s.length()*100);
        // System.out.println(n/s.length()*100);
        // System.out.println(scr/s.length()*100);
    }
}

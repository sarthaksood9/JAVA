public class CheckLeet {
    public static void main(String[] args) {
        String s = "4193 with words";
        String ch = "";
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
            char cc = s.charAt(i);
            int ccint = (int) cc;
            if (s.charAt(i) == ' ' || (ccint >= 65 && ccint <= 122)) {
                continue;
            } else if (s.charAt(i) == '-') {
                ch = ch + s.charAt(i);
            } else {
                sb.append(s.charAt(i));
            }

        }
        sb.insert(0, ch);
        String singleString = sb.toString();
        int xf = Integer.parseInt(singleString);
        
        return xf;
    }
}

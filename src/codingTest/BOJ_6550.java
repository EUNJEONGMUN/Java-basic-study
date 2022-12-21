package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_6550 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String str;

        while ((str = br.readLine()) != null) {
            st = new StringTokenizer(str, " ");
            String s = st.nextToken();
            String t = st.nextToken();

            int idx = 0;
            for (int i=0; i<t.length(); i++) {
                if (s.charAt(idx) == t.charAt(i)) {
                    idx++;
                }
                if (idx==s.length()) {
                    break;
                }
            }

            if (s.length()==idx) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

}

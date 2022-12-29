package codeTree.intermediateMid.dataStructureMid.hashMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class HashMap의기본 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

        HashMap<Integer, Integer> map = new HashMap<>();
        String command;
        int key;
        for (int loop=0; loop<N; loop++) {
            st = new StringTokenizer(br.readLine());
            command = st.nextToken();
            if (command.equals("add")) {
                map.put(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            } else if (command.equals("find")) {
                key = Integer.parseInt(st.nextToken());
                if (map.containsKey(key)) {
                    System.out.println(map.get(key));
                } else {
                    System.out.println("None");
                }
            } else if (command.equals("remove")) {
                key = Integer.parseInt(st.nextToken());
                map.remove(key);
            }
        }
    }
}

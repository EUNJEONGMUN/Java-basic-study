package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class BOJ_19942 {
    static int N, mp, mf, ms, mv;
    static List<Food> foods = new ArrayList<>();
    static int minPrice = Integer.MAX_VALUE;
    static List<Integer> answer = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        mp = Integer.parseInt(st.nextToken());
        mf = Integer.parseInt(st.nextToken());
        ms = Integer.parseInt(st.nextToken());
        mv = Integer.parseInt(st.nextToken());

        for (int index = 1; index < N + 1; index++) {
            st = new StringTokenizer(br.readLine());
            foods.add(new Food(
                    index,
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken())));
        }
        bf(0, new ArrayList<>());

        if (answer.size()==0) {
            System.out.println(-1);
        } else {
            System.out.println(minPrice);
            answer.stream().forEach(idx -> System.out.print(idx+" "));

        }
    }

    private static void bf(int idx, List<Food> choice) {
        if (choice.size()>0 && Food.getTotalP(choice)>=mp && Food.getTotalF(choice)>=mf
                && Food.getTotalS(choice)>=ms && Food.getTotalV(choice)>=mv) {
            int totalPrice = Food.getTotalPrice(choice);
            if(totalPrice< minPrice) {
                minPrice = totalPrice;
                answer = choice.stream().map(Food::getIndex).collect(Collectors.toList());
            }

        }

        if (idx == foods.size()) {
            return;
        }

        for (int i = idx; i < foods.size(); i++) {
            choice.add(foods.get(i));
            bf(i+1, choice);
            choice.remove(choice.size()-1);
        }
    }


    static class Food {
        private int index;
        private int p;
        private int f;
        private int s;
        private int v;
        private int price;

        public Food(int index, int p, int f, int s, int v, int price) {
            this.index = index;
            this.p = p;
            this.f = f;
            this.s = s;
            this.v = v;
            this.price = price;
        }

        public int getIndex() {
            return index;
        }

        public int getP() {
            return p;
        }

        public int getF() {
            return f;
        }

        public int getS() {
            return s;
        }

        public int getV() {
            return v;
        }

        public int getPrice() {
            return price;
        }

        public static int getTotalP(List<Food> foods) {
            return foods.stream().mapToInt(Food::getP).sum();
        }

        public static int getTotalF(List<Food> foods) {
            return foods.stream().mapToInt(Food::getF).sum();
        }

        public static int getTotalS(List<Food> foods) {
            return foods.stream().mapToInt(Food::getS).sum();
        }

        public static int getTotalV(List<Food> foods) {
            return foods.stream().mapToInt(Food::getV).sum();
        }

        public static int getTotalPrice(List<Food> foods) {
            return foods.stream().mapToInt(Food::getPrice).sum();
        }

        @Override
        public String toString() {
            return "idx:"+index+" price:"+price;
        }
    }
}

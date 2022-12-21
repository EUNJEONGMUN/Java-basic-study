package baekjoonBasic.function.boj_4673;

public class Main {
    public static void main(String[] args) {

        boolean[] arr = new boolean[10001];

        for (int i=1; i<10001; i++) {
            int res = self_num(i);
            if (res<10001) {
                arr[res] = true;
            }
        }
        for (int i=1; i<10001; i++) {
            if (!arr[i]) {
                System.out.println(i);
            }

        }
    }

    private static int self_num(int num) {
        // num이 두 자리를 넘을 수도 있음
        int sum = num;
        while (num>0){
            sum += num%10;
            num /= 10;
        }
        return sum;
    }
}

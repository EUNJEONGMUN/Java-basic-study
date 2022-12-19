package codeTree.noviceMid.sort;

import java.util.Scanner;

public class 공공칠 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mission mission = new Mission(sc.next(), sc.next().charAt(0), sc.nextInt());
        System.out.println(mission);

    }
    static class Mission {
        String secretCode;
        char meetingPoint;
        int time;

        public Mission(String secretCode, char meetingPoint, int time) {
            this.secretCode = secretCode;
            this.meetingPoint = meetingPoint;
            this.time = time;
        }

        @Override
        public String toString() {
            return "secret code : "+this.secretCode+"\nmeeting point: "+this.meetingPoint+"\ntime: "+this.time;
        }
    }
}


package codeTree.noviceMid.sort.비오는날;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Weather[] arr = new Weather[n];

        for (int i=0; i<n; i++) {
            arr[i] = new Weather(sc.next(), sc.next(), sc.next());
        }

        String last_date = "2200-01-01";
        Weather res = new Weather();
        for (int i=0; i<n; i++) {

            if (arr[i].status.equals("Rain") && last_date.compareTo(arr[i].date)>0) {
                last_date = arr[i].date;
                res.date = arr[i].date;
                res.day = arr[i].day;
                res.status = arr[i].status;
            }
        }

        System.out.println(res.date+" "+res.day+" "+res.status);
    }
}

class Weather {
    String date;
    String day;
    String status;

    public Weather () {

    }
    public Weather(String date, String day, String status) {
        this.date = date;
        this.day = day;
        this.status = status;
    }
}

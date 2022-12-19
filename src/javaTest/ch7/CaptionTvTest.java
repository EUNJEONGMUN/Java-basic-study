package javaTest.ch7;

import static java.lang.Math.*;

class TV {
    boolean power;
    int channel;

    void power(){power= !power;}
    void channelUp() {++channel;}
    void channelDown() {--channel;}
}
class CaptionTv extends TV{
    boolean caption;
    void displayCaption(String text) {
        if (caption) {
            System.out.println(text);
        }
    }
}

class CaptionTvTest {
    public static void main(String[] args) {
        System.out.println(random());
        CaptionTv ctv = new CaptionTv();
        ctv.channel = 10;
        ctv.channelUp();
        System.out.println(ctv.channel);
        ctv.displayCaption("Hello, world");
        ctv.caption = true;
        ctv.displayCaption("Hello,,, world");
    }
}

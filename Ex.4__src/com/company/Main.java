package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TV tv = new TV();
        System.out.println("Please press the button '7' to turn on the TV:");
        int buttonToTurnON = scanner.nextInt();
        if (buttonToTurnON == 7) {
            tv.turnOnOrOfTheTV();
            System.out.println("Please enter the channel you want:");
            int channel = scanner.nextInt();
            tv.setChannel(channel);
            System.out.println("Please enter the level of volume you want:");
            int volume = scanner.nextInt();
            tv.setVolumeLevel(volume);
            System.out.println("If you want to turn off the TV press '7':");
            int buttonToTurnOff = scanner.nextInt();
            if (buttonToTurnOff == 7) {
                tv.turnOnOrOfTheTV();
            }
        }
    }
}

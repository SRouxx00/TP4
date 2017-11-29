package com.sroux00.chatserver.util;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class MathUtil {

    // Cette méthode nous permet de storé les ip en "long" afin de les mettre dans une database par example.
    public static long ipToDec(String ipAddress) {
        String[] ips = ipAddress.split("\\.");
        long result = 0;
        for(int i = 0; i < ips.length; i++) {
            int power = 3 - i;
            int ip = Integer.parseInt(ips[i]);
            result += ip * Math.pow(256, power);
        }
        return result;
    }

    public static String decToIp(long ip) {

    }
}

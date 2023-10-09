package com.service.util;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.Instant;
public class GetTransactionDetail {
    public static String generateTransactionId() {
        String systemIP = getLocalIPAddress();
        String epochTimestamp = String.valueOf(getCurrentEpochTimestamp());

        return systemIP + ":" + epochTimestamp;
    }
    private static String getLocalIPAddress() {
        try {
            InetAddress localHost = InetAddress.getLocalHost();
            return localHost.getHostAddress();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return null;
    }
    private static long getCurrentEpochTimestamp() {
        Instant currentInstant = Instant.now();
        return currentInstant.getEpochSecond();
    }
}
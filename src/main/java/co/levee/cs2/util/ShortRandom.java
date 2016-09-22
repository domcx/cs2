package co.levee.cs2.util;

import java.util.Date;
import java.util.Random;

/**
 * Created by Dominic Moorman on 9/19/16.
 */
public class ShortRandom {
    private Random random = new Random(new Date().getTime());

    public String shortRandom() {
        byte[] buf = new byte[4];
        random.nextBytes(buf);
        return bytesToHex(buf);
    }

    public static String bytesToHex(byte[] in) {
        String buf = "";
        for (byte b : in) {
            buf += String.format("%02x", b);
        }
        return buf;
    }
}

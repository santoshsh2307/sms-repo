package com.example.demo.util;

import java.util.Random;

public class OptUtilClass {

	public static int generateSixDigitNumber() {
        Random random = new Random();
        return 100000 + random.nextInt(900000); // range: 100000 to 999999
    }
}

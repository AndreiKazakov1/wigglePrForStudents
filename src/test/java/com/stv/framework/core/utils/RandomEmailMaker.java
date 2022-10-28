package com.stv.framework.core.utils;

import java.util.Random;

public class RandomEmailMaker {

    public String randomEmailMakerFunc() {
        Random random = new Random();
        int x = random.nextInt(9999);
        return "test" + x + "@gmail.com";
    }

    public String email = randomEmailMakerFunc();
}

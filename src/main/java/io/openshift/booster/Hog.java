package io.openshift.booster;

import java.util.Arrays;

public class Hog implements Runnable {
    
    private int[] array = new int[128 * 200 * 1024];
    
    @Override
    public void run() {
        array = new int[128 * 150 * 1024];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.floor(Integer.MAX_VALUE * Math.random());
        }
        Arrays.sort(this.array);
    }
    
}

package arrays;

import java.util.Arrays;

public class Sample {


    public static void main(String[] args) {

        //int samples []  = {23,3,45,22,46};
        int [] samples = {23,3,45,22,46};

        System.out.println(Arrays.toString(samples));
        Arrays.sort(samples);
        System.out.println(Arrays.toString(samples));
        int  val  =  samples.length;
    }
}

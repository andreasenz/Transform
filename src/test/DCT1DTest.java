package test;

import implementation.DCT1D;
import implementation.IDCT1D;
import interfaces.Transform;
import jdk.jshell.execution.Util;
import utilities.Utility;

public class DCT1DTest {

    public static void main(String[] args) {
        double[] result,source,same;
        Transform transform;
        source = Utility.generateRandomArray(4);
        //Calculate DCT 1-D based on the random array
        transform = new DCT1D();
        transform.setSourceData(source);
        transform.calculate();
        result = (double[]) transform.getResult();
        //Calculate the Inverse DCT 1-D based on the DCT arrays
        transform = new IDCT1D();
        transform.setSourceData(result);
        transform.calculate();
        same = (double[]) transform.getResult();

        System.out.println("Original array:");
        Utility.printArray(source,source.length);
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Transformed array:");
        Utility.printArray(result,result.length);
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Inverse transformed array:");
        Utility.printArray(same,same.length);
    }
}

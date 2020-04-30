package test;

import implementation.Complex;
import implementation.DFT;
import implementation.IDFT;
import interfaces.Transform;
import utilities.Utility;

public class DFTTest {
    public static void main(String[] args) {
        double[] source,same;
        Complex[] result;
        Transform transform;
        source = Utility.generateRandomArray(4);
        //Calculate the DFT based on the random array
        transform = new DFT();
        transform.setSourceData(source);
        transform.calculate();
        result = (Complex[]) transform.getResult();
        //Calculate the Inverse DFT based on the transformed array
        transform = new IDFT();
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

package test;

import implementation.DCT2D;
import implementation.IDCT2D;
import interfaces.Transform;
import utilities.Utility;

public class DCT2DTest {

    public static void main(String[] args) {
        double[][] result,source,same;
        Transform transform;
        source = Utility.generateRandomMatrix(4);
        //Calculate DCT 2-D based on the random matrix
        transform = new DCT2D();
        transform.setSourceData(source);
        transform.calculate();
        result = (double[][]) transform.getResult();
        //Calculate the Inverse DCT 1-D based on the DCT matrix
        transform = new IDCT2D();
        transform.setSourceData(result);
        transform.calculate();
        same = (double[][]) transform.getResult();

        System.out.println("Original matrix:");
        Utility.printMatrix(source,source.length);
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Transformed matrix:");
        Utility.printMatrix(result,result.length);
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Inverse transformed matrix:");
        Utility.printMatrix(same,same.length);
    }
}

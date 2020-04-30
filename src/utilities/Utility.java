package utilities;

import java.util.Random;

public class Utility {

    public static double calculateAlpha(int k, int n){
        return (k==0) ? Math.sqrt(1/(double)n) : Math.sqrt(2/(double)n);
    }

    public static double calculateCos(int x, int u, int N) {
        return Math.cos(( (((2*((double)x)+1)*((double)u))*Math.PI) )/((double)2*N));
    }

    public static double calculateCosDFT(int k, int n, int N) {
        return Math.cos(((2*Math.PI)*k*n)/N);
    }

    public static double calculateSinDFT(int k, int n, int N) {
        return Math.sin(((2*Math.PI)*k*n)/N);
    }

    public static double[] generateRandomArray(int size) {
        double rangeMin = 0;
        double rangeMax = 101;
        Random random = new Random();
        double[] result = new double[size];
        for(int i=0; i<size; i++)
            result[i] = rangeMin + (rangeMax - rangeMin) * random.nextDouble();
        return result;
    }

    public static double[][] generateRandomMatrix(int size) {
        double rangeMin = 0;
        double rangeMax = 101;
        Random random = new Random();
        double[][] result = new double[size][size];
        for(int i=0; i<size; i++)
            for(int j=0; j<size; j++)
                result[i][j] = rangeMin + (rangeMax - rangeMin) * random.nextDouble();
        return result;
    }

    public static void printArray(double[] array, int size) {
        for(int i=0; i<size; i++)
            System.out.print(array[i]+"\t");
        System.out.println();
    }

    public static void printArray(Object[] array, int size) {
        for(int i=0; i<size; i++)
            System.out.print(array[i]+"\t");
        System.out.println();
    }

    public static void printMatrix(double[][] array, int size) {
        for(int i=0; i<size; i++) {
            for (int j = 0; j < size; j++)
                System.out.print(array[i][j] + "\t");
            System.out.println();
        }
        System.out.println();
    }

}

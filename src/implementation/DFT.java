package implementation;

import interfaces.Transform;
import utilities.Utility;

public class DFT implements Transform {
    double[] source;
    Complex[] result;

    @Override
    public void setSourceData(Object src) {
        source = (double[]) src;
    }

    @Override
    public void calculate() {
        int N = source.length;
        result = new Complex[N];

        for(int k=0; k<N; k++){
            double sumR = 0;
            double sumI = 0;
            for(int n=0; n<N; n++){
                sumR += source[n] * Utility.calculateCosDFT(k,n,N);
                sumI += source[n] * Utility.calculateSinDFT(k,n,N);
            }
            sumR = sumR/(double)N;
            sumI = -1 * (sumI/(double)N);
            result[k] = new Complex(sumR, sumI);
        }
    }

    @Override
    public Object getResult() {
        return result;
    }
}

package implementation;

import interfaces.Transform;
import utilities.Utility;

public class IDFT implements Transform {
    Complex[] source;
    double[] result;

    @Override
    public void setSourceData(Object src) {
        source = (Complex[]) src;
    }

    @Override
    public void calculate() {
        int N = source.length;
        result = new double[N];

        for(int k=0; k<N; k++){
            for(int n=0; n<N; n++){
                result[k] += source[n].getR() * Utility.calculateCosDFT(k,n,N) - source[n].getI() * Utility.calculateSinDFT(k,n,N);
            }
        }
    }

    @Override
    public Object getResult() {
        return result;
    }
}

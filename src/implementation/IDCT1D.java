package implementation;

import interfaces.Transform;
import utilities.Utility;

public class IDCT1D implements Transform {
    double[] source;
    double[] result;

    @Override
    public void setSourceData(Object src) {
        source = (double[]) src;
    }

    @Override
    public void calculate() {
        int N = source.length;
        result = new double[N];
        for(int x=0 ; x<N ; x++) {
            for(int u=0; u<N; u++){
                result[x] += Utility.calculateAlpha(u,N)*source[u] * Utility.calculateCos(x,u,N);
            }
        }
    }

    @Override
    public Object getResult() {
        return result;
    }

}

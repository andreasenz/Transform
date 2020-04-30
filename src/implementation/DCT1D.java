package implementation;

import interfaces.Transform;
import utilities.Utility;

public class DCT1D implements Transform {
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
        for(int u=0 ; u<N ; u++){
            double sum = 0;
            for(int x=0 ; x<N ; x++){
                sum += source[x] * Utility.calculateCos(x, u, N);
            }
            result[u] = Utility.calculateAlpha(u,N) * sum;
        }
    }

    @Override
    public Object getResult() {
        return result;
    }


}

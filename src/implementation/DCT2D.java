package implementation;

import interfaces.Transform;
import utilities.Utility;

public class DCT2D implements Transform {
    double[][] source;
    double[][] result;

    @Override
    public void setSourceData(Object src) {
        source = (double[][]) src;
    }

    @Override
    public void calculate() {
        int N = source.length;
        int M = source[0].length;
        result = new double[N][M];

        for(int u=0; u<N; u++){
            for(int v=0; v<N; v++){
                double sum = 0;

                for(int x=0; x<N; x++){
                    for(int y=0; y<N; y++){
                        sum += source[x][y] * Utility.calculateCos(x,u,N) * Utility.calculateCos(y,v,N);
                    }
                }
                result[u][v] = Utility.calculateAlpha(u,N) * Utility.calculateAlpha(v,N) * sum;
            }

        }
    }

    @Override
    public Object getResult() {
        return result;
    }

}

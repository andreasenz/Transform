package implementation;

import interfaces.Transform;
import utilities.Utility;

public class IDCT2D implements Transform {
    double[][] source;
    double[][] result;

    @Override
    public void setSourceData(Object src) {
        source = (double[][]) src;
    }


    @Override
    public void calculate() {
        int N = source.length;
        result = new double[N][N];

        for(int x=0; x<N; x++){
            for(int y=0; y<N; y++){

                for(int u=0; u<N; u++){
                    for(int v=0; v<N; v++){
                        result[x][y] += Utility.calculateAlpha(u,N) * Utility.calculateAlpha(v,N) * source[u][v] * Utility.calculateCos(x,u,N) * Utility.calculateCos(y,v,N);
                    }
                }

            }
        }

    }

    @Override
    public Object getResult() {
        return result;
    }
}

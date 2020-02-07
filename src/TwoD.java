import java.util.*;
import java.util.Arrays;
public class TwoD {
    Random random = new Random();
    int[][] help;
    int x;
    int y;
    public TwoD(int x, int y){
        this.help = new int[x][y];
        for(int i = 0; i < x; i ++){
            int[] temp = new int[y];
            for(int l = 0; l < y; l++){
                temp[l] = random.nextInt(100);
            }
            this.help[i] = temp;
            this.x = x - 1;
            this.y = y - 1;
        }
    }
    public int[] findMaxy(){
        int[] hep = new int[3];
        for(int i = 1; i < this.x; i ++){
            for(int l = 1; l<this.y; l++){
                int temp = this.help[i - 1][l]+this.help[i+1][l]+this.help[i][l]+this.help[i][l+1]+this.help[i][l-1];
                if(temp > hep[0]){
                    hep[0] = temp;
                    hep[1] = i;
                    hep[2] = l;
                }
            }
        }
        return hep;
    }
    public String getHelp(){
        return Arrays.deepToString(this.help);
    }
}

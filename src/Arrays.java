import java.util.*;
public class Arrays {
    int[] array = new int[3];
    ArrayList<Integer> help = new ArrayList<Integer>();
    public Arrays(int x, int y, int z){
        for(int i = 0; i < 3; i ++){
            this.array[i] = x;
        }
        for(int j = 0; j < z; j ++){
            help.add(y);
        }
    }
    public int[] getArray(){
        return this.array;
    }
    public ArrayList<Integer> getList(){
        return this.help;
    }
}

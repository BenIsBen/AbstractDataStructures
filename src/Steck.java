import java.util.Random;
import java.util.Stack;
import java.util.Arrays;

public class Steck {
    Random random = new Random();
    int[] help = new int[20];
    int[] fina = new int[20];
    public Steck(){
        for(int i = 0; i < 20; i++){
            int next = random.nextInt(100);
            this.help[i] = next;
        }
        Stack<Integer> stack = new Stack();
        for(int i = 0; i < this.help.length; i++){
            stack.push(this.help[i]);
        }
        for(int i = 0; i < help.length; i++){
            this.fina[i] = stack.pop();
        }
    }
    public String getHelp(){
        return Arrays.toString(this.help);
    }
    public String getFina(){
        return Arrays.toString(this.fina);
    }
}

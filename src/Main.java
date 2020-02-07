import java.util.ArrayList;

public class Main {
    public Main(){
        Arrays array = new Arrays(3, 4, 5);
        printArray(array);
        System.out.println("Break");
        Steck steck = new Steck();
        System.out.println(steck.getHelp());
        System.out.println(steck.getFina());
        System.out.println("break");
        Que que= new Que();
        System.out.println("break");
        Link link = new Link();
        System.out.println("break");
        TwoD d = new TwoD(10,10);
        System.out.println(d.getHelp());
        int[] p = d.findMaxy();
        System.out.println("Max: " + p[0] + " at " + p[1] + "," + p[2]);
    }
    public static void main(String[] args) {
        Main main = new Main();
    }
    public void printArray(Arrays x){
        int[] a = x.getArray();
        ArrayList<Integer> b = x.getList();
        for(int i = 0; i < a.length; i ++){
            System.out.println(a[i]);
        }
        System.out.println("break");
        for(int i = 0; i<b.size(); i++){
            System.out.println(b.get(i));
        }
    }
}

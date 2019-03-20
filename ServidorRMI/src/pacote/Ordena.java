
package pacote;

public class  Ordena{
    
    public static int [] converteInt(String args[]){
        int [] tmp = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            tmp[i] = Integer.parseInt(args[i]);
        }
        return tmp;
    }
    
    public static String converteStr(int args[]) {
        String tmp = "";
        for (int i : args){
            tmp = tmp.concat(" "+i);
        }
        return tmp;
    }
}


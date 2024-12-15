import java.util.Arrays;

public class Main {
    public  static void revStr(String str){
        char [] ch = str.toCharArray();
        Arrays.sort(ch);////a

        str= new String(ch);
        String s = "";
        int count =1;

        for(int i= 0; i<str.length();i++){
            if(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
            }
            else {
                s= s + str.charAt(i);
                //if(count==1)s=s+str.charAt(i);
                if(count>1){
                    s=s+count;
                    count=1;
                }
            }

        }
        System.out.println(s);

    }

    public static void main(String[] args) {
    revStr("zzzzzzaaaaaabbccbbbbbb");
    }
}
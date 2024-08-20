import java.util.Scanner;

public class userdefine13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String arr[] = { "-", "-", "-", "-", "-", "-", "-", "-", "-" };
        String player="X";
        for(int i=0;i<9;i++){
            int h= scan.nextInt();
            if (change(player,h,arr)){
                display(arr); 
                if (result (player,arr)){
                    System.out.println("Winner:"+player);
                    break;
                }
                player=execute(player);
                if (i==8){
                    System.out.println("draw match");
                }
            }else{
                System.out.println("Wrong move");
                i--;
            }
        }
    }
     public static String execute(String p){
        return p =="X"?"o":"X";
     }
     public static void display (String a1[]){
                 System.out.println(a1[0]+ "|"+a1[1]+"|"+a1[2]);
                 System.out.println(a1[3]+"|"+a1[4]+"|"+a1[5]);
                 System.out.println(a1[6]+"|"+a1[7]+"|"+a1[8]);
     }
     public static boolean change (String p,int h,String a1[]){
                if (a1[h-1]=="-"){
                    a1[h-1]=p;
                    return true;
                }else{
                    return false;
                }
                
     }
     public static boolean result (String p,String a[]){
            if ((a[0]==p && a[1]==p && a[2]==p)||
            (a[3]==p && a[4]==p && a[5]==p)    || 
            (a[6]==p && a[7]==p && a[8]==p)    ||
            (a[0]==p && a[3]==p && a[6]==p)    ||
            (a[1]==p && a[4]==p && a[7]==p)    ||
            (a[2]==p && a[5]==p && a[8]==p)    ||
            (a[0]==p && a[4]==p && a[8]==p)    ||
            (a[2]==p && a[4]==p  && a[6]==p)){
                return true;
            }else{
                return false;
            }
     }
 }
        
 


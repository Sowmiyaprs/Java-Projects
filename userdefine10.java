public class userdefine10 {
    public static void main(String[] args) {
        String arr []={"-","-","-","-","-","-","-","-","-"};
        char1(arr);
    }
    public static void char1(String a[]){
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
            if ((i+1)%3==0){
                System.out.println();
            }
        }
    }
}

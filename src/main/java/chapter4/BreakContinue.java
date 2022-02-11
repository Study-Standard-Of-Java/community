package chapter4;

public class BreakContinue {
    public static void main(String[] args) {
        for(int i=0; i<5; i++){
            System.out.print(i);
            if(i==1){
                continue;
            }
            if(i>2){
                break;
            }
        }
    }
}

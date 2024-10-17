package Sept.TASK;

public class ex_27092024_first_5_even_numbers {
    public static void main(String[] args) {
        /*for(int i=1;i<=10;i++){
            if(i%2==0){
                System.out.println("even num are " + i);
            }
        }*/

        int i=1;
        do{
            i++;
            if(i%2==0){
                System.out.println(i);
            }
        }while(i<=10);
    }
}

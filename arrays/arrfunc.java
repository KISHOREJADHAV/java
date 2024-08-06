import java.util.*;
 public class arrfunc {
    public static void arr(int marks[]){
     for (int i=0;i<marks.length;i++){
        marks[i]=marks[i]+1;
     }
}
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        int marks[] = {0,1,2,3,4,5,};
        arr(marks);
        for (int i=0;i<marks.length;i++){
        System.out.println(marks[i]);
}
}
 }
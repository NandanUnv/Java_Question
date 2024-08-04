import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      
      int date[] = new int[n];
      
      int mon[] = new int[n];
      
      int year[] = new int[n];
      
      for (int i=0; i<n; i++){
        date[i] = sc.nextInt();
        mon[i] = sc.nextInt();
        year[i] = sc.nextInt();
      } 
      
      
      int s_year[] = new int[n];
      
      for(int h=0; h<n; h++){
        s_year[h] = year[h];
      }
      
      Arrays.sort(s_year);
 
      for(int b=0; b<s_year.length; b++){
        for(int j=0; j<n; j++){
          if(s_year[b]==year[j]){
            System.out.println(date[j]+" "+mon[j]+" "+year[j]);
            break;
          }
        }
      }
  }
}

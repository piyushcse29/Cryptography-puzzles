package puzzles;
import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {

String no_cases;
String from,to;
Long long_from,long_to;
int i ;
System.out.println("Enter no of test cases");
           InputStreamReader is=new InputStreamReader(System.in);
           BufferedReader br1=new BufferedReader(is);
            no_cases=br1.readLine();
           int N = Integer.parseInt(no_cases);
//System.out.println(N);
String cases[] = new String[N];

            for(i=0;i<N;i++)
              cases[i]=br1.readLine();

  for(i=0;i<N;i++){
      Scanner lexer=new Scanner(cases[i]);
       while(lexer.hasNext()){
           from=lexer.next();
           to=lexer.next();
           
            long_from = Long.parseLong(from);
            long_to=Long.parseLong(to);
            checkprime(long_from,long_to);

       }
  }

      }

     static void checkprime(long from,long to){

         int count=0;
            
        for(long i=from;i<=to;i++){
            int sum=0;
            int squaresum=0;
                    String str=i+"";
                    int length=str.length();
                    char chr[]=str.toCharArray();

                for( int j=0;j<length;j++){
                     // System.out.println(chr[j]);
                      sum=sum+(chr[j]-48);
                      squaresum=squaresum+(chr[j]-48)*(chr[j]-48);
                
                }
                    System.out.println("In sum.."+sum);
                   System.out.println("In sqsum.."+squaresum);
         if(prime(sum)&&prime(squaresum)){
         count=count+1;
         }
        }
         System.out.println(count);
     }
    
        static boolean prime(int sum){
          if(sum==1)
              return false;
          for(int i=2;i<sum;i++){
            if(sum%i==0)
             return(false);
          }
          return(true);
      }

      


        
    

}

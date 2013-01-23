/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package puzzles;
import java.io.*;

/**
 *
 * @author piyush
 */
public class Stringsuffixes {
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

            for(i=0;i<N;i++)
              Suffixcalculation(cases[i]);

  }


           static int Suffixcalculation(String cases){
               int length=cases.length();
               int count=length;

               String strarray[]=new String[length];

               for(int i=1;i<length;i++){
                    //strarray[i]=cases.substring(i);

                   count=count +countcalc(cases,cases.substring(i));

                  // System.out.println(count);

               }

               //for(int i=0;i<length;i++){
                System.out.println(count);

               //}


               return 0;
           }


           static int countcalc(String old,String newone){
               int count=0;

          //System.out.println("old.."+old);
          //System.out.println("new.."+newone);


          int length=newone.length();
           for(int i=0;i<length;i++){
              if(newone.charAt(i)==old.charAt(i))
                  count=count+1;
              else
                  break;
           }
           return count;
           }


}




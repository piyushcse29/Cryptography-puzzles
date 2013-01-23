/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package puzzles;
import java.io.*;
import java.util.Scanner;


/**
 *
 * @author piyush
 */
public class Xorkey {

 public static void main(String[] args) throws IOException {

String no_cases;
String no_data,subtestcases;
Long  long_no_data[]=new Long[100000];
long long_subtestcases=0;
int i ;
System.out.println("Enter no of test cases");
          InputStreamReader is=new InputStreamReader(System.in);
           BufferedReader br1=new BufferedReader(is);
            no_cases=br1.readLine();
           int N = Integer.parseInt(no_cases);
//System.out.println(N);
String cases[] = new String[N];
String data[] = new String[N];
String subtest[] = new String[50000];


            for(i=0;i<N;i++){
                System.out.println("Enter no_data and number of subtest cases");
                cases[i]=br1.readLine();

                Scanner lexer=new Scanner(cases[i]);
                while(lexer.hasNext()){
                  no_data=lexer.next();
                  subtestcases=lexer.next();

                  long_no_data[i] = Long.parseLong(no_data);
                  long_subtestcases=Long.parseLong(subtestcases);

                  System.out.println("Enter Data");
                  data[i]=br1.readLine();

                  System.out.println("Enter subtest");
                  for(int j=0;j<long_subtestcases;j++){
                  subtest[i]=br1.readLine();

                  }


                }
                
            }

for(i=0;i<long_subtestcases;i++)
            findMinXor(long_no_data[i],data[i],subtest[i]);
  }

static void findMinXor(long long_no_data,String data,String subtest){
 int a=0,start=0,end=0,k=0;
 long max=0;
 long xorresult[]=new long[10000];
     Long long_data[]=new Long[10000];
             Scanner lexer1=new Scanner(data);
         try{
             while(lexer1.hasNext()){
                  for(int i=0;i<long_no_data;i++)
                     long_data[i]= Long.parseLong(lexer1.next());
                }

             System.out.println("hi..");
             Scanner lexer2=new Scanner(subtest);
                while(lexer2.hasNext()){
                      a=Integer.parseInt(lexer2.next());
                      start=Integer.parseInt(lexer2.next());
                      end=Integer.parseInt(lexer2.next());
                }
             for(int i=start-1;i<=end-1;i++,k++){

                      //System.out.println("data.."+long_data[i]);
                      xorresult[k]=a^long_data[i];
                      //System.out.println("xor value.."+xorresult[k]);
                  }
               for(int i=0;i<=end-start;i++)
                 if(xorresult[i]>max)
                     max=xorresult[i];
                     
               System.out.println(max);
 }catch(Exception e){System.out.println(e);}


 }

}
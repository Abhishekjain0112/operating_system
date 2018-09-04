
package operatingsystem;

import java.util.Arrays;
import java.util.Scanner;


public class Sjf {
    public static void main(String[] args) {
        int ar[]={1,2,3,4};
        int bt[]=new int[4];
        int ct[]=new int[4];
        int wt[]=new int[4];
        int total_wt=0,total_tat=0;
        float awt,atat;
        int tat[]=new int[4],t=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Burst Time:");
        for(int i=0;i<ar.length;i++)
            bt[i]=s.nextInt();
        wt[0]=0;
        Arrays.sort(bt);
        
        for(int i=0;i<ar.length;i++)
        {
            t=t+bt[i];
            ct[i]=t;
            tat[i]=ct[i]-0;
        }
        for(int i=0;i<ar.length-1;i++)
        {
            wt[i+1]= tat[i]-bt[i];
        }
        for(int i=0; i<ar.length;i++)
        {
           total_wt=total_wt+wt[i];
           total_tat=total_tat+tat[i];
            System.out.println(bt[i]+"\t    "+wt[i]+"\t\t  "+tat[i]); 
        }
        awt=total_wt/ar.length;
        atat=total_tat/ar.length;
        System.out.println("Average Waiting Time="+awt);
        System.out.println("Average Turn Around Time="+atat);
    }
}

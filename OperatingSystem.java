
package operatingsystem;

import java.util.Scanner;


public class OperatingSystem {

    
    public static void main(String[] args) {
        int ar[]={1,2,3,4};
        int bt[]=new int[4];
        int wt[]=new int[4];
        int total_wt=0,total_tat=0;
        float awt,atat;
        int tat[]=new int[4];
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Burst Time:");
        for(int i=0;i<ar.length;i++)
            bt[i]=s.nextInt();
        wt[0]=0;
        for(int i=0;i<ar.length-1;i++)
        {
            wt[i+1]= bt[i]+ wt[i];
        }
        for(int i=0;i<ar.length;i++)
        {
            tat[i]=wt[i]+bt[i];
        }
        for(int i=0; i<ar.length;i++)
        {
           total_wt=total_wt+wt[i];
           total_tat=total_tat+tat[i];
            System.out.println(" "+i+1+"\t\t"+bt[i]+"\t    "+wt[i]+"\t\t  "+tat[i]); 
        }
        awt=total_wt/ar.length;
        atat=total_tat/ar.length;
        System.out.println("Average Waiting Time="+awt);
        System.out.println("Average Turn Around Time="+atat);
}
}

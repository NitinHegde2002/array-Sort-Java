import java.util.Scanner;
class sort{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter size of first sorted array");
        int x=scan.nextInt();
        System.out.println("Enter size of second sorted array");
        int y=scan.nextInt();
        int[]a=new int[x];
        int[]b=new int[y];
        System.out.println("Enter the first sorted array");
        for(int i=0;i<x;i++){
            a[i]=scan.nextInt();
        }
        System.out.println("Enter the second sorted array");
        for(int i=0;i<y;i++){
            b[i]=scan.nextInt();
        }
        int z=x+y;
        int[]c=new int[z];
        int i=0,j=0;
        int k=0;
        while(i!=x && j!=y){
            if(a[i]>b[j]){
                c[k]=b[j];
                j++;
                k++;
            }
            else{
                c[k]=a[i];
                i++;
                k++;
            }
        }   
        while(j!=y){
            c[k]=b[j];
            j++;
            k++;
        }    
        while(i!=x){
            c[k]=a[i];
            i++;
            k++;
        }        
        System.out.println("Sorted Array:\n");
        for(int e=0;e<z;e++){
            System.out.print(c[e]);
        }
        scan.close();
    }
}
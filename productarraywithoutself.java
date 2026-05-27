import java.util.*;
class Main{
public static void main (String[] args) {
Scanner s=new Scanner(System.in);
int size=s.nextInt();
int[] a=new int[size];
for(int i=0;i<size;i++){
a[i]=s.nextInt();
}
for(int i=0;i<size;i++){
int pr=1;
for(int j=0;j<size;j++){
if(i!=j)
pr=pr*a[j];
}
System.out.println(pr);
}
}
public class q5rotatearr {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,7,8,9,10};
int k=3;
int last=arr.length-1;
while(k!=0) {
int temp=arr[last];
for(int i=last-1;i>=0;i--)
arr[i+1]=arr[i];
arr[0]=temp;
k--;
}
for(int i=0;i<=last;i++)
System.out.print(arr[i]+" ");
}
}
 
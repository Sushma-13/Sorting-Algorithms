public class BubbleSort
{
	public static void main(String[] args) {
	    int a[]={2,6,6,1,12};
	    BubbleSort obj=new BubbleSort();
	    int n=a.length;
	    obj.bubbleSort(a,n);
	    for(int i=0;i<n;i++)
		System.out.print(a[i]+",");
	}
	void bubbleSort(int a[],int n){
	    for(int i=0;i<n;i++){
	        for(int j=0;j<n-1-i;j++){
	            if(a[j]>a[j+1]){
	                int temp=a[j];
	                a[j]=a[j+1];
	                a[j+1]=temp;
	            }
	        }
	    }
	}
}

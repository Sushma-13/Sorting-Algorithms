public class InsertionSort
{
	public static void main(String[] args) {
	    int a[]={2,16,6,1,12};
	    InsertionSort obj=new InsertionSort();
	    int n=a.length;
	    obj.insertionSort(a,n);
	    for(int i=0;i<n;i++)
		System.out.print(a[i]+",");
	}
	void insertionSort(int a[],int n){
	    
	    for(int i=1;i<n;i++){
	        int curr=a[i];
	        int j=i-1;
	        while(j>=0 && a[j]>curr){
	            a[j+1]=a[j];
	            j--;
	        }
	        a[j+1]=curr;
	    }
	}
}

public class SelectionSort
{
	public static void main(String[] args) {
	    int a[]={2,16,6,1,12};
	    SelectionSort obj=new SelectionSort();
	    int n=a.length;
	    obj.selectionSort(a,n);
	    for(int i=0;i<n;i++)
		System.out.print(a[i]+",");
	}
	void selectionSort(int a[],int n){
	    for(int i=0;i<n;i++){
	        int min=i;
	        for(int j=i;j<n;j++){
	            if(a[min]>a[j]){
	                min=j;
	            }
	        }
	        int temp=a[i];
	        a[i]=a[min];
	        a[min]=temp;
	    }
	}
}

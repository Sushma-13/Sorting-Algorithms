public class QuickSort
{
	public static void main(String[] args) {
	    int a[]={2,8,6,1,12};
	    QuickSort obj=new QuickSort();
	    obj.quickSort(a,0,a.length-1);
	    for(int i=0;i<a.length;i++)
		System.out.print(a[i]+",");
	}
	void quickSort(int a[],int l,int r){
	    if(l<r){
	        int part=partition(a,l,r);
	        quickSort(a,l,part-1);
	        quickSort(a,part+1,r);
	    }
	}
	int partition(int a[],int start,int end){
	    int pindex=start;
	    int pivot=end;
	    for(int i=start;i<end;i++){
	        if(a[i]<=a[pivot]){
	            int temp=a[i];
	            a[i]=a[pindex];
	            a[pindex]=temp;
	            
	            pindex++;
	        }
	    }
	    int temp=a[pivot];
	    a[pivot]=a[pindex];
	    a[pindex]=temp;
	    
	    return pindex;
	}
}

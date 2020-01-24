public class MergeSort
{
	public static void main(String[] args) {
	    int a[]={2,6,6,1,12};
	    MergeSort obj=new MergeSort();
	    obj.mergeSort(a,0,a.length-1);
	    for(int i=0;i<a.length;i++)
		System.out.print(a[i]+",");
	}
	void mergeSort(int a[],int l,int r){
	    if(l<r){
	        int mid=(l+r)/2;
	        mergeSort(a,l,mid);
	        mergeSort(a,mid+1,r);
	        merge(a,l,mid,r);
	    }
	}
	void merge(int a[],int l,int m,int r){
	    int p=l; //starting point of left array
      int q=m+1; //starting point of right array
	    int k=0; // pointer to fill the aux array
      int[] temp=new int[r-l+1]; // create a aux array
      
      //compair the left and right array,to find smaller element between them
	    while(p<=m && q<=r){
	        if(a[p]<=a[q]){
	            temp[k++]=a[p];
	            p++;
	        }else{
	            temp[k++]=a[q];
	            q++;
	        }
	        
	    }
      
      //put the remaining element from left array
	    while(p<=m){
	        temp[k++]=a[p];
	        p++;
	    }
      
      //put the remaining element from right array
	    while(q<=r){
	        temp[k++]=a[q];
	        q++;
	    }
      
      //put the sorted values from temp array to real array
	    for(int i=0;i<r-l+1;i++){
	        a[l+i]=temp[i];
	    }
	    
	}
}

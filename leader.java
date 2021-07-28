package array;

class ArrayImp {
	  
	  
	  public void printElementsGreaterEqualToRightside(int a[]) {
	    int max = Integer.MIN_VALUE;

	    for (int i = a.length - 1; i >= 0; i--) {
	      if (a[i] > max) {
	        max = a[i];
	        System.out.print(a[i] + " ");
	      }
	    }
	  }

	}

public class leader {

	public static void main(String[] args) {
		ArrayImp a = new ArrayImp();
	    int arr[] = {14, 15, 8, 9, 5, 2};
	    
	    a.printElementsGreaterEqualToRightside(arr);
	}

}

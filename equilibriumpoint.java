package array;
class ArrayI {
	  
	  
	  public int getEquilibriumPoint(int[] a) {
	    if (a.length == 0) {
	      return -1;
	    }

	    int sum = 0;
	    int sum_so_far = 0;

	    for (int i = 0; i < a.length; i++) {
	      sum = sum + a[i];
	    }

	    for (int i = 0; i < a.length; i++) {
	      sum = sum - a[i];
	      if (sum == sum_so_far) {
	        return i;
	      }
	      sum_so_far = sum_so_far + a[i];
	    }

	    return -1;
	  }

	}


public class equilibriumpoint {

	public static void main(String[] args) {
		ArrayI a = new ArrayI();
	    int arr[] = {0, 1, 1, 0, 2, 2, 1, 0, 2};
	    
	    System.out.println(a.getEquilibriumPoint(arr));

	}

}

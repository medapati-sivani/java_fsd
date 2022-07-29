
public class Longest_Increasing_Subse {
	
	static int incre_subseq(int my_arr[], int arr_len){
	      int seq_arr[] = new int[arr_len];
	      int i, j, max = 0;
	      for (i = 0; i < arr_len; i++)
	         seq_arr[i] = 1;
	      for (i = 1; i < arr_len; i++)
	      for (j = 0; j < i; j++)
	      if (my_arr[i] > my_arr[j] && seq_arr[i] < seq_arr[j] + 1)
	      seq_arr[i] = seq_arr[j] + 1;
	      for (i = 0; i < arr_len; i++)
	      if (max < seq_arr[i])
	      max = seq_arr[i];
	      return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int my_arr[] = {50,60, 3, 10, 7, 40, 80};
	      int arr_len = my_arr.length;
	      System.out.println("The length of the longest increasing subsequence is " +  incre_subseq(my_arr, arr_len));

	}

}

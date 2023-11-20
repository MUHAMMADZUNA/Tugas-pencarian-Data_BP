/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package indexsequensial;

/**
 *
 * @author zuna
 */
public class IndexSequensial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Java program for Indexed Sequential Search



class GFG {

	static void indexedSequentialSearch(int arr[], int n,
										int k)
	{
		int elements[] = new int[20];
		int indices[] = new int[20];
		int temp, i;
		int j = 0, ind = 0, start = 0, end = 0, set = 0;
		for (i = 0; i < n; i += 3) {

			// Storing element
			elements[ind] = arr[i];

			// Storing the index
			indices[ind] = i;
			ind++;
		}
		if (k < elements[0]) {
			System.out.println("Not found");
			return;
		}
		else {
			for (i = 1; i <= ind; i++)
				if (k <= elements[i]) {
					start = indices[i - 1];
					set = 1;
					end = indices[i];
					break;
				}
		}
		if (set == 0) {
			start = indices[i - 1];
			end = n;
		}
		for (i = start; i <= end; i++) {
			if (k == arr[i]) {
				j = 1;
				break;
			}
		}
		if (j == 1)
			System.out.println("Found at index " + i);
		else
			System.out.println("Not found");
	}

	// Driver code

	public static void main(String[] args)
	{
		int arr[] = { 6, 7, 8, 9, 10 };
		int n = arr.length;

		// Element to search
		int k = 8;
		indexedSequentialSearch(arr, n, k);
	}
}


    }
    
}

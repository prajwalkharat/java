/*import java.io.*;
class demo{
	public static void main(String[] args){
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter value");
		int n=Integer.parseInt(br.readLine());

		System.out.println("n="+n);

		for(int i=0;i<=n;i++){
			 int a=Integer.parseInt(br.readLine());
			 int arr[] = new int[]{a};

			System.out.println(arr[i]);
		}

		for(int i=0;i<arr.length;i++){
			int count =0;
			for(int j=0;arr.length;j++){
				if(arr[i]==arr[j])
				count++;
				break;
			}
			System.out.println("frequency of"+ arr[i] + count);

		}


	}
}*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FrequencyCounter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number of elements: ");
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n]; // Create an array with the specified size

        System.out.println("Enter " + n + " values:");

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        // Create an array to store the frequency of each element
        int[] frequencies = new int[n];

        // Initialize all frequencies to 0
        for (int i = 0; i < n; i++) {
            frequencies[i] = 0;
        }

        // Count the frequency of each element
        for (int i = 0; i < n; i++) {
            int current = arr[i];
            int count = 1;

            // Check the remaining elements in the array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] == current) {
                    count++;
                    frequencies[j] = -1; // Mark as visited
                }
            }

            // If the element is not marked as visited, set its frequency
            if (frequencies[i] != -1) {
                frequencies[i] = count;
            }
        }

        // Print the frequency of each element
        System.out.println("Element\tFrequency");
        for (int i = 0; i < n; i++) {
            if (frequencies[i] != -1) {
                System.out.println(arr[i] + "\t" + frequencies[i]);
            }
        }
    }
}


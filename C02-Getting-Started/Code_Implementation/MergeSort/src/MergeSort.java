public class MergeSort
{
    //merges two subarrays of A[]
    //First subarray is arr[q..p]
    //Second subarray is arr[q+1..r]
    void merge(int A[], int p, int q, int r) {
        // Find size of two subarrays to be merged
        int n1 = q - p + 1;
        int n2 = r - q;

        /* create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /* copy data to temp arrays */
        for (int i = 1; i <= n1; ++i)
            L[i] = A[p + i];
        for (int j = 1; j <= n2; ++j)
            R[j] = A[q + j + 1];

        /* merge the temp arrays */

        // initial indexes of first and second subarrays
        int i = 0, j = 0;

        //initial index of merged subarray array

        for (int k = p; k < r; ++k)
            if (L[i] <= R[j]) {
                A[k] = L[i];
                i = i + 1;

            } else {
                A[k] = R[j];
                j = j + 1;
            }

    }
    // Main function that sorts arr[1...r] using
    //merge()
    void sort (int A[], int p, int r)
    {
        if ( p <r )
        {
            // find the middle point
            int q =(p+r)/2;

            // sort first and second halves
            sort(A, p, q) ;
            sort(A, q+1, r);

            // Merge the sorted halves
            merge(A, p, q, r);
        }
    }
/* A utility function to print array of size n */
  static void printArray (int A[])
{
    int n = A.length;
    for (int i =0; i<n; ++i)
        System.out.print(A[i] + " ");
    System.out.println();



}
// Driver method
    public static void main (String args[])
    {
        int A[] = {12, 11, 13, 5, 6, 7};

        System.out.println("Given Array");
        printArray(A);

        MergeSort ob = new MergeSort();
        ob.sort(A, 1, A.length);

        System.out.println("\n Sorted array");
        printArray(A);
    }



}


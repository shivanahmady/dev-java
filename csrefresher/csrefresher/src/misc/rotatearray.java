 A Juggling Algorithm: 
Approach: This is an extension of method 
2. Instead of moving one by one, divide the array into different sets where the number of sets is equal to 
GCD of n and d and move the elements within sets.

If GCD is 1 as-is for the above example array (n = 5 and d =2), 
then elements will be moved within one set only, we just start with 
temp = arr[N] and keep moving arr[I+d] to arr[I] and finally store temp at the right place.

Below is the implementation of the above approach :

/ Java program to rotate an array by
// d elements
 
class GFG {
 
    // Function to right rotate arr[]
    // of siz N by D
    void rightRotate(int arr[], int d, int n)
    {
 
        // to neglect n rotations if rtotations is greater
        // than size of arr
        while (d > n) {
            d = d - n;
        }
        // to use as left rotation
        d = n - d;
        d = d % n;
        int i, j, k, temp;
        int g_c_d = gcd(d, n);
        for (i = 0; i < g_c_d; i++) {
 
            // move i-th values of blocks
            temp = arr[i];
            j = i;
            while (true) {
                k = j + d;
                if (k >= n)
                    k = k - n;
                if (k == i)
                    break;
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
    }
 
    // UTILITY FUNCTIONS
 
    // function to print an array
    void printArray(int arr[], int size)
    {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
    }
 
    // Function to get gcd of a and b
    int gcd(int a, int b)
    {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }
 
    // Driver program to test above functions
    public static void main(String[] args)
    {
        GFG rotate = new GFG();
        int arr[] = { 1, 2, 3, 4, 5 };
        rotate.rightRotate(arr, 2, arr.length);
        rotate.printArray(arr, arr.length);
    }
}

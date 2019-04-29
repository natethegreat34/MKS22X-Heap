public class MyHeap{
    private static void pushDown(int[]data,int size,int index){
        int parent = data[index];
        boolean done = false;
        while (!done){
            if (data[index] > data[index * 2 + 1] && data[index * 2 + 2]){
                done = true;
            }
            else{
                if (data[index * 2 + 1] > data[index * 2 + 2]){
                    int hold = data [index];
                    data [index] = data [index * 2 + 1];
                    data [index * 2 + 1] = hold;
                }
                else {
                    int hold = data [index];
                    data [index] = data [index * 2 + 2];
                    data [index * 2 + 2] = hold;
                }
            }
        }
    }
         // - size  is the number of elements in the data array.
         // - push the element at index i downward into the correct position. This will swap with the larger of the child nodes provided thatchild is larger. This stops when a leaf is reached, or neither child is larger. [ should be O(logn) ]
         // - precondition: index is between 0 and size-1 inclusive
         // - precondition: size is between 0 and data.length-1 inclusive.

    private static void pushUp(int[]data,int index){
        ;
    }
         // - push the element at index i up into the correct position. This will swap it with the parent node until the parent node is larger or the root is reached. [ should be O(logn) ]
         // - precondition: index is between 0 and data.length-1 inclusive.


    //We will discuss this today:
    public static void heapify(int[] a){
        int end = a.length - 1;
        int max = a[end];
        int pos = end;
        for (int y = 0; y < a.length - 1; y ++){
            for (int x = 0; x <= end; x ++){
                if (a[x] > max){
                    max = a [x];
                    pos = x;
                }
            }
                a [pos] = a [end];
                a [end] = max;
                end --;
            }
    }
        // - convert the array into a valid heap. [ should be O(n) ]

    public static void heapsort(int[] a){
        ;
    }
        // - sort the array by converting it into a heap then removing the largest value n-1 times. [ should be O(nlogn) ]



}

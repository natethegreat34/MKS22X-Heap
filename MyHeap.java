public class MyHeap{
    private static void pushDown(int[]data,int size,int index){
        boolean done = false;
        while (!done && size > 0 && index * 2 + 1 < size){

            // System.out.println("lljkdkahDKHSDKHA" + index + "   " + size);
            //     System.out.println("okkokookkookokok");
                if (index * 2 + 2 >= size ){
                        // System.out.println("12345678543234567876543k");
                    if (data[index] >= data[index * 2 + 1]){
                        done = true;
                    }
                    //swap
                    int hold = data [index];
                    data [index] = data [index * 2 + 1];
                    data [index * 2 + 1] = hold;
                    index = index * 2 + 1;
                }
                else if (data[index] > data[index * 2 + 1] && data[index] > data[index * 2 + 2]){
                    // System.out.println("pip");
                    done = true;
                }
                else if (data[index * 2 + 1] > data[index * 2 + 2]){
                        //swap after finding the bigger of the two
                        int hold = data [index];
                        data [index] = data [index * 2 + 1];
                        data [index * 2 + 1] = hold;
                        index = index * 2 + 1;
                    }
                else {
                        //swap
                        int hold = data [index];
                        data [index] = data [index * 2 + 2];
                        data [index * 2 + 2] = hold;
                        index = index * 2 + 2;
                    }
                    //set new index to fully bubble down

        }
        // System.out.println("loolololololo");
    }
         // - size  is the number of elements in the data array.
         // - push the element at index i downward into the correct position. This will swap with the larger of the child nodes provided thatchild is larger. This stops when a leaf is reached, or neither child is larger. [ should be O(logn) ]
         // - precondition: index is between 0 and size-1 inclusive
         // - precondition: size is between 0 and data.length-1 inclusive.

    private static void pushUp(int[]data,int index){
        int parent = data[index];
        boolean done = false;
        while (!done){
            if (index == 0){
                done = true;
            }
            if (data[index] < data[(index + 1) / 2]){
                done = true;
            }
            else{
                int hold = data [index];
                data [index] = data [(index + 1) / 2];
                data [(index + 1) / 2] = hold;
                index = (index + 1) / 2;
            }
        }
    }
         // - push the element at index i up into the correct position. This will swap it with the parent node until the parent node is larger or the root is reached. [ should be O(logn) ]
         // - precondition: index is between 0 and data.length-1 inclusive.


    //We will discuss this today:
    public static void heapify(int[] a){
        // System.out.println("kkkkkk");
        int index = a.length - 1;
        while (index >= 0){
            // System.out.println(index);
            if(2 * index + 2 > a.length - 1){
                // System.out.println("hip");
                if (2 * index + 1 > a.length - 1){
                    index--;
                }
            }
                    // System.out.println("jkjkj");
                    // String l = "[";
                    // for (int i = 0; i < a.length; i ++){
                    //     l = l + a[i] + " ";
                    // }
                    // System.out.println(l + "]");
                    pushDown(a, a.length, index);
                    // l = "hypo [";
                    // for (int i = 0; i < a.length; i ++){
                    //     l = l + a[i] + " ";
                    // }
                    // System.out.println(l + "]");
                    index --;
            }
            }



        // - convert the array into a valid heap. [ should be O(n) ]

    public static void heapsort(int[] a){
        heapify(a);
        int size = a.length;
        while (size > 0){
            // System.out.println("help" + size);
            int hold = a[0];
            a[0] = a[size - 1];
            a[size - 1] = hold;
            // System.out.println("hhhh" + size);
            pushDown(a, size - 1, 0);
            size --;
        }
        // String d = "[";
        // for (int i = 0; i < a.length; i ++){
        //     d = d + a[i] + " ";
        // }
        // System.out.println(d + "]");
    }
        // - sort the array by converting it into a heap then removing the largest value n-1 times. [ should be O(nlogn) ]



}

public class MyHeap{
    private static void pushDown(int[]data,int size,int index){
        boolean done = false;
        while (!done && size > 0 && index * 2 + 1 < size){
                if (index * 2 + 2 >= size ){
                    if (data[index] >= data[index * 2 + 1]){
                        done = true;
                    }
                    else{
                        //swap
                        int hold = data [index];
                        data [index] = data [index * 2 + 1];
                        data [index * 2 + 1] = hold;
                        index = index * 2 + 1;
                    }
                }
                else if (data[index] > data[index * 2 + 1] && data[index] > data[index * 2 + 2]){
                    //if parent is greater than both children no need to continue
                    done = true;
                }
                else if (data[index * 2 + 1] > data[index * 2 + 2]){
                        // finds the bigger of the two to switch with the parent
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
    }
         // - size  is the number of elements in the data array.
         // - push the element at index i downward into the correct position. This will swap with the larger of the child nodes provided thatchild is larger. This stops when a leaf is reached, or neither child is larger. [ should be O(logn) ]
         // - precondition: index is between 0 and size-1 inclusive
         // - precondition: size is between 0 and data.length-1 inclusive.

    private static void pushUp(int[]data,int index){
        boolean done = false;
        while (!done){
            if (index == 0){
                // if at top, no need to conitinue
                done = true;
            }
            else if (data[index] < data[(index + 1) / 2]){
                // if it is less than its parent, no need to continue
                done = true;
            }
            else{
                // swap if it is greater than its parent
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
        int index = a.length - 1;
        while (index >= 0){
            if(2 * index + 2 > a.length - 1){
                if (2 * index + 1 > a.length - 1){
                    index--;
                }
            }
            // goes from bottom of the list to top to see if all the parents and children follow heap rules
            pushDown(a, a.length, index);
            // if not fix them
            index --;
        }
    }
        // - convert the array into a valid heap. [ should be O(n) ]
    public static void heapsort(int[] a){
        heapify(a);
        int size = a.length;
        while (size > 0){
            // Switching removing one with the last element and then pucshing down that element
            int hold = a[0];
            a[0] = a[size - 1];
            a[size - 1] = hold;
            pushDown(a, size - 1, 0);
            // shrinking size to pretend the value just switched from the top, is no longer ther
            size --;
        }
    }
        // - sort the array by converting it into a heap then removing the largest value n-1 times. [ should be O(nlogn) ]
}

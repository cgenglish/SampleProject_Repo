public class ProgramSearches {
    public static void main (String[] args) {
        int[] myArray = { 34, 21, 67, 89, 45, 65, 43 };
        int[] sortedArray = { 1, 3, 4, 6, 10, 13, 15, 22, 27, 31, 35, 45, 56, 62, 200 };
        System.out.println("Sequential seach result index: " + SequentialSearch(myArray, 65));
        int binarySearchResult = BinarySearch(sortedArray, 35);
        System.out.println("Binary search result index: " + binarySearchResult);
        int[] minMax = FindMinMax(myArray);
        System.out.println("Min: " + minMax[0] + " Max: " + minMax[1]);
    }

    public static int SequentialSearch(int[] arrayToSearch, int valueToLookFor) {
        
        for(int index = 0; index < arrayToSearch.length; index++){
            System.out.println("Index: " + index);
            if(arrayToSearch[index] == valueToLookFor){
                return index;
            }
        }

        return -1;
    }

    public static int BinarySearch(int[] arrayToSearch, int valueToLookFor) {
        int low = 0;
        int high = arrayToSearch.length - 1;
        int counter = 0;
        while (low <= high) {
            int mid = (low + high)/2;
            counter += 1;
            System.out.println("Counter for binary search is: " + counter);
            if (arrayToSearch[mid] == valueToLookFor)
                return mid; // if the value is found => return it
            else if (valueToLookFor < arrayToSearch[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        };
        
        return -1; //in the case where the key isn't found
    };

    public static int[] FindMinMax(int [] arrayToSearch) {
        int max = arrayToSearch[0];
        int min = arrayToSearch[0];

        for(int i = 1; i < arrayToSearch.length; i++) {
            if(arrayToSearch[i] > max)
                max = arrayToSearch[i];
            else if(arrayToSearch[i] < min) {
                min = arrayToSearch[i];
            }
        
        }

        return new int[] {min, max};
    }
}
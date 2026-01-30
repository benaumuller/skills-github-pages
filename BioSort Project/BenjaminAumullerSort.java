/*
 *
 * Dr. Stonedahl helped me get started with the partition part. no other help recieved
 *
 *
 */

public class BenjaminAumullerSort implements BioSortingAlgorithm {


    public void sort(BioArray a) {
        sort(a, 0, a.getLength() - 1);
    }

    // sort the subarray from a[lo] to a[hi]
    private static void sort(BioArray a, int lo, int hi) {
        if (hi <= lo) return;
        int j = partition(a, lo, hi);
        sort(a, lo, j - 1);
        sort(a, j + 1, hi);
    }

    // partition the subarray a[lo..hi] so that j becomes the median point in the array
    // and return the index j.
    private static int partition(BioArray a, int lo, int hi) {
        int i = lo + 1;
        int j = hi;

        while (true) {
            int[] current_case_lo = a.compare4(lo, lo, i, i);
            int[] current_case_hi = a.compare4(j, j, lo, lo);

            // find the first item for a[lo] - a[hi] that is greater than a[lo]
            while (current_case_lo[3]== lo) {
                if (i == hi) break;
                i++;
                current_case_lo = a.compare4(lo, lo, i, i);
            }

            // find first item from a[hi] - a[lo] that is less than a[lo]
            while (current_case_hi[0] == lo) {
                if (j == lo) break;
                j--;
                current_case_hi = a.compare4(j, j, lo, lo);
            }
            // check if pointers cross
            if (i >= j) {
                break;
            }
            //swap a[i] and a[j]
            a.flip(i, j);
        }
        // put partitioning item v at a[j]
        a.flip(lo, j);

            return j;

    }
}


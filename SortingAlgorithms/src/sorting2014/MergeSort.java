package sorting2014;

/*
 * @author William Arslett <wia2@aber.ac.uk>
 */
public class MergeSort implements Sorter {

    private Comparable[] list;
    private Comparable[] work;

    @Override
    public void sort(Comparable[] items, int cutoff) {

        list = items;
        work = new Comparable[items.length];
        mergesort(0, list.length - 1);

    }

    private void mergesort(int startIndex, int finishIndex) {

        int midpoint = startIndex + (finishIndex - startIndex) / 2;

        if (startIndex < finishIndex) {
            mergesort(startIndex, midpoint);
            mergesort(midpoint + 1, finishIndex);
            merge(startIndex, midpoint, finishIndex);
        }

    }

    private void merge(int startIndex, int midpoint, int finishIndex) {

        for (int i = startIndex; i <= finishIndex; i++) {
            work[i] = list[i];
        }

        int cursor1 = startIndex;
        int cursor2 = midpoint + 1;
        int cursor3 = startIndex;

        while (cursor1 <= midpoint
                && cursor2 <= finishIndex) {
            if (work[cursor1].compareTo(work[cursor2]) <= 0) {
                list[cursor3] = work[cursor1];
                cursor1++;
            } else {
                list[cursor3] = work[cursor2];
                cursor2++;
            }
            cursor3++;
        }

        while (cursor1 <= midpoint) {
            list[cursor3] = work[cursor1];
            cursor3++;
            cursor1++;
        }

    }
}

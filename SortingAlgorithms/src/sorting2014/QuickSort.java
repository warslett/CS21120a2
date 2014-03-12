/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting2014;

/**
 *
 * @author wia2
 */
public class QuickSort implements Sorter {

    private Comparable[] list;

    @Override
    public void sort(Comparable[] items, int cutoff) {

        list = items;
        quicksort(0, list.length - 1);

    }

    private void quicksort(int startIndex, int finishIndex) {

        Comparable pivot = list[startIndex + (finishIndex - startIndex) / 2];
        int cursor1 = startIndex;
        int cursor2 = finishIndex;

        while (cursor1 <= cursor2) {
            
            while (list[cursor1].compareTo(pivot) < 0) {
                cursor1++;
            }
            
            while (list[cursor2].compareTo(pivot) > 0) {
                cursor2--;
            }
            
            if (cursor1 <= cursor2) {
                Comparable temp = list[cursor1];
                list[cursor1] = list[cursor2];
                list[cursor2] = temp;
                cursor1++;
                cursor2--;
            }
            
        }

        if (startIndex < cursor2) {
            quicksort(startIndex, cursor2);
        }
        if (finishIndex > cursor1) {
            quicksort(cursor1, finishIndex);
        }

    }
}

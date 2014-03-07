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
                swap(cursor1, cursor2);
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

    private void swap(int comp1, int comp2) {
        Comparable temp = list[comp1];
        list[comp1] = list[comp2];
        list[comp2] = temp;
    }
}

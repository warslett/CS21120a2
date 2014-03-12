/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting2014;

/**
 *
 * @author wia2
 */
public class InsertionSort implements Sorter {

    private Comparable[] list;

    @Override
    public void sort(Comparable[] items, int cutoff) {

        for (int cursor1 = 1; cursor1 < items.length; cursor1++) {
            int cursor2;
            Comparable curItem = items[cursor1];
            for (cursor2 = cursor1 - 1;
                    cursor2>=0 && items[cursor2].compareTo(curItem)>0;
                    cursor2--) {
                items[cursor2+1] = items[cursor2];
            }
            items[cursor2 + 1] = curItem;
        }

    }
}

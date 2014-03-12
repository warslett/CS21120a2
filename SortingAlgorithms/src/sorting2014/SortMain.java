/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting2014;

import java.util.Calendar;

/**
 *
 * @author wia2
 */
@SuppressWarnings("unchecked")
public class SortMain {

    public static void main(String[] args) {

        DataFile datFile = new DataFile("SortingData/test6b.dat");

        Test(datFile.getComparables(), "sorting2014.QuickSort");

        Test(datFile.getComparables(), "sorting2014.MergeSort");

        Test(datFile.getComparables(), "sorting2014.RadixSort");

        Test(datFile.getComparables(), "sorting2014.InsertionSort");

        Test(datFile.getComparables(), "sorting2014.BubbleSort");

    }

    private static void Test(Comparable[] items, String sort) {

        long start;
        long finish;
        long timeTaken;

        Sorter s = SortFactory.getSorter(sort);

        if (s != null) {

            start = Calendar.getInstance().getTimeInMillis();
            s.sort(items, 0);
            finish = Calendar.getInstance().getTimeInMillis();
            timeTaken = finish - start;

            System.out.print(sort);
            System.out.print(" completed in ");
            System.out.print(timeTaken);
            System.out.print(" miliseconds.\n");

        } else {

            System.out.println("Failed loading "
                    + sort
                    + " no sorting will happen.");

        }

    }
}

package sorting2014;

/**
 * @author Richard Shipman <rcs@aber.ac.uk>
 */
public class BubbleSort implements Sorter {

	/* (non-Javadoc)
	 * @see sorting.Sorter#sort(java.lang.Comparable[])
	 */
	@SuppressWarnings("unchecked")
	public void sort(Comparable[] items, int cutoff) {
		Comparable temp;
		for (int i=0; i<items.length-1; i++)
		{
			for (int j=0; j<items.length-1-i; j++)
			{
				if (items[j].compareTo(items[j+1])>0)
				{
					temp=items[j+1];
					items[j+1]=items[j];
					items[j]=temp;
				}
			}
		}
	}
}
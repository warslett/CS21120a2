package sorting2014;
import java.lang.reflect.*;
/**
 * @author Richard Shipman <rcs@aber.ac.uk>
 */
@SuppressWarnings("unchecked")
public class SortFactory {
	
	public static Sorter getSorter()
	{
		return new BubbleSort();
	}
	
	public static Sorter getSorter(String sorter)
	{
		Sorter sort=null;
		try {
			Class clas = Class.forName(sorter);
			Class[] parms={};
			Constructor cons=clas.getConstructor(parms);
			Object obj = cons.newInstance();
			if (obj instanceof Sorter)
			{
				sort=(Sorter)obj;
			}
		} catch (Exception e) {
			//e.printStackTrace();
		}
		return sort;
	}

}
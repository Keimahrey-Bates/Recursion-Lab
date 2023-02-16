public class ArraySum
{
	public int sumOfArray (Integer[] a,int index)
	{
		if(index > -1)
		{
			return(sumOfArray(a, index-1) + a[index]);
		}
		return 0;
			
	}
}
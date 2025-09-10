package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class findErrorNums {
public static int[] findErrorNums(int[] nums) {
	List<Integer> list= new ArrayList<Integer>();
	Map<Integer, Integer> map= new HashMap<Integer, Integer>();
	int max=Integer.MIN_VALUE;
        for(int i =0; i<nums.length; i++)
        {
        	if(max<nums[i])
        	{
        		max=nums[i];
        	}
        	if(map.containsKey(nums[i]))
        		list.add(nums[i]);
        	else
        		map.put(nums[i], i);
        }
        for(int i=1; i<nums.length+1; i++)
        {
        	if(!map.containsKey(i))
        	{
        		list.add(i);
        	}
        }
        return list.stream()
                .mapToInt(Integer::intValue) 
                .toArray();
    }
	public static void main(String[] args) {
		int[] result=findErrorNums(new int[] {1,2,2,4});
		// TODO Auto-generated method stub
		for(int x: result)
		{
			System.out.print(x+" ");
		}

	}

}

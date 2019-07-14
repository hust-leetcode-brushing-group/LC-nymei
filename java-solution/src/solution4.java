//median of two sorted arrays
public class solution4 {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		//both empty
		if(nums1.length == 0 && nums2.length == 0)	return 0.0;
		//nums1 empty
		if(nums1.length == 0) 
			if((nums2.length&1) == 1)
				return nums2[(nums2.length-1)/2];
			else 
				return (nums2[nums2.length/2] + nums2[nums2.length/2 + 1])/2;
		//nums2 empty
		if(nums2.length == 0)
			if((nums1.length&1) == 1)
				return nums1[(nums1.length-1)/2];
			else 
				return (nums1[nums1.length/2] + nums1[nums2.length/2 + 1])/2;
		
		// normal case
		int imax = nums1.length-1;
		int imin = 0;
		int i = (imax+imin)/2;
		int j = (nums1.length + nums2.length)/2 - i;
		while(nums1[i-1] > nums2[j]||nums2[j-1] > nums1[i]) {
			if(nums1[i-1] > nums2[j]) {
				i++;
				j--;
			}
			else {
				i--;
				j++;
			}
		}
		
		double less; 
		double more;
		
		if(nums1[i-1]<nums2[j-1])	less = nums2[j-1];
		else	less = nums1[i-1];
		
		if(nums1[i]<nums2[j])	more = nums1[i];
		else	more = nums2[j];
		
		if(((nums1.length + nums2.length)&1) == 1)	return more;
		else return (less + more)/2;
		
    }
}

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Double> lists = new ArrayList<>();
        int totalLength = nums1.length + nums2.length;
        int index1 = 0;
        int index2 = 0;

        for(int i = 0; i < totalLength; i++){

            if(index1 >= nums1.length){
                lists.add((double)nums2[index2]);
                index2++;
                continue;
                
            }else if(index2 >= nums2.length){
                lists.add((double)nums1[index1]);
                index1++;
                continue;
            }

            if(nums1[index1] < nums2[index2]){
                lists.add((double)nums1[index1]);
                index1++;
            }else{
                lists.add((double)nums2[index2]);
                index2++;
            }
        }

        if(totalLength %2 != 0){
            return lists.get((int)Math.ceil(lists.size()/2));
        }else{
            return (lists.get((int)(totalLength/2.0)) + lists.get((int)(totalLength/2.0)-1)) /2.0;
        }
    }
}
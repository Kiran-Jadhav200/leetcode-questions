class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> ans = new ArrayList<>();
        int i =0, n = nums1.length; 
        int j =0, m = nums2.length;
         Arrays.sort(nums1);
         Arrays.sort(nums2);
        while(i<n && j<m){
            if(nums1[i] == nums2[j]){
                ans.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else if(nums1[i] > nums2[j]){
                j++;
            }

        } 
        int[] fans = new int[ans.size()];
      for(int k =0; k<fans.length; k++){
        fans[k] = ans.get(k);
      }

        return fans;
    }
}
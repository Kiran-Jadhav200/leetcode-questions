/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {

        int minDistance = Integer.MAX_VALUE ;

        ListNode temp = head ;

        int index = 0 ;
        int firstIndex = -1 ;
        int prevIndex = -1 ;
        int currIndex = -1 ;

        while(temp.next.next != null)
        {
            if((temp.next.val > temp.val && temp.next.val > temp.next.next.val)||(temp.next.val < temp.val && temp.next.val < temp.next.next.val))
            {
                if(firstIndex == -1) 
                {
                    firstIndex = index ;
                    prevIndex = index ;
                }
                else
                {
                    currIndex = index ;
                    if((currIndex - prevIndex)<minDistance) minDistance = currIndex - prevIndex ;
                    prevIndex = currIndex ;
                }
            }
            temp = temp.next ;
            index ++ ;
        }

        if(currIndex == -1) return new int[]{-1,-1} ;

        return new int[]{minDistance,currIndex-firstIndex} ;

    }
}
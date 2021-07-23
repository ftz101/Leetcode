
import java.util.LinkedList;

/*
 * Definition for singly-linked list.
 *  class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
*/


public class MergeTwoLists {
	




/*Recursive solution
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (l1=null) {
            return l2;
        }
        if (l2=null) {
            return l1;
        }

        if (l1.val<l2.val) {
            l1.next=mergeTwoLists(l1.next,l2);
            return l1;
        }else{
            l2.next=mergeTwoLists(l1,l2.next);
        }

    }
    */


    public static void main(String[] args) {

        LinkedList<Int> testNode1 = new LinkedList<Int>();
        LinkedList<Int> testNode2 = new LinkedList<Int>();

        testNode1.add(1,2,4);
        testNode2.add(1,3,4);

        MergeTwoLists obj=new MergeTwoLists();
        obj.mergeTwoLists(testNode1,testNode2);


    }





}
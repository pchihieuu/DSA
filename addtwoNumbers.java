package leetCode;

public class addtwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode pointer1 = l1, pointer2 = l2, currentNode = result;
        int dozenCarrier = 0;
        
        while(pointer1!=null || pointer2!=null){
            int pointer1Value = (pointer1 == null)?0 : pointer1.val;
            int pointer2Value = (pointer2 == null)?0 : pointer2.val;
            
            int sum = pointer1Value + pointer2Value + dozenCarrier;
            dozenCarrier = sum/10;
            currentNode.next = new ListNode(sum%10);
            currentNode = currentNode.next;
            
            if(pointer1 !=null){
                pointer1 = pointer1.next;
            }
            if(pointer2 !=null){
                pointer2 = pointer2.next;
            }
        }
        if(dozenCarrier>0){
            currentNode.next = new ListNode(dozenCarrier);
        }
        return result.next;
        
    }

}

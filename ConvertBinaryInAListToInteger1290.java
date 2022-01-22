package com.practice.linkedlist;

public class ConvertBinaryInAListToInteger1290 {

    public int getDecimalValue(ListNode head) {     
        int ans = 0;
        for(ListNode temp =  head;temp!=null;temp=temp.next){
        	ans = ans*2;
        	ans = ans + temp.val;
        }                
        return ans;        
    }

	
}




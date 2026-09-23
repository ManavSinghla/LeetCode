class MyLinkedList {
    private class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    private Node head;
    private int size;

    public MyLinkedList() {
        head=new Node(0);
        size=0;
    }
    
    public int get(int index) {
        if(index<0 || index>=size) return -1;
        Node curr=head.next;
        for(int i=0;i<index;i++){
            curr=curr.next;
        }
        return curr.val;
    }
    
    public void addAtHead(int val) {
        Node temp=new Node(val);
        temp.next=head.next;
        head.next=temp;
        size++;
    }
    
    public void addAtTail(int val) {
        Node temp=new Node(val);
        Node curr=head;
        while(curr!=null && curr.next!=null){
            curr=curr.next;
        }
        curr.next=temp;
        size++;
        
    }
    
    public void addAtIndex(int index, int val) {
        if(index<0 || index>size) return;
        Node temp=new Node(val);
        Node curr=head;
        for(int i=0;i<index;i++){
            curr=curr.next;
        }
        temp.next=curr.next;
        curr.next=temp;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if(index<0 || index>=size) return;
        Node curr=head;
        for(int i=0;i<index;i++){
            curr=curr.next;
        }
        curr.next=curr.next.next;
        size--;
        
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
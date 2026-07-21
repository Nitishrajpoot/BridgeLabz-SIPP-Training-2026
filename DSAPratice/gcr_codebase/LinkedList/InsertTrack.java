package LinkedList;

class InsertTrack{
    static class Node{
        int trackId;
        Node next;

        Node(int trackId){
            this.trackId=trackId;
        }
    }

    static void insertAfter(Node current,int trackId){
        Node newNode=new Node(trackId);

        newNode.next=current.next;
        current.next=newNode;
    }

    static void display(Node head){
        Node current=head;

        while(current!=null){
            System.out.print(current.trackId+" ");
            current=current.next;
        }
    }

    public static void main(String[] args){
        Node first=new Node(101);
        Node second=new Node(102);
        Node third=new Node(103);

        first.next=second;
        second.next=third;

        insertAfter(second,104);

        display(first);
    }
}

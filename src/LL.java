public class LL {
    Node head; 
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    public void addfirst(String data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    public void addlast(String data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        Node currNode=head;
        while(currNode.next !=null){
            currNode=currNode.next;
        }
        currNode.next=newnode;

    }
    public void printlist(){
        if(head==null){
            System.out.println("list is empty!");
            return;
        }
        Node currNode=head;
        while(currNode !=null){
            System.out.print(currNode.data + "->");
            currNode=currNode.next;

        }
        System.out.println("Null");

    }
    public static void main(String args[]){
     LL list =new LL();
     list.addfirst("is");
     list.addfirst("this ");
     list.addlast("a");
     list.addlast ("harsha");
     list.printlist();
    }
    
}

import java.util.Arrays;

public class MyLinkedList {
    private node head = new node(0);
    private node temp= new node (0);
    private int size=0;


    public void add(int value){
        size++;

        if(head.next==null){
            head.next=new node(value);
        }
        else {
            temp = head.next;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new node(value);
        }

    }

    public void remove(int index){
        if(index>=size){
            throw new IndexOutOfBoundsException();
        }
        size--;
        temp=head.next;
        for(int i=0; i<=index;i++){
            if(index==0){
                head.next=head.next.next;
                break;
            }
            if(i==index-1){
             temp.next=temp.next.next;
             break;
            }
            temp=temp.next;
        }
    }

    public int getSize(){
        return size;
    }

    public int get(int index){
        temp=head.next;
        for(int i=0;i<index;i++){
            if(i==index){
                break;
            }
            temp=temp.next;
        }
        return temp.value;
    }

    public String toString(){
        int[]listArray=new int [size];
        temp=head.next;
        for(int i=0;i<listArray.length;i++){
            listArray[i]=temp.value;
            temp=temp.next;
        }
        return Arrays.toString(listArray);
    }

}
class node{
    int value;
    node next;

    node(int value){
        this.value=value;
    }

}
package Queue;

public class Implement_Using_Array {
    static class queue{
        int [] arr;
        int size;
        int rear;
        queue(int size){
            this.size = size;
            rear = -1;
            arr = new int [size];
        }
        public boolean isEmpty(){
            return (rear==-1);
        }
        public boolean isFull(){
            return (rear == size-1);
        }
        public void add(int val){
            if (isFull()) return;
            rear++;
            arr[rear] = val;
        }
        public int peek(){
            if(isEmpty()) return -1;
            return arr[0];
        }
        public int  remove(){
            if(isEmpty()) return -1;
            int front = arr[0];
            for(int i = 0;i<size-1;i++){
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }
    }
    public static void main(String[] args) {
        queue q = new queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        while (q.isEmpty()==false) {
            System.out.println(q.remove());
            
        }
        // System.out.println(q.remove());
        // System.out.println(q.isFull());
        // System.out.println(q.peek());
   
    }
}

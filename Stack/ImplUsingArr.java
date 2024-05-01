package Stack;
public class ImplUsingArr {

    static class Stack {
        int arr[];
        int top;
        public Stack(int size){
            // size = n;
            arr = new int[size];
            top = -1;
        }

        public void push(int elem){
            if(top == arr.length - 1 ) throw new StackOverflowError();
            top++;
            arr[top] = elem;
        }

        public int pop(){
            if(top == -1)
                return -1;
            
            return arr[top--];
        }

        public int peek(){
            return arr[top];
        }

        public boolean isEmpty(){

            return top == -1 ? true : false;
        }

        public int size(){
            return top+1;
        }
        
    }
   
    public static void main(String[] args) {
        // System.out.println("Hello");
        Stack st = new Stack(4);
        
    }
}

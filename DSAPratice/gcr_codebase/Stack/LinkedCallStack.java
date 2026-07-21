package Stack;

class LinkedCallStack{
    private static class Frame{
        String functionName;
        Frame next;

        Frame(String name,Frame next){
            this.functionName=name;
            this.next=next;
        }
    }

    private Frame top=null;

    void push(String functionName){
        top=new Frame(functionName,top);
    }

    String pop(){
        if(isEmpty())
            throw new RuntimeException("No active call to return from");

        String name=top.functionName;
        top=top.next;

        return name;
    }

    String peek(){
        if(isEmpty())
            throw new RuntimeException("No active function");

        return top.functionName;
    }

    boolean isEmpty(){
        return top==null;
    }

    public static void main(String[] args){
        LinkedCallStack stack=new LinkedCallStack();

        stack.push("main()");
        stack.push("login()");
        stack.push("validateUser()");

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
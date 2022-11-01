public class Crazy_List<T> {
    int size;
    Node start;

    class Node {
        String info;
        int value;
        Node next;

        public Node(String a, int b) {
            info = a;
            value = b;
            Node next = null;
        }
    }

    public void add(Node temp){
        Node p=start;
        if(p==null){
            start=temp;
        }else{
            while(p.next!=null){
                p=p.next;
            }
            p.next=temp;
        }
        this.size=size+1;
    }
    public void printList(){
        Node p=start;
        StringBuilder stringBuilder=new StringBuilder();
        while(p!=null){
            stringBuilder.append(p.info).append("(").append(p.value).append(")");
            if(p.next!=null){
                stringBuilder.append("->");
            }
            p=p.next;
        }
        System.out.println(stringBuilder);
    }

    public Crazy_List adults(){
        Crazy_List crazy_list=new Crazy_List();
        crazy_list.size=0;

        Node p= this.start;
        while(p!=null){
            //System.out.println(111);
            if(p.value>=18){
                crazy_list.add(crazy_list.new Node(p.info,p.value));
            }
            p=p.next;
        }
        return crazy_list;
    }
}

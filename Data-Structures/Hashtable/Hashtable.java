public class Hashtable{
    static final int size = 20;
    static class Dataitem{
        int data;
        int key;
        Dataitem(int data, int key){
            this.data = data;
            this.key = key;
        }
    }
    static int hashcode(){
    }
    static Dataitem[] hasharray = new Dataitem[size];
    static void insert(int key,int data){
        Dataitem item = new Dataitem(data,key);
        int hashindex = hashcode(key);
        while(hasharray[hashindex] != null && hasharray[hashindex].key != -1){
            hashindex = (hashindex + 1)% size;
        }
        hasharray[hashindex] = item;
    }
    static Dataitem deleteitem(Dataitem item){
        int key = item.key;
    }
    static void display
    public static void main(String[] args){
        insert(1,20);
        insert(2,70);
        insert(42,80);
        insert(4,25);
        insert(14,32);
        insert(17,11);
        insert(13,78);
        insert(37,97);
        System.out.println("Insertion done !");
        System.out.println();
        display();
    }
}
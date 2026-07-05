package dataStructures;

public class Queue {

    private String [] items;
    private int count;
    private int counter;

    public Queue(int size){
        items = new String [size];
    }
    public boolean isEmpty(){
        return count == 0;
    }

    public void add(String item){
        boolean myQueueIsFull = isFull();
        if(myQueueIsFull){
            throw new IllegalArgumentException("Queue is Full");
        }
        else {
            items[count++] = item;
        }
    }

    public int size(){
        return count;
    }

    public boolean isFull() {
        boolean yesThatQueueIsFull = items.length == count;
        return yesThatQueueIsFull;
    }

    public boolean offer(String item){
        if (count < items.length){
            add(item);
        }
        return count < items.length;

    }

    public String peek(){
        boolean queueIsEmpty = isEmpty();
        if (queueIsEmpty){
            throw new IllegalArgumentException("Nothing In There");
        }
        else {
            return items[counter];
        }
    }

    public String remove(){
       String itemToDisplay = "";
        if (count > 0) {
            --count;
            itemToDisplay = items[counter++];
        }
        return itemToDisplay;
    }

    public String poll(){
        boolean itemsIsEmpty = isEmpty();
        if(itemsIsEmpty){
            throw new IllegalArgumentException("Null");
        }
        else {
            --count;
            return items[counter++];
        }
    }

}

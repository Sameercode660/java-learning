package ArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        CustomArrayList list = new CustomArrayList();

        list.add(1);
        list.add(2);
        list.add(3);

        list.print();

        list.remove();

        list.print();

        System.out.println(list.size());
    }
}

class CustomArrayList{
    private int[] list;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList() {
        this.list = new int[DEFAULT_SIZE];
    }

    private boolean isFull() {
        return list.length == size;
    }

    private void resize() {
        int [] temp = new int[list.length * 2];

        for(int i = 0; i < list.length; i++) {
            temp[i] = list[i];
        }

        list = temp;
    }

    public void add(int num) {
        if(isFull()) {
            resize();
        }

        list[size++] = num;
    }

    public int size() {
        return this.size;
    }

    public void print() {
        for(int i = 0; i < this.size; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }

    public int remove() {
        int result = list[--size];
        return result;
    }

}

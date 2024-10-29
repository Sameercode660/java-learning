package generics;

public class Main {
    public static void main(String[] args) {
        CustomArrayList<String> list = new CustomArrayList<>();

        list.add("Sameer");
        list.add("Amit");
        list.add("Rahul");

        list.print();
    }
}


class CustomArrayList<T>{
    private Object[] list;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList() {
        this.list = new Object[DEFAULT_SIZE];
    }

    private boolean isFull() {
        return list.length == size;
    }

    private void resize() {
        Object [] temp = new Object[list.length * 2];

        for(int i = 0; i < list.length; i++) {
            temp[i] = list[i];
        }

        list = temp;
    }

    public void add(T num) {
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

    public T remove() {
        T result = (T) (list[--size]);
        return result;
    }

}

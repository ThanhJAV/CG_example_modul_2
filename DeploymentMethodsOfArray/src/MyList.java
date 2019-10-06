import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

//    public MyList(int capacity) {
//
//
//    }

    public void setSize(int size) {
        this.size = size;
    }

    public Object getElements(int index) {
        return elements[index];
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }

    private void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = e;
    }

    public void remove(int index) {
        if(index < 0 || index >= size){
           throw new IndexOutOfBoundsException(" Index : " + index + " Size :  " + size);
        }else {
            for (int i = index; i <= size - 1; i++) {
                elements[i] = elements[i + 1];
            }
            size--;
        }
    }

    public int getSize( ) {
        return this.size;
    }

//    public E clone() {
//        E clone = (E) super.clone();
//        return clone;
//    }


}

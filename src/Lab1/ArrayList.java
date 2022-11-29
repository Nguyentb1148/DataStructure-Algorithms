package Lab1;


import java.util.*;


public class ArrayList<E> implements List<E> {
    private static final int DEFAULT_CAPACITY = 4;
    private Object[] elements;
    private int size;

    public ArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }
    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E e) {
        if (this.size==this.elements.length){
            this.elements=grow();
        }
        this.elements[size++]=e;
        return true;
    }
    private Object[]grow(){
        return Arrays.copyOf(this.elements,this.elements.length*2);
    }
    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public E get(int index) {
        checkIndex(index);
        return this.getElements(index);
    }

    @Override
    public E set(int index, E element) {
        checkIndex(index);
        E oldElement=this.getElements(index);
        this.elements[index]=element;
        return oldElement;
    }

    @Override
    public void add(int index, E element) {
        checkIndex(index);
        insert(index,element);

    }

    private void insert(int index, E element) {
        if (this.size==this.elements.length){
            this.elements=grow();
        }
        E lastElements=this.getElements(this.size-1);
        for (int i = this.size-1; i >index; i--) {
            this.elements[i] = this.elements[i - 1];
        }
        this.elements[this.size]=lastElements;
        this.elements[index]=element;
        this.size++;
    }

    private E getElements(int index){
        return (E)elements[index];
    }
    private void checkIndex(int index) {
        if (index<0||index>=this.size){
            throw new IndexOutOfBoundsException(String.format("Index out of bounds: %d for size: %d",index,this.size));
        }
    }

    @Override
    public E remove(int index) {
        this.checkIndex(index);
        E element=this.getElements(index);
        this.elements[index]=null;
        this.size--;
        ensureCapacity();
        return element;
    }

    private void ensureCapacity() {
        if (size < elements.length/3) {
            elements = shrink();
        }
    }


    private Object[] shrink(){
        return Arrays.copyOf(elements,elements.length/2);
    }
    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index<size;
            }

            @Override
            public E next() {
                E element = getElements(index);
                index++;
                return element;
            }
        };
    }
}

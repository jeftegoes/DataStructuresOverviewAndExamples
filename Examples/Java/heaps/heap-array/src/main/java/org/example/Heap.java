package org.example;

public class Heap {
    private int[] heap;
    private int size;

    public Heap(int capacity) {
        heap = new int[capacity];
    }

    public void insert(int value) {
        if (isFull()) {
            throw new IndexOutOfBoundsException("Heap is full.");
        }

        heap[size] = value;
        fixHeapAbove(size);
        size++;
    }

    public int delete(int index) {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Heap is empty");
        }

        int parent = getParent(index);
        int deletedValue = heap[index];

        heap[index] = heap[size - 1];

        if (index == 0 || heap[index] < heap[parent]) {
            fixHeapBelow(index, size - 1);
        } else {
            fixHeapAbove(index);
        }

        size--;

        return deletedValue;

    }

    private void fixHeapAbove(int index) {
        int newValue = heap[index];
        while (index > 0 && newValue > heap[getParent(index)]) {
            heap[index] = heap[getParent(index)];
            index = getParent(index);
        }

        heap[index] = newValue;
    }

    private void fixHeapBelow(int index, int lastHeapIndex) {
        int childToSwap;

        while (index <= lastHeapIndex) {
            int leftChild = getChild(index, true);
            int rightChild = getChild(index, false);
            if (leftChild <= lastHeapIndex) {
                if (rightChild > lastHeapIndex) {
                    childToSwap = leftChild;
                } else {
                    childToSwap = (heap[leftChild] > heap[rightChild] ? leftChild : rightChild);
                }

                if (heap[index] < heap[childToSwap]) {
                    int tmp = heap[index];
                    heap[index] = heap[childToSwap];
                    heap[childToSwap] = tmp;
                } else {
                    break;
                }

                index = childToSwap;
            } else {
                break;
            }
        }
    }

    public boolean isFull() {
        return size == heap.length;
    }

    public int getParent(int index) {
        return (index - 1) / 2;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getChild(int index, boolean left) {
        return 2 * index + (left ? 1 : 2);
    }

    public void printHeap() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i]);
            System.out.print(", ");
        }
        System.out.println();
    }

    public void printTree() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Heap is empty");
        }

        String[] items = new String[size];
        int maxWidth = 0;
        for (int i = 0; i < size; i++) {
            items[i] = Integer.toString(heap[i]);
            if (items[i].length() > maxWidth) {
                maxWidth = items[i].length();
            }
        }

        int height = (int) Math.floor(Math.log(size) / Math.log(2));

        for (int level = 0; level <= height; level++) {
            int levelStart = (1 << level) - 1;
            int levelEnd = Math.min((1 << (level + 1)) - 2, size - 1);

            int leadingSpaces = ((1 << (height - level)) - 1) * (maxWidth + 1);
            int betweenSpaces = ((1 << (height - level + 1)) - 1) * (maxWidth + 1);

            StringBuilder line = new StringBuilder();
            line.append(repeat(" ", leadingSpaces));

            for (int i = levelStart; i <= levelEnd; i++) {
                line.append(pad(items[i], maxWidth));
                if (i < levelEnd) {
                    line.append(repeat(" ", betweenSpaces));
                }
            }

            System.out.println(line.toString());
        }
    }

    private String pad(String s, int width) {
        int totalPadding = width - s.length();
        int left = totalPadding / 2;
        int right = totalPadding - left;
        return repeat(" ", left) + s + repeat(" ", right);
    }

    private String repeat(String s, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(s);
        }
        return sb.toString();
    }
}

/*
 * 此文件由徐瑞康所创建
 */

/**
 * The type Deap.
 */
public class Deap {
    /**
     * clarify The Deap array.
     */
    int[] deap;
    /**
     * The element number of the deap, and the root element is empty
     * To meet the property.
     */
    int numOfDeap = 0;

    /**
     * Instantiates a new Deap.
     *
     * @param maxSize the max size
     */
    public Deap(int maxSize) {
        deap = new int[maxSize];
    }

    // return true if the element in man-Heap, otherwise return false;
    protected boolean inMaxHeap(int i) {
        if( i >= 3 * Math.pow(2, Math.floor(Math.log(i + 1) / Math.log(2)) - 1 ) - 1){
            return true;
        } else {
            return false;
        }
        /*
        while (i > 2) { // get the parent node of this element
            i = (i - 1) / 2;
        }
        // determine the position in which heap
        if (i == 2) {
            return true;
        } else {
            return false;
        }
        */
    }

    // return the index of Corresponding node, if the element is in min-Heap
    private int correspondingNodeInMax(int i) {
        //j = i + 2[log2i - 1]
        //i + 1 cause of the root element is empty
        Double ofs = Math.floor(Math.log(i + 1) / Math.log(2)) - 1;
        int maxCorrespondingNode = (int) (i + Math.pow(2, ofs));
        //if j > the number of current element, then let j be the parent node of itself
        if (maxCorrespondingNode > numOfDeap) {
            maxCorrespondingNode = (maxCorrespondingNode - 1) / 2; // (j-1)/2
        }
        return maxCorrespondingNode;
    }

    // return the index of Corresponding node, if the element is in max-Heap
    private int correspondingNodeInMin(int j) {
        int minCorrespondingNode;
        //i = j - 2[log2j - 1]
        //j + 1 cause of the root element is empty
        Double ofs = Math.floor(Math.log(j + 1) / Math.log(2)) - 1;
        minCorrespondingNode = (int) (j - Math.pow(2, ofs));
        return minCorrespondingNode;
    }

    // Insert key at specified index in min-Heap
    private void minInsert(int at, int key) {
        for (int parent; (parent = (at - 1) / 2) != 0 && key < deap[parent]; deap[at] = deap[parent], at = parent)
            ;
        deap[at] = key;
    }

    // Insert key at specified index in max-Heap
    private void maxInsert(int at, int key) {
        for (int parent; (parent = (at - 1) / 2) != 0 && key > deap[parent]; deap[at] = deap[parent], at = parent)
            ;
        deap[at] = key;
    }

    /**
     * Delete max int.
     *
     * @return the int
     */
// remove and return the largest element from present deap
    public int removeHigh() {
        int indexOflargestElement = 2;
        int tmp_deap = deap[numOfDeap--];

        while (indexOflargestElement * 2 + 1 < numOfDeap) {
            if (deap[indexOflargestElement * 2 + 1] > deap[indexOflargestElement * 2 + 2]) {
                deap[indexOflargestElement] = deap[indexOflargestElement * 2 + 1];
                indexOflargestElement = indexOflargestElement * 2 + 1;
            } else {
                deap[indexOflargestElement] = deap[indexOflargestElement * 2 + 2];
                indexOflargestElement = indexOflargestElement * 2 + 2;
            }
        }
        int min = correspondingNodeInMin(indexOflargestElement);
        if (min * 2 - 1 < numOfDeap) {
            if (deap[min * 2 + 1] > deap[min * 2 + 2]) {
                min = min * 2 + 1;
            } else {
                min = min * 2 + 2;
            }
        }
        if (tmp_deap < deap[min]) {
            deap[indexOflargestElement] = deap[min];
            minInsert(min, tmp_deap);
        } else {
            deap[indexOflargestElement] = tmp_deap;
        }
        return tmp_deap;
    }

    /**
     * Delete min int.
     *
     * @return the int
     */
//remove and return the smallest element from present deap
    public int removeLow() {
        int a = 1;
        int tmp_deap = deap[numOfDeap--];

        while (a * 2 + 1 < numOfDeap) {
            if (deap[a * 2 + 1] < deap[a * 2 + 2]) {
                deap[a] = deap[a * 2 + 1];
                a = a * 2 + 1;
            } else {
                deap[a] = deap[a * 2 + 2];
                a = a * 2 + 2;
            }
        }
        int max = correspondingNodeInMax(a);
        if (tmp_deap > deap[max]) {
            deap[a] = deap[max];
            maxInsert(max, tmp_deap);
        } else {
            deap[a] = tmp_deap;
        }
        return tmp_deap;

    }

    /**
     * Insert.
     *
     * @param x the x
     */
// Insert new element to present deap
    public void add(int x) {
        if (numOfDeap == deap.length - 1) {
            System.out.println("The heap is full");
            System.exit(1);
        }
        numOfDeap++;
        if (numOfDeap == 1) {
            deap[1] = x;
            return;
        }
        if (inMaxHeap(numOfDeap)) {
            int i = correspondingNodeInMin(numOfDeap);
            if (x < deap[i]) {
                deap[numOfDeap] = deap[i];
                minInsert(i, x);
            } else {
                maxInsert(numOfDeap, x);
            }
        } else {
            int i = correspondingNodeInMax(numOfDeap);
            if (x > deap[i]) {
                deap[numOfDeap] = deap[i];
                maxInsert(i, x);
            } else {
                minInsert(numOfDeap, x);
            }
        }
    }

    /**
     * Print.
     */
// Print the deap in tree form
    public void print() {
        int levelNum = 2;
        int thisLevel = 0;
        int gap = 8;
        for (int i = 1; i <= numOfDeap; i++) {
            for (int j = 0; j < gap - 1; j++) {
                System.out.print(" ");
            }
            if (thisLevel != 0) {
                for (int j = 0; j < gap - 1; j++) {
                    System.out.print(" ");
                }
            }
            if (Integer.toString(deap[i]).length() == 1) {
                System.out.print(" ");
            }
            System.out.print(deap[i]);
            thisLevel++;
            if (thisLevel == levelNum) {
                System.out.println();
                thisLevel = 0;
                levelNum *= 2;
                gap /= 2;
            }
        }
        System.out.println();
        if (thisLevel != 0) {
            System.out.println();
        }
    }

    /**
     * Size int.
     *
     * @return the int
     */
    public int size(){
        return numOfDeap;
    }

    /**
     * Is empty boolean.
     *
     * @return the boolean
     */
    public boolean isEmpty(){
        return size()==0;
    }

    /**
     * Get low int.
     *
     * @return the int
     */
    public int getLow(){
        if(isEmpty()){
            return -1;
        }
            return deap[1];

    }

    /**
     * Get high int.
     *
     * @return the int
     */
    public int getHigh(){
        if(isEmpty() || numOfDeap < 2){
            return -1;
        }
        return deap[2];
    }



}
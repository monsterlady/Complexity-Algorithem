import Exceptions.NoMaxHeapException;
import Exceptions.NoMinHeapException;

/**
 * The type Deap test.
 */
public class DeapTest {
    /**
     * The entry point of application.
     *
     * @param argv the input arguments
     */
// Test
    public static void main(String[] argv) {
        System.out.println("start");
        Deap deap = new Deap(1024);
        int[] data = {30, 9 , 8, 19, 15, 10, 5, 25, 20, 4, 40, 45};
        //add data to deap
        for (int i = 0; i < data.length; i++) {
            deap.add(data[i]);
        }
        //Test code
        try {
        System.out.println("Initial Deap------------------------");
        deap.print();
        System.out.println("Current size is : " +deap.size());

        for (int a = 0; a < 3; a++) {
            System.out.println("Delete Min--------------------------");
            deap.removeLow();
            deap.print();
            System.out.println("Current size is : " +deap.size());
        }

        for (int b = 0; b < 3; b++) {
            System.out.println("Delete Max--------------------------");
            deap.removeHigh();
            deap.print();
            System.out.println("Current size is : " + deap.size());
        }

            System.out.println("Insert Element--------------------------");
            deap.add(9);
            deap.print();
            System.out.println("Current size is : " + deap.size());


        } catch (NoMinHeapException | NoMaxHeapException n ) {
            n.printStackTrace();
        }

    }

}

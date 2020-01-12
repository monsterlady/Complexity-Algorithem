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
        int[] data = {10,9,8,7,6,5,4,3,2,1};
        //add data to deap
        for (int i = 0; i < data.length; i++) {
            deap.add(data[i]);
        }
        //Test code

        System.out.println("Initial Deap------------------------");
        deap.print();
        System.out.println("Current size is : " +deap.size());
        try {

            //removeHigh for 3 times
            for (int i = 0; i < 3; i++) {
                System.out.println("Delete Max--------------------------");
                deap.removeHigh();
                deap.print();
                System.out.println("Current size is : " + deap.size());
            }

        //removeLow for 3 times
        for (int i = 0; i < 3; i++) {
            System.out.println("Delete Min--------------------------");
            deap.removeLow();
            deap.print();
            System.out.println("Current size is : " +deap.size());
        }

        //add an element
            System.out.println("Insert Element--------------------------");
            deap.add(9);
            deap.print();
            System.out.println("Current size is : " + deap.size());
         //get the Largest element
            System.out.println("Retrieve the largest Element------------");
            System.out.println("The largest element now is : "+ deap.getHigh());
            deap.print();
            System.out.println("Current size is : " + deap.size());
         //get the smallest element
            System.out.println("Retrieve the smallest Element------------");
            System.out.println("The smallest element now is : "+deap.getLow());
            deap.print();
            System.out.println("Current size is : " + deap.size());
            //Test if the deap is empty
            for(int i = deap.size(); i > 0;i--){
                deap.removeLow();
                System.out.println("Current size is : " + deap.size());
            }
            deap.print();
            System.out.println(deap.isEmpty());


            } catch (NoMinHeapException | NoMaxHeapException n ) {
            n.printStackTrace();
        }

    }

}

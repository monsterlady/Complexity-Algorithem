/**
 * The type Deap test.
 */
public class DeapTest {
    /**
     * The entry point of application.
     *
     * @param argv the input arguments
     */
// 메인 함수 작성
    public static void main(String[] argv) {
        System.out.println("start");
        Deap deap = new Deap(1024);
        int[] data = {235, 33, 88, 63, 242, 423, 253, 332, 444, 48, 29, 87, 999};
        for (int i = 0; i < data.length; i++) {
            deap.add(data[i]);
        }
        System.out.println("Initial Deap------------------------");
        deap.print();
        System.out.println(deap.size());

        for (int a = 0; a < 3; a++) {
            System.out.println("Delete Min--------------------------");
            deap.removeLow();
            deap.print();
            System.out.println(deap.size());
        }

        for (int b = 0; b < 3; b++) {
            System.out.println("Delete Max--------------------------");
            deap.removeHigh();
            deap.print();
            System.out.println(deap.size());
        }

        System.out.println(deap.getLow() + "  " + deap.getHigh());

    }
}

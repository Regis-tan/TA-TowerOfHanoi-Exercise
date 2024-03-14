public class TowerOfHanoi {
    static int step = 0;

    public static void main(String[] args) {
        // Setup stuff
        int disk_num = 3;
        String start_rod = "A";
        String inter_rod = "B";
        String end_rod = "C";

        Solver(disk_num, start_rod, inter_rod, end_rod);
    }

    public static void Solver(int disk_num, String start_rod, String inter_rod, String end_rod) {
        if (disk_num == 1) {
            step++;
            System.out.println("Current step: " + step);
            System.out.println("Move disk 1 from rod " + start_rod + " to rod " + end_rod);
            System.out.println("-----------------");
            return;
        }

        Solver(disk_num - 1, start_rod, end_rod, inter_rod);
        step++;
        System.out.println("Current step: " + step);
        System.out.println("Move disk " + disk_num + " from rod " + start_rod + " to rod " + end_rod);
        System.out.println("-----------------");
        Solver(disk_num - 1, inter_rod, start_rod, end_rod);
    }
}

public class Main {
    public static void main(String[] args) {

        long start = System.nanoTime();
        SimpleLogger.WritePlain(100000);
        long end = System.nanoTime();
        double seconds = (end - start) / 1_000_000_000.0;
        System.out.println(seconds + " seconds");

        long start1 = System.nanoTime();
        SimpleLogger.writeBuffered(100000);
        long end1 = System.nanoTime();
        double seconds1 = (end1 - start1) / 1_000_000_000.0;
        System.out.println(seconds1 + " seconds");

    }
}

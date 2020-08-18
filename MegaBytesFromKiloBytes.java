package MegaBytesConverter;

public class MegaBytesFromKiloBytes {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            double megaBytes = kiloBytes / 1024;
            double remainingKiloBytes = kiloBytes % 1024;
            System.out.println(kiloBytes + "KB = " + megaBytes + "MB " + remainingKiloBytes + "KB");
        }
    }
    }
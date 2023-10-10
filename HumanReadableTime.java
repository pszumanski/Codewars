public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        int ss = seconds % 60;
        int mm = (seconds % 3600) / 60;
        int hh = (int) seconds / 3600;
        String ssF;
        String mmF;
        String hhF;
        if (ss == 0) {
            ssF = "00";
        } else if (ss < 10) {
            ssF = "0" + Integer.toString(ss);
        } else
        {
            ssF = Integer.toString(ss);
        }
        if (mm == 0) {
            mmF = "00";
        } else if (mm < 10) {
            mmF = "0" + Integer.toString(mm);
        } else
        {
            mmF = Integer.toString(mm);
        }
        if (hh == 0) {
            hhF = "00";
        } else if (hh < 10) {
            hhF = "0" + Integer.toString(hh);
        } else
        {
            hhF = Integer.toString(hh);
        }
        return hhF + ":" + mmF + ":" + ssF;

        // Better solution:
        // return String.format("%02d:%02d:%02d", seconds / 3600, (seconds / 60) % 60, seconds % 60);

    }

    public static void main(String[] args) {
        System.out.println(makeReadable(0));
    }
}

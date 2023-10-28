class Persist {

    public static void main(String[] args) {
        System.out.println(persistence(39L));
    }

    static int counter = 0;
    public static int persistence(long n) {
        int temp = 1;
        int memory = counter;
        if (n < 10) {
            counter = 0;
            return memory;
        }
        for (int i = 1; i <= n ; i *= 10) {
            temp *= (int) ((n % (i * 10) - n % i) / i);
        }
        counter++;
        return persistence(temp);
    }

}
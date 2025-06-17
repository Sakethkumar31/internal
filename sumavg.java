public class sumAvg{
    public static void main(String[] args) {
        int sum = 0;
        int count = 10;
        for (int i = 1; i <= count; i++) {
            sum += i;
        }
        double average = sum / (double) count;
        System.out.println("Sum:"+sum);
        System.out.println("Average:"+average);
    }
}


public class Prime_20 {
    public static void main(String[] args) {
        int count = 0;
        for(int num = 2 ; ; num++){
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0)
                    check = false;
            }
            if (check) {
                count++;
                System.out.println(num);
            }
            if (count ==20)
                break;
        }
    }
}

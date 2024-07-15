class nesfor {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("DAY-" + i);
            for (int j = 1; j <= 3; j++) {
                System.out.println((j + 8) + "-" + (j + 9));
            }
            int start = 11;
            for (int k = 0; k <= 6; k++) {
                int end = start + 1;
                if (start == 12) {
                    end = 1;
                }
                System.out.println(start + "-" + end);
                start = end;
            }
        }
    }
}

package home_work_1;

public class Exercise7 {

        public static void main(String[] args) {
            int[] digits = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
            String phoneNumber = createPhoneNumber(digits);
            System.out.println(phoneNumber);
        }

        public static String createPhoneNumber(int[] digits) {
            if (digits.length != 10) {
                return "Массив должен содержать ровно 10 цифр";
            }

            StringBuilder sb = new StringBuilder();
            sb.append("(")
                    .append(digits[0]).append(digits[1]).append(digits[2])
                    .append(") ")
                    .append(digits[3]).append(digits[4]).append(digits[5])
                    .append("-")
                    .append(digits[6]).append(digits[7]).append(digits[8]).append(digits[9]);

            return sb.toString();
        }


}

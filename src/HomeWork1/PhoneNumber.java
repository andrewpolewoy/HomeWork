package HomeWork1;

public class PhoneNumber {
    public static void main(String[] args) {
        int [] number = {1,2,3,4,5,6,7,8,9,0};
        System.out.println(createPhoneNumber(number));

    }
    public static String createPhoneNumber(int [] number) {
        StringBuilder s = new StringBuilder();
        s.append("(");
        for (int i = 0; i < 3; i++) {
            s.append(number[i]);
        }
        s.append(")" + " ");
        for (int i = 3; i < 6; i++) {
            s.append(number[i]);
        }
        s.append("-");
        for (int i = 6; i < 10; i++) {
            s.append(number[i]);
        }
        return String.valueOf(s);
    }
}
//(123) 456-7890
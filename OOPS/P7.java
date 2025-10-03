package OOPS;

public class P7 {

    public static void main(String[] args) {
        String str1 = "Hello, ";
        String str2 = "Java World!";
        String str3 = " Have a great day!";

        String result1 = str1 + str2;
        System.out.println("1. Using '+' operator: " + result1);

        String result2 = str1.concat(str2).concat(str3);
        System.out.println("2. Using concat() method: " + result2);

        StringBuilder sb = new StringBuilder(str1);
        sb.append(str2);
        sb.append(str3);
        String result3 = sb.toString();
        System.out.println("3. Using StringBuilder: " + result3);

        String formatResult = String.format("%s%s", str1, str2);
        System.out.println("4. Using String.format(): " + formatResult);
    }
}


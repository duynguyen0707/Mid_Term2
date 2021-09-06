public class EntryPoint {

    //is contain special character?
    public static boolean isContainSpecialChar(String str) {
        int n = 0;

        for (int i = 0; i < str.length(); i++) {

            if (!Character.isDigit(str.charAt(i)) && !Character.isLetter(str.charAt(i)) && !Character.isWhitespace(str.charAt(i))) {
                n++;
            }
        }

        if (n == 0)
            return false;

        else return true;
    }

    //kiểm tra xem chuỗi có chưa  kí tự hoa, nếu phải trả về true, ko thì trả về false
    public static boolean isContainUpperLetter(String str) {
        boolean va = true;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                return true;
            }

        }
        return false;
    }

    //kiểm tra có chứa kí tự số ko? nếu có thì trả về true, ko thì trả về false
    public static boolean isContainNumber(String str) {
        boolean va = true;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                return true;
            }

        }
        return false;
    }

    // kiểm tra xem chuỗi có đủ 10 characters k? có thì trả về true, k thì trả về false
    public static boolean isMoreThan10Char(String str) {
        boolean va = true;
        int len = str.length();
        if (len >= 10) {
            return true;
        }
        return false;
    }

    // Hàm check password có valid hay k?
    public static int isPassworvalid(String str) {
        // nếu chuỗi ko đủ 10 kí tự, ko chứa special character => trả về 1

        if (!isContainSpecialChar(str) && !isMoreThan10Char(str)) {

            return 1;
        }
        // nếu chuỗi ko đủ 10 kí tự nhưng chứa special character => trả về 2
        if (!isMoreThan10Char(str) && isContainSpecialChar(str)) {

            return 2;
        }
        // nếu chuỗi đủ 10 kí tự nhưng ko chứa special character => trả về 3
        if (isMoreThan10Char(str) && !isContainSpecialChar(str))
            return 3;
        // ngược lại cái trường hợp trên trả về 0;
        return 0;
    }
}


public class LearningText {
    public static void main(String[] args) {

      String phoneNumber = "(234) 333-5551";
      String areaCode = parseAreaCode(phoneNumber);
      String next = parseExchange(phoneNumber);
      String next2 = phoneNumber.substring(11);

        System.out.println(areaCode);
        System.out.println(next);
        System.out.println(next2);


    }

    public static String parseAreaCode (String phoneNumber) {
        String areaCode = phoneNumber
                .substring(0,5)
                .replace( "(", " ")
                .replace(")"," ")
                .trim();
        return areaCode;



    }

    public static String parseExchange (String phoneNumber) {
        String exchange= phoneNumber.substring(6,9);
        return exchange;

    }

    public static String parseLineNumber (String phoneNumber) {
        String lineNumber = phoneNumber.substring(11);
        return lineNumber;

    }


    }
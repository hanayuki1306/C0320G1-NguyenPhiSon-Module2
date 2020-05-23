package CaseStudyModule2JavaCore.Exception;

public class EmailException extends Exception {
    public EmailException(String s) {
        super(s);
    }
    public static String emailException(String email) throws EmailException {
        String regex = "^[\\w-]+@[a-zA-Z]+\\.[a-zA-Z]+$";
        if (email.matches(regex)) {
            return email;
        } else {
            throw new EmailException("Email không hợp lệ, phai theo format abc@abc.abc");
        }
    }
}

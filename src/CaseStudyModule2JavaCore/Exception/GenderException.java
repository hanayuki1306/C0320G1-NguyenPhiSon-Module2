package CaseStudyModule2JavaCore.Exception;

public class GenderException extends Exception {
    public GenderException(String s){
        super(s);
    }
//    public GenderException() throws GenderException {
//        genderException("null");
//    }
    public static String genderException(String gender) throws GenderException {
        String loweCase;
        String format="";
        if(!gender.equals("")){
            loweCase = gender.toLowerCase();
            format = loweCase.substring(0,1).toUpperCase() + loweCase.substring(1);
        }



        String regex = "^Male|Falmale|Unknow$";
        if (format.matches(regex)){
            return format;
        } else {
            throw new GenderException("input male falmale or unknow\n");
        }
    }
}

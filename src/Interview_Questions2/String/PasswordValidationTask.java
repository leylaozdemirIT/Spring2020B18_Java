package Interview_Questions2.String;
/*1. Write a return method that can verify if a password is valid or not.

        requirements:
        1. Password MUST be at least have 6 characters and should not contain space
        2. PassWord should at least contain one upper case letter
        3. PassWord should at least contain one lowercase letter
        4. Password should at least contain one special characters
        5. Password should at least contain a digit
if all requirements above are met, the method returns true, otherwise returns  false*/
public class PasswordValidationTask {
    public static void main(String[] args) {
        System.out.println( PasswordValidation("lU/5bb") );
    }


    public static boolean PasswordValidation(String password) {
        String lowercase = "(.*[a-z].*)";
        String uppercase = "(.*[A-Z].*)";
        String numbers = "(.*[0-9].*)";
        String specialChars = "(.*[ -/, :-@].*)";

        boolean HasLower = password.matches(lowercase);
        boolean HasUpper = password.matches(uppercase);
        boolean HasDigits = password.matches(numbers);
        boolean HasChars = password.matches(specialChars);

        if (password.length() >= 6 && !password.contains("")) {
            if (HasChars && HasUpper && HasDigits && HasLower) {
                return true;
            }
        }
        return false;
    }
}

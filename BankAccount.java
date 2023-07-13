class BankAccount {
    static double currentBalance;
    static boolean isCredited;
    static boolean isDebited;
    static String email;
    static String phoneNumber;
    static long password;

    public static boolean validateEmail(String email) {
        // Email validation regex pattern
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static boolean validatePhoneNumber(String phoneNumber) {
        // Phone number validation regex pattern
        String regex = "\\d{10}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();   
}

    public static void main(String[] args) {
        email = "example@example.com";
        phoneNumber = "1234567890";

        if (validateEmail(email) && validatePhoneNumber(phoneNumber)) {
            password = generatePassword();
            System.out.println("Email: " + email);
            System.out.println("Phone Number: " + phoneNumber);
            System.out.println("Password: " + password);
        } else {
            System.out.println("Your email or phone number is invalid.");
        }
    }
}


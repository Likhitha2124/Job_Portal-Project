public class Main {
    public static void main(String[] args) throws Exception {

        // Step 1: Register user
        UserService.register(new User("admin", "1234"));

        // Step 2: Login check
        boolean isValid = UserService.login("admin", "1234");

        if (isValid) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Invalid Login");
        }
    }
}
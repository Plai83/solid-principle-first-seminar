package homework;

import java.util.Scanner;

public class UserView {
    private final UserManager userManager;

    public UserView() {
        this.userManager = new UserManager();
    }

    public void run() {
        User user = createUser();
        System.out.println(userManager.saveUser(user));
        System.out.println(userManager.reportUser(user));

    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private User createUser() {
        String firstName = prompt("Введите имя абонента: ");
        return new User(firstName);
    }

}

package creational_design_pattern.builder_design_pattern;

public class Client {

    public static void main(String[] args) {

        User user  = new User.UserBuilder()
                .setUserId(1)
                .setUserName("Akash")
                .setEmailId("akash.123@email.com")
                .build();
        System.out.println(user);
    }
}

package creational_design_pattern.builder_design_pattern;

public class User {

    private int userId;
    private String userName;
    private String emailId;

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmailId() {
        return emailId;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", emailId='" + emailId + '\'' +
                '}';
    }

    public User(UserBuilder userBuilder) {
        this.userId = userBuilder.userId;
        this.userName = userBuilder.userName;
        this.emailId = userBuilder.emailId;
    }


    // inner class
    public static class UserBuilder{
        private int userId;
        private String userName;
        private String emailId;

        public UserBuilder() {
        }

        public UserBuilder setUserId(int userId) {
            this.userId = userId;
            return this;
        }

        public UserBuilder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public UserBuilder setEmailId(String emailId) {
            this.emailId = emailId;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }

}

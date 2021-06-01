public abstract class UserDecorator implements User {
    private User user;

    public UserDecorator(User user) {
        this.user = user;
    }

    @Override
    public String decorate() {
        return user.decorate();
    }
}

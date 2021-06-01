import java.util.Random;

public class DebtNumbers extends UserDecorator {

    public DebtNumbers(User user) {
        super(user);
    }

    public String decorate() {
        return super.decorate() + decorateWithBubbleLights();
    }

    private String decorateWithBubbleLights() {
        return " number " + (new Random().ints(1, 10).findFirst().getAsInt());
    }
}

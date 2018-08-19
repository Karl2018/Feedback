package queens.feedback;

/**
 * Created by 2618436 on 29/06/2016.
 */
public class NotNetworkException  extends RuntimeException {


    public NotNetworkException() {
        super("NotNetworkException, you need internet connection to send the email");
    }

    public NotNetworkException(String detailMessage) {
        super(detailMessage);
    }
}


import java.time.LocalDateTime;

public class DefaultMethodInterfaceImpl implements DefaultMethodInterface {
    @Override
    public LocalDateTime getLocalDateTime() {
        return LocalDateTime.now();
    }

    public static void main(String[] args) {
        DefaultMethodInterface myobj = new DefaultMethodInterfaceImpl();
        myobj.sayHello("harry");
        System.out.println(myobj.getLocalDateTime());
    }
}

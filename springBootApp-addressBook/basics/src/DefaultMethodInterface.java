import java.time.LocalDateTime;

public interface DefaultMethodInterface {
    default void sayHello(String name) {
        System.out.println("hello " + name);
    }

    LocalDateTime getLocalDateTime();

}

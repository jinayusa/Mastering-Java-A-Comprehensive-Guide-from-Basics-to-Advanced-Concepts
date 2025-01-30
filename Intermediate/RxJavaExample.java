//Introduction to Reactive Programming with RxJava for handling asynchronous data streams.
import io.reactivex.Observable;

public class RxJavaExample {
    public static void main(String[] args) {
        Observable<String> observable = Observable.just("Java", "Reactive", "Programming");

        observable.subscribe(
            item -> System.out.println("Item: " + item), // onNext
            throwable -> System.out.println("Error: " + throwable), // onError
            () -> System.out.println("Stream completed!") // onComplete
        );
    }
}

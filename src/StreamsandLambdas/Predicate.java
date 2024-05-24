package StreamsandLambdas;

@FunctionalInterface
public interface Predicate<T> {
    boolean Test(int sampleNumber);
}

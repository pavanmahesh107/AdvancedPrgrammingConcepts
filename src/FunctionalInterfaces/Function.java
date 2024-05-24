package FunctionalInterfaces;

@FunctionalInterface
public interface Function<T,U> {
     U test(T t);
}

package FunctionalInterfaces;

@FunctionalInterface
public interface BiPredicate<T,U> {
    boolean Test(T t, U u);
}

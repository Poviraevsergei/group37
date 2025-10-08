package lesson17;

@FunctionalInterface
public interface StringFilter {
    boolean accept(String s);
}

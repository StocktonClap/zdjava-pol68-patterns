package observer;

public interface Subject <T>{
    void observer (Observer<T> observer);
    void notifyAllObservers(T message);
}

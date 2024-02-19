public class ConcreteRunnableFactory1 implements RunnableFactory {
    @Override
    public Runnable createRunnable() {
        return new ConcreteRunnable1();
    }
}

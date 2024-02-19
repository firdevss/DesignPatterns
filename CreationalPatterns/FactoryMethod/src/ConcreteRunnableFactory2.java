public class ConcreteRunnableFactory2 implements RunnableFactory{
    @Override
    public Runnable createRunnable() {
        return new ConcreteRunnable2();
    }
}

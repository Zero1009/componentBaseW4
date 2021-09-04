public class Person2 implements MyObserver {
    @Override
    public void update(Source o){
        System.out.println("(Person2) Boss is updated to "+ ((Boss)o).getSomeData());
    }
}
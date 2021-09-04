public class Person1 implements MyObserver {
    @Override
    public void update(Source o){
        System.out.println("(Person1) Boss is updated to "+ ((Boss)o).getSomeData());
    }
}

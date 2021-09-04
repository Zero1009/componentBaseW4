import java.util.ArrayList;

public class Boss implements Source {
    private final ArrayList<MyObserver> list;
    private String someData;

    public Boss(){
        this.list = new ArrayList<MyObserver>();
    }

    public void setSomeData(String aData){
        someData = aData;
        notifyObservers();
    }

    public String getSomeData(){
        return someData;
    }

    @Override
    public void register (MyObserver observer){
        list.add(observer);
    }

    @Override
    public void notifyObservers(){
        for(int i = 0; i < list.size();++i){
            list.get(i).update(this);
        }
    }
}

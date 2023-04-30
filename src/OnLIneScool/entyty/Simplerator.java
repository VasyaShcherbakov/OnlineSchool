package OnLIneScool.entyty;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Simplerator <E> implements Iterator<E> {
private List<E> objects;
private int position;

public Simplerator(List<E> objects){
    this.objects=objects;
    this.position=0;
}
@Override
    public boolean hasNext(){
    return position < objects.size();
}

    @Override
    public E next() {
        return null;
    }

    @Override
    public E Next() {
    if (!hasNext()) {
        return null;
    }

    E object = objects.get(position);
    position++;
    return object;
}
    @Override
    public void remove(){
        if(position >0 && position <= objects.size()){
            objects.remove(position-1);
            position --;



        }
    }

    @Override
    public void forEachRemaining(Consumer<? super E> action) {
        Iterator.super.forEachRemaining(action);
    }

}






public class Box <T>{
    //<T> -> T means type. we don't know what datatype the user is going to type, so we set it to <T>

    T item;

    public void setItem(T item){
        this.item = item;
    }

    public T getItem() {
        return this.item;
    }
}

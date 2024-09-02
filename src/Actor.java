public abstract class Actor implements ActorBehaviour{
    protected  boolean isTakeOrder;// добавляем состояние

    protected boolean isMakeOrder;

    protected final String name;

    public Actor(String name) {
        this.name = name;
    }

    public abstract String getName();

}

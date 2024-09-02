import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehaviour, QueueBehaviour {

    private List<Actor> queue;

    public Market() {
        this.queue = new ArrayList<>();
    }

    @Override
    public void acceptToMarket(Actor actor) {
        queue.add(actor);
        System.out.println("Actor пришёл в магазин и добавлен в очередь.");
    }

    @Override
    public void releaseFromMarket(List<Actor> actorList) {
    }

    @Override
    public void update() {
        takeOrders();
        giveOrders();
        releaseFromQueue();
    }

    @Override
    public void takeInQueue(Actor actor) {
        queue.add(actor);
        System.out.println("Actor добавлен в очередь.");

    }

    @Override
    public void takeOrders() {
        for (Actor actor : queue) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                System.out.println("Actor сделал заказ.");
            }
        }
    }


    @Override
    public void giveOrders() {
        for (Actor actor : queue) {
            if (actor.isMakeOrder() && !actor.isTakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println("Actor получил свой заказ.");
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        queue.removeIf(Actor::isTakeOrder);

        System.out.println("Actor покидает магазин.");

    }

    public void printQueue() {
        System.out.println("Текущая очередь: " + queue);
    }
}

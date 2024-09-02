// 1. реализовать асбтрактный класс Actor, который хранит в себе параметры актора,
// включая состояние готовности сделать заказ и факт получения заказа
//
// 2. реализовать интерфейс QueueBehaviour, который описывает логику очереди -
// помещение и освобождение из очереди, принятие/отдача заказа
//
// 3. реализовать интерфейс MarketBehaviour, который описывает логику магазина -
// приход/уход покупателей, обновление состояния магазина
public class Main {

    public static void main(String[] args) {
        Market market = new Market();

        Actor actor1 = new Human("Ivan Petrov");

        market.acceptToMarket(actor1);

        market.printQueue();

        market.takeOrders();
        market.giveOrders();
        market.releaseFromQueue();

        market.printQueue();
    }
}
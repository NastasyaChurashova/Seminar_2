public interface ActorBehaviour {
    void setMakeOrder(boolean makeOrder);

    void setTakeOrder(boolean takeOrder);

    boolean isMakeOrder();// проверка создан ли заказ

    boolean isTakeOrder();
}

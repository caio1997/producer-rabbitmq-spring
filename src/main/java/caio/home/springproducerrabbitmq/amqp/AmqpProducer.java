package caio.home.springproducerrabbitmq.amqp;

public interface AmqpProducer<T> {
    void producer(T t);
}

public class AudiFactory implements CarFactory {

    @Override
    public Engine createEngine() {
        return new AudiEngine();
    }

    @Override
    public Seat createSeat() {
        return new AudiSeat();
    }
}

public class BMWFactory implements CarFactory {

    @Override
    public Engine createEngine() {
        return new BMWEngine();
    }

    @Override
    public Seat createSeat() {
        return new BMWSeat();
    }
}

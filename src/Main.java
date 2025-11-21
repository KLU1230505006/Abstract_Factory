public class Main {
    public static void main(String[] args) {

        // BMW fabrikasından ürün oluşturma
        CarFactory bmwFactory = new BMWFactory();
        Engine bmwEngine = bmwFactory.createEngine();
        Seat bmwSeat = bmwFactory.createSeat();

        bmwEngine.start();
        bmwSeat.sit();

        System.out.println("----------------");

        // Audi fabrikasından ürün oluşturma
        CarFactory audiFactory = new AudiFactory();
        Engine audiEngine = audiFactory.createEngine();
        Seat audiSeat = audiFactory.createSeat();

        audiEngine.start();
        audiSeat.sit();
    }
}

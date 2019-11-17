import io.Console;
import models.Sneaker;
import services.SneakerService;

public class App {

    private SneakerService sneakerService = new SneakerService();

    public static void main(String... args) {
        App application = new App();
        application.init();
    }

    public void init() {
        Console.println("Welcome!!");
        Integer action = Console.getIntegerInput(
                "1 create shoe\n" +
                        "2 read shoes\n" +
                        "3 update shoe\n" +
                        "4 delete shoe\n" +
                        "select action: ");
        interpretUserAction(action);

    }

    public void interpretUserAction(Integer action) {
        switch(action) {
            case 1: // create
                create("Shoe");
                Console.println("New Sneaker created with id %s", sneakerService.size());
                break;
            case 2: // read
                read("shoe");
                break;
            case 3: // update
                update();
                break;
            case 4: // destroy
                delete();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                init();
        }
        init();
    }

    public void create(String product) {
        String name = Console.getStringInput("%s name: ", product);
        String brand = Console.getStringInput("%s brand: ", product);
        String sport = Console.getStringInput("%s sport: ", product);
        Double size = Console.getDoubleInput("%s size: ", product);
        Integer quantity = Console.getIntegerInput("%s quantity: ", product);
        Float price = Float.parseFloat(Console.getStringInput("%s price: ", product));

        sneakerService.create(name, brand, sport, size, quantity, price);

    }
    public void read(String product) {
        Console.println(sneakerService.toString());
    }

    public void update() {
        Integer id = Console.getIntegerInput("enter id of sneaker to update: ");
        Sneaker toUpdate = sneakerService.findSneaker(id);
        Integer action = Console.getIntegerInput("Update Sneaker:\n" +
                "1 : Name\n2 : Brand\n3 : Sport\n" +
                "4 : Size\n5 : Quantity\n6 : Price\n" +
                "Select attribute to update: ");
        toUpdate = dispatchUpdate(action, toUpdate);
        sneakerService.update(id, toUpdate);
        Console.println("Shoe %s has been updated", id);
    }

    public Sneaker dispatchUpdate(Integer action, Sneaker sneaker) {
        switch(action) {
            case 1:
                String name = Console.getStringInput("Change Name: ");
                sneaker.setName(name);
                break;
            case 2:
                String brand = Console.getStringInput("Change Brand: ");
                sneaker.setBrand(brand);
                break;
            case 3:
                String sport = Console.getStringInput("Change Sport: ");
                sneaker.setSport(sport);
                break;
            case 4:
                Double size = Console.getDoubleInput("Change Size: ");
                sneaker.setSize(size);
                break;
            case 5:
                Integer quantity = Console.getIntegerInput("Change Quantity: ");
                sneaker.setQuantity(quantity);
                break;
            case 6:
                Float price = Float.parseFloat(Console.getStringInput("Change Price: "));
                sneaker.setPrice(price);
                break;
        }
        return sneaker;
    }

    public void delete() {
        Integer id = Console.getIntegerInput("Enter Id of Sneaker to delete: ");
        if (sneakerService.delete(id)) Console.println("Sneaker %s successfully deleted", id);
        else Console.println("Deletion failed");
    }
}

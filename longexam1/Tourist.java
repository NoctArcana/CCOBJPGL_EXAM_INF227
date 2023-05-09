public interface Tourist {

    int budget = 0;

    void visit();

    void visit(Boracay boracay);

    void visit(Albay albay);

    void visit(Baguio baguio);

    void visit(Batangas batangas);

    void visit(Bohol bohol);

    void visit(Cebu cebu);

    default void visit(Locations locations) {
        System.out.println("Arrived on a location");
    };

    void checkBudget();
}
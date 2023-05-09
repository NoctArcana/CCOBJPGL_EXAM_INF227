public class Me implements Tourist {

    static int budget = 10;

    public void visit() {
        System.out.print("Enjoying my stay");
    }

    public void visit(Boracay boracay) {
        if (budget < boracay.airFare){
            System.out.println("My budget ran out");
        } else {
            budget = budget - boracay.airFare;
            System.out.println("I went for a swim at the white beach");
        }
        checkBudget();
    }

    public void visit(Albay albay) {
        if (budget < albay.airFare){
            System.out.println("My budget ran out");
        } else {
            budget = budget - albay.airFare;
            System.out.println("I went for a hiking trip at Mayon Volcano");
        }
        checkBudget();
    }

    public void visit(Baguio baguio) {
        if (budget < baguio.airFare){
           System.out.println("My budget ran out");
        } else {
            budget = budget - baguio.airFare; 
            System.out.println("I went to cool down from the summer heat in Baguio City");
        }
        checkBudget();
    }

    public void visit(Batangas batangas) {
        if (budget < batangas.airFare){
           System.out.println("My budget ran out");
        } else {
            budget = budget - batangas.airFare; 
            System.out.println("I went sightseeing at Taal Lake");
        }
        checkBudget();
    }

    public void visit(Bohol bohol) {
        if (budget < bohol.airFare){
            System.out.println("My budget ran out");
        } else {
            budget = budget - bohol.airFare;
            System.out.println("I rode a hot air balloon to view the Chocolate Hills"); 
        }
        checkBudget();
    }

    public void visit(Cebu cebu) {
        if (budget < cebu.airFare){
            System.out.println("My budget ran out");
        } else {
            budget = budget - cebu.airFare;  
            System.out.println("I rode a boat to go island hopping in Cebu");
        }
        checkBudget();
    }

    public void checkBudget() {
        System.out.println("my budget is " + budget);
    }

}
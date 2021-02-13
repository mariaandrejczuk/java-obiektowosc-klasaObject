
public class RealEstateRepo {

    private RealEstate[] realEstates = new RealEstate[10];
    private int index = 0;

    public void add(RealEstate realEstate) {
        if (index < realEstates.length && !exists(realEstate)) {  //spr., czy jest miejsce i czy dana działka juz nie istnieje w repo
            realEstates[index++] = realEstate;
        }
    }

    private boolean exists(RealEstate realEstate) {
        for (int i = 0; i < index; i++) {
            if (realEstates[i].equals(realEstate)) {   // exists = realEstates[i].equals(realEstate) --> wynik tego equals przypisujemy do exists, które musi odpowiedziec, czy istnieje, czy nie
                return true; //sprawdz czy sa równe, i jezeli sa rowne, to od razu zakończ z true
            }
        }
        return false;
    }

    public void displayAll() {
        for (int i = 0; i < index; i++) {
            System.out.println(realEstates[i]);
        }
    }
}

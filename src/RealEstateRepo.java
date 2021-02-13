
public class RealEstateRepo {

    private RealEstate[] realEstates = new RealEstate[10];
    private int index = 0;

    public void add(RealEstate realEstate) {
        if (index < realEstates.length) {
            realEstates[index++] = realEstate;
        }
    }
}

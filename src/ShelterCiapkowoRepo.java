
public class ShelterCiapkowoRepo {

    private Animal[] animals = new Animal[10];
    private int index = 0;

    public void add(Animal animal) {
        if (index < animals.length && !exists(animal)) {  //spr., czy jest miejsce i czy dane zwierze juz nie istnieje w schronisku
            animals[index++] = animal;
        }
    }

    private boolean exists(Animal shelterCiapkowoRepo) {
        for (int i = 0; i < index; i++) {
            if (animals[i].equals(shelterCiapkowoRepo)) {   //  wynik tego equals przypisujemy do exists, które musi odpowiedziec, czy istnieje, czy nie
                return true; //sprawdz czy sa równe, i jezeli sa rowne, to od razu zakończ z true
            }
        }
        return false;
    }

    public void displayAll() {
        for (int i = 0; i < index; i++) {
            System.out.println(animals[i]); // gdyby nie użyć metody toString w klasie Animal, to wówczas wyświetli nam się nazwa klasy @ numer szesnastkowy
        }
    }
}

public class Cat {
    private String name; //кличка кота
    private int appetite; //сколько единиц еды он потребляет за приём пищи
    private boolean satiety=false; //сытость
    private int infoPlate; //В тарелке осталось...

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate) {
        satiety = plate.plateCheck(appetite);
        infoPlate = plate.getFood();
    }

    public void info() {
        System.out.println(name + " " + (satiety ? " сыт " : " голоден ") + " (В тарелке осталось " + infoPlate + " единиц)");
    }
}

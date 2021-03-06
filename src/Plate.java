public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public boolean plateCheck(int appetite) {
        if (food - appetite < 0) {
            //4. Считаем, что если коту мало еды в тарелке, то он ее просто не трогает...
            return false;
        }
        else {
            food -= appetite;
            return true;
        }
    }

    //6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку
    public void addFood(int food) {
        this.food += food;
    }
}
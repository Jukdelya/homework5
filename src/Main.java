public class Main {
    public static void main(String[] args) {
        Fridge fridge = new Fridge.Builder("meat","milk",4).build();
        System.out.println(fridge.getFood());
        System.out.println(fridge.getDrink());
        System.out.println(fridge.getTemp());

        Math math1 = new Math(21);
        Math math2 = new Math(21);
        System.out.println(math1.equals(math2));
    }
}
class Fridge{
    private final String food;
    private final String drink;
    private final int temp;

    public String getFood() {
        return food;
    }
    public String getDrink() {
        return drink;
    }
    public int getTemp() {
        return temp;
    }
    private Fridge(Builder builder){
        this.food = builder.food;
        this.drink = builder.drink;
        this.temp = builder.temp;
    }
        static class Builder {
            private final String food;
            private final String drink;
            private final int temp;

            public Builder(String food, String drink, int temp) {
                this.food = food;
                this.drink = drink;
                this.temp = temp;
            }
            public Fridge build(){
                return new Fridge(this);
            }
        }
    }


class Math{
    private int answer;

    public Math(int answer){
        this.answer = answer;
    }
    public boolean equals(Object obj){
        Math MathAnswer = (Math) obj;
        return this.answer == MathAnswer.answer;
    }
}
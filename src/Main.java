
public class Main {
    public static void main(String[] args) {
        Voin voin = new Voin();
        voin.setN("Здоровье игрока: 100");
        voin.setA("Сила игрока: 10");
        voin.setM("Опыт игрока: 0");
        System.out.println(voin);
        Voin2 voin2 = new Voin2();
        voin2.setK("Обновленные характеристики игрока:");
        voin2.setA("Здоровье игрока: 120");
        voin2.setI("Сила игрока: 15");
        voin2.setR("Опыт игрока: 50");
        System.out.println(voin2);
        Voin3 voin3 = new Voin3();
        voin3.setS("Характеристики после атаки:");
        voin3.setT("Здоровье врага: 65");
        voin3.setV("Опыт игрока после атаки: 65");
        System.out.println(voin3);
    }
}
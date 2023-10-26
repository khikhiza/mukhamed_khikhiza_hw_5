public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();

        boss.setHealth(1000);
        boss.setDamage(60);
        boss.setDefence("Physical");

        System.out.println("Info about Boss:\n" + "Health: " + boss.getHealth() + "\nDamage: " + boss.getDamage() + "\nDefence: " + boss.getDefence());

        Hero[] heroesArray = createHeroes();

        for (Hero hero : heroesArray) {
            System.out.println("----------" + "\nInfo about hero:\n" + "Name: " + hero.getName() + "\nHealth: " + hero.getHealth() + "\nDamage: " + hero.getDamage() + "\nSuperpower: " + hero.getSuperpower());
        }
    }

    public static Hero[] createHeroes() {
        Hero warrior = new Hero("Jimmy", 300, 25);
        Hero medic = new Hero("MIke",320, 0, "Healing");
        Hero lucky = new Hero("Jon", 310, 15, "Dodged");

        Hero[] heroesArray = new Hero[3];
        heroesArray[0] = warrior;
        heroesArray[1] = medic;
        heroesArray[2] = lucky;

        return heroesArray;
    }
}
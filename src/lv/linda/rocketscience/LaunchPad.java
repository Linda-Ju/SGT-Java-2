package lv.linda.rocketscience;

public class LaunchPad {
    public static void main(String[] args) {
        Rocket rocket1 = new Rocket();
        System.out.println("There are " + rocket1.countRockets() + " rockets");

        System.out.println("NAme of the rocket: " + rocket1.getName());
        System.out.println("NAme of the rocket: " + rocket1.getWeight());

        // DON'T DO LIKE THIS
        Rocket rocket2 = rocket1;

        rocket1.setName("Starship");
        System.out.println("Name of the rocket: " + rocket2.getName());
        System.out.println("Name of the rocket: " + rocket2.getName());

        System.out.println(rocket1.id);
    }
}

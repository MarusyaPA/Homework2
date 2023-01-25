public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var Boxer1Weight = 78.2;
        var Boxer2Weight = 82.7;
        var AllWeight = Boxer1Weight + Boxer2Weight;
        System.out.println("Общий вес боксеров " + AllWeight + "кг");
        var DiffWeight = Boxer1Weight - Boxer2Weight;
        System.out.println("Разница в весе боксеров " + DiffWeight + "кг");
        var DiffWeight2 = Boxer2Weight % Boxer1Weight;
        System.out.println("Разница в весе боксеров " + DiffWeight2 + "кг");
        var AllHours = 640;
        var TimeForOne = 8;
        var Workers = AllHours / TimeForOne;
        System.out.println("Всего работников в компании " + Workers + " человек");
        var MoreWorkers = Workers + 94;
        var TimeForOne2 = AllHours/ MoreWorkers;
        System.out.println("Если в компании работает " + MoreWorkers + " человека, то всего " + TimeForOne2 + " часа работы может быть поделено между сотрудниками");
    }
}
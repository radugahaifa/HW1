public class Main {
    public static void main(String[] args) {
        //zadanie1
        var dog = 8.0;
        System.out.println(dog);
        dog = dog + 4;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        cat = cat + 4;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
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

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var totalWeight = firstBoxer + secondBoxer;
        System.out.println("Total weight of boxers is " + totalWeight);

        var overLoad = secondBoxer - firstBoxer;
        System.out.println(overLoad);
        var overload = (firstBoxer + secondBoxer) % overLoad;
        System.out.println(" overload is " + overLoad + " kg!");

        var hours = 640;
        var workHours = 8;
        var stuff = hours / workHours;
        System.out.println(" all employees " + stuff);

        var employee = 80;
        System.out.println(employee);
        employee = employee + 94;
        System.out.println(employee);

        var time = 640;
        var workers = 174;
        var workTime = time / workers;
        System.out.println(" new working time is " + workTime);


    }
}
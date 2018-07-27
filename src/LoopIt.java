public class LoopIt {
    //For Loop
    //While Loop
    //Do While Loop
    public static void main(String[] args) {
        LoopIt.loops();

    }

    private  static void loops() {
        //For Loop One
        System.out.println("For Loop");
        // Variable  Till  Step
        for (int i = 0; i < 6; i++)          //Condition
        {
            //Statements
            System.out.println(String.valueOf(i));
        }

        //For Each Loop
        String[] names = {"Susmit", "Parth", "Kaushbik"};
        for (String name : names)
        {
            System.out.println(name);
        }

        //While Loop
        System.out.println("While Loop");
        int j = 0;
        while (j != 6)
        {
            System.out.println(String.valueOf(j));
            j++;
        }

        //Do While Loop
        System.out.println("Do While Loop");
        int thirst = 6;

        do {
            thirst --;      //Drink One Unit Of Water
            System.out.println(String.format("After Drinking One Unit The Thirst Remaining is %d", thirst));
        }while (thirst != 0);


        System.out.println("Does then checks");
        thirst = 5;
        do {
            System.out.println(String.valueOf(thirst));         //On first iteration the statements are executed and THEN the condition is checked for remaining iterations.

        }while (thirst < 5);

    }





}

interface MealPlan{

    void prepare();

}

class VegetarianMeal implements MealPlan{

    public void prepare(){

        System.out.println("Vegetarian Meal");

    }

}

class VeganMeal implements MealPlan{

    public void prepare(){

        System.out.println("Vegan Meal");

    }

}

class Meal<T extends MealPlan>{

    T plan;

    Meal(T plan){

        this.plan=plan;

    }

}

class MealGenerator{

    public static <T extends MealPlan> void generate(T meal){

        meal.prepare();

    }

}

public class Meal{

    public static void main(String[] args){

        VegetarianMeal veg=new VegetarianMeal();

        MealGenerator.generate(veg);

    }

}
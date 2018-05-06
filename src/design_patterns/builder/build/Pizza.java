package design_patterns.builder.build;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

import static design_patterns.builder.build.NyPizza.Size.SMALL;
import static design_patterns.builder.build.Pizza.Topping.HAM;
import static design_patterns.builder.build.Pizza.Topping.ONION;
import static design_patterns.builder.build.Pizza.Topping.SAUSAGE;

public class Pizza {

    public enum Topping {
        HAM, MUSHROOM, ONION, PEPPER, SAUSAGE
    }

    final Set<Topping> toppings;

    abstract static class Builder<T extends Builder<T>> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }
        abstract Pizza build();

        // Subclasses must override this method to return "this"
        protected abstract T self();
    }
    Pizza(Builder<?> builder) {
        toppings = builder.toppings.clone();
    }

    public static void main(String[] args) {
        NyPizza pizza = new NyPizza.Builder(SMALL).addTopping(SAUSAGE).addTopping(ONION).build();

        Calzone calzone = new Calzone.Builder().addTopping(HAM).sauceInside().build();
    }
}

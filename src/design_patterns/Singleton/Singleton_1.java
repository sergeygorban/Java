package design_patterns.Singleton;

import enumMy_16.EnumMy;

public enum Singleton_1 {

    INSTANCE (){

    };

    public String getInstance() {

        return "ASD";
    }


    public static void main(String[] args) {

        System.out.println(Singleton_1.INSTANCE.getInstance());
    }
}

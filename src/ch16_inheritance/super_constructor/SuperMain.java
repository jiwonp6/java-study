package ch16_inheritance.super_constructor;

import ch16_inheritance.super_constructor.Child;

// #15 상속 (2024-02-22)
public class SuperMain {
    public static void main(String[] args) {
        Child child = new Child();
        // 1. Child -> Parents -> Grand
        // 2-1. Grand() -> Parent() -> Child()
        // 2-2. Grand() -> Parent(100) -> Child()
    }

}

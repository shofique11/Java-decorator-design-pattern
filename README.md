# Java-decorator-design-pattern

The Decorator Pattern is a structural design pattern that allows behavior to be added to individual objects, either statically or dynamically,
without affecting the behavior of other objects from the same class. 
It is often used to adhere to the Open/Closed Principle, 
which states that classes should be open for extension but closed for modification.

# Key Components
1. Component Interface: Defines the interface that will be implemented by core class and its decorators
2. Concrete Component: The base implementation of the interface that will be wrapped by decorators.
3. Decorator. An abstract class or interface that implements the component interface and contains a reference to a component instance.
4. Concrete Decorator: Extend the decorator class to add specific functionality.
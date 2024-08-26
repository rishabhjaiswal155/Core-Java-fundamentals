package rules_in_multipleinheritance_usinginterface;

public interface B {
	default void show() {
		System.out.println("In default show() implementation in interface B");
	}
}

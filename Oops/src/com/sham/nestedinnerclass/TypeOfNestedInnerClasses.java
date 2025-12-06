package com.sham.nestedinnerclass;

interface AnonymousClass {
	void show();
}

public class TypeOfNestedInnerClasses {

	class NestedInner {

	}

	static class NestedStaticInnerClass {

	}

	public static void main(String[] args) {
		
		final class LocalLevelClass {

			public void name() {
				System.out.println("Hii");
			}
		}

		LocalLevelClass levelClass = new LocalLevelClass();
		levelClass.name();

		AnonymousClass anonymousClass = new AnonymousClass() {
			public void show() {
				System.out.println("Hii show");
			}
		};

		anonymousClass.show();
	}
}

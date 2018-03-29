package ClassLoading;


class Parent {
	protected static String familyName = "parentyFamily";
    static { System.out.println("static block of Super class is initialized"); }
    {System.out.println("non static blocks in super class is initialized");}
}

public class Main {
    public static void main(String[] args) {
        String name = "Laksara Chandrasiri";

//        Length
        int length = name.length();
        System.out.println(length);

//        Char At
        char charLetter = name.charAt(0);
        System.out.println(charLetter);

//        Index
        int index = name.indexOf("a");
        System.out.println(index);
//        Last Index
        int lastIndex = name.lastIndexOf("a");
        System.out.println(lastIndex);

//        Upper Case
        String upperName = name.toUpperCase();
        System.out.println(upperName);
//        Lower Case
        String lowerName = name.toLowerCase();
        System.out.println(lowerName);

//        Trim
        String trimName = name.trim();
        System.out.println(trimName);

//        Replace
        String replaceName = name.replace("a", "o");
        System.out.println(replaceName);

//        Empty
        boolean isEmpty = name.isEmpty();
        System.out.println(isEmpty);

//        Check Character
        boolean haveCharacter = name.contains(" ");
        System.out.println(haveCharacter);

//        Two String Equals
        boolean equals = name.equals("test");
        System.out.println(equals);
//        Ignore Case Sensitivity
        equals = name.equalsIgnoreCase("Test");
        System.out.println(equals);

//        Sustring
        String subName = name.substring(0, 7);
        System.out.println(subName);
    }
}

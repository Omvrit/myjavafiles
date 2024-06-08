

public class string_methods {
    public static void main(String[] args) {
        String name = new String("  OmijOmij  ");
        System.out.println(name.toLowerCase());//
        System.out.println(name.toUpperCase());//
        System.out.println(name.trim());//tring tailing and ending spaces.
        System.out.println(name.isEmpty());//it checks if the given string is empty
        System.out.println(name.chars());
        System.out.println(name.replace('O','M'));
        System.out.println(name.replace("Om","om"));
        System.out.println(name.indexOf('O'));
        System.out.println(name.indexOf('m',3));
        System.out.println(name.lastIndexOf('m'));
        System.out.println(name.indexOf(' '));//can work on free spaces
        System.out.println(name.equals("  OmijOmij  "));


    }
}

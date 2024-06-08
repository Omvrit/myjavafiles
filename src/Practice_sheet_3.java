public class Practice_sheet_3 {
    public static void main(String[] args) {
        String name= "Om vrit chitrada";
        String name1 = name.toUpperCase();
        System.out.println(name1);

        String name2 = name.replace(' ','_');
        System.out.println(name2);
        String letter = "Dear <|name|> ,thanks a lot";
        letter = letter.replace("<|name|>",name);

        System.out.println(letter);
        System.out.println("\"Dear Harry ,This java course is really nice\"");
        if(true)
            System.out.printf("printf");
        System.out.println();

    }
}

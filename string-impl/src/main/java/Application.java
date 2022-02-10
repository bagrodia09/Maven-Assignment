public class Application {
    public static void main(String[] args) {
        //StringFunctions class is from <string-api> sub-module
        String name ="Knoldus INC.";
        int size = StringFunction.sizeofString(name);
        String reversed_string = StringFunction.reverseString(name);
        System.out.println(size+"\n"+reversed_string);
    }


}

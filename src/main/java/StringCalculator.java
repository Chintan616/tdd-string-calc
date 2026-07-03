public class StringCalculator {
    public int add(String numbers){

        if(numbers == null || numbers.isEmpty()) return 0;

        String delimeter = ",|\n";

        if(numbers.startsWith("//")){
            String customDelimeter = numbers.substring(2,3);
            delimeter = java.util.regex.Pattern.quote(customDelimeter);
            numbers = numbers.substring(3);
        }

        String[] parts = numbers.split(delimeter);
        int sum = 0;

        for(String part : parts){
            sum += Integer.parseInt(part);
        }

        return sum;
    }
}

public class ConditionalStatement {	
    public static void main(String[] args) {

        short age = 26;
        boolean male = true;
        float height = 1.82F;
        char firstNameLetter = 'M';


        if (age > 20) {
            System.out.println("Возраст больше 20 лет");
        }

        if (male == true) {
            System.out.println("Мужской пол");
        }

        if (male != true) {
            System.out.println("неМужской пол");
        }

        if (height < 1.80) {
            System.out.println("Рост меньше 180 см");
        } else {
            System.out.println("Рост больше 180 см");
        }

        if (firstNameLetter == 'M') {
            System.out.println("Первая буква имени: М ");
        } else if (firstNameLetter == 'I') {
            System.out.println("Первая буква имени: I ");
        } else {
            System.out.println("Первая буква имени: не M и не I ");
        }


    }
}
public class except {
    public static void main(String[] args) {

        String[] trainCodes = {
            "TN01", "TN02", "TN03", "TN04", "TN05"
        };

        try {
            System.out.println("Train Code: " + trainCodes[7]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: Invalid array index.");
            System.out.println("Please enter an index between 0 and 4.");
        }
    }
}

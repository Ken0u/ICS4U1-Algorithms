public class Committee {
    public static void main(String[] args) {
        formCommittee(3, 2, "");
    }
    
    public static void formCommittee(int spots, int femalesRequired, String soFar) {
        if (spots == 0) {
            System.out.println(soFar);
        } else {

            formCommittee(spots - 1, femalesRequired - 1, soFar + 'F');
            if (spots - femalesRequired > 0) { // enough spots for males
                formCommittee(spots - 1, femalesRequired, soFar + 'M');
            }
        }
    }
}

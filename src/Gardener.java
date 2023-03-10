public class Gardener extends Plant {
    public void filter() {
        char[] nameChars = this.name.toCharArray();

        char[] vowels = {'a', 'o', 'i','u','e'};
        for (int i = 0; i < nameChars.length; i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (nameChars[i] == vowels[j]) {
                    System.out.println("Error name include vowels");
                    return;
                }
            }
        }

        this.name = this.name + "VGTBL";
    }
}

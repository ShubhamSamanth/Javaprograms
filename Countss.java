class Countss {
    public static void main(String args[]) {

        int Rs[] = { 1000, 500, 100, 50, 20, 10, 5, 2, 1 };
        int amount = 2501;
        int copy = amount;
        int totalNotes = 0, count = 0;
        for (int i = 0; i < 9; i++) {
            count = amount / Rs[i];
            totalNotes = totalNotes + count;
            amount = amount % Rs[i];
        }

        System.out.println("Total Number of Notes\t= " + totalNotes);
    }
}
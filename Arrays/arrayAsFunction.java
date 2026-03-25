package Arrays;

public class arrayAsFunction {
    public static void updateMarks(int marks[]) {
        for(int i=0; i<marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String args[]) {
        int marks[] = {101, 102, 103};
        updateMarks(marks);
        System.out.println("Printing new marks: ");
        for(int i=0; i<marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
    }
}
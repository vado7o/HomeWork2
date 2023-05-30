public class Main {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.Add(33, 21, 38, 14, 15, 76, 37, 18);

        System.out.print("Начальный список: ");
        list.Print();

        list.Reverse();

        System.out.print("\nРеверсный список: ");
        list.Print();
    }

}
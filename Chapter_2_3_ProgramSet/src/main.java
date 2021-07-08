import javax.swing.JOptionPane;

class main {
  public static void main(String[] args) {
    String inputNumber = JOptionPane.showInputDialog("Enter: ");
    inputNumber = inputNumber + "3";
    System.out.println(inputNumber);
  }
}
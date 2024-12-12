public class Arraydemo {

   ArrayList elements = new ArrayList();

  public void add(int value) {
    elements.add(value);
  }

  public void add(float value) {
    elements.add(value);
  }

  public void add(String value) {
    elements.add(value);
  }

  public void add(double value) {
    elements.add(value);
  }

  public void printElements() {
    for (Object element : elements) {
      System.out.println(element);
    }
  }

  public static void main(String[] args) {
    Arraydemo al = new Arraydemo();
    al.add(10);
    al.add(28.5f);
    al.add("prajwal");
    al.add(40.78);
    System.out.println(elements);
  }
}

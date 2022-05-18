class MainMethodOverload
{
  public static void main(String name)
  {
    System.out.println("Name is : "+name);
  }
   public static void main(int rollno)
  {
    System.out.println("Rollno is : "+rollno);
  }

  public static void main(String args[])
  {
      main("Akash");
      main(20);
  }
}
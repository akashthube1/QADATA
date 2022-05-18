class UnaryOp
{
   public static void main(String args[])
   {
     int a = 1,b = 2,c = 3;

      a = --a + b++ + ++c;//8
   	  b = ++b - a++ + c++;//1
	  c = a++ + b-- + --c;//13
	  System.out.println("a = " +a+ " b = "+b+" c = "+c);
   }
}
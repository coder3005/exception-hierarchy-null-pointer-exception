/* NullPointerException */
class NPE
{
    public static void main(String[] args) {
        
        String str="abhi";

        try
        {
            System.out.println(str.toUpperCase());
        }
        catch(NullPointerException n)
        {
            System.out.println("null can't be casted");
        }
    }
}

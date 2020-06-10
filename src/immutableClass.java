public final class immutableClass
{
    final String ID;

    public immutableClass(String ID)
    {
        this.ID = ID;
    }
    public String getID()
    {
        return ID;
    }

    public static void main(String args[])
    {
        immutableClass s = new immutableClass("1");
        System.out.println(s.getID());
    }
}

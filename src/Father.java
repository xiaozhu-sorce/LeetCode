public class Father
{
    public static int num=0;
    Father()
    {
        ++num;
    }
    public int showFather()
    {
        return num;
    }
}

class Son extends Father
{
    public static int numr = 0;
    Son()
    {
        ++numr;
    }
    public int showSon()
    {
        return numr;
    }
}

class GrandSon extends Son
{
    public static int number=0;
    GrandSon()
    {
        ++number;
    }
    public int showGrandSon()
    {
        return number;
    }
}

class Count{
    public static void main(String args[ ])
    {
        Father f = new Father();
        Son s = new Son();
        GrandSon g = new GrandSon();
        Son s1=new Son();
        GrandSon g1=new GrandSon();
        Father f1=new Father();
        System.out.println("Father 类对象数目为" + Father.num);
        System.out.println("Son 类对象数目为 " + Son.numr);
        System.out.println("GrandSon 类对象数目为 " +g1.showGrandSon() );
        System.out.println("共创建对象数目为 "+g1.showGrandSon() ); }
}
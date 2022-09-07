class helloworld
{
    public static void main(String[] args) 
    {
        int counter=0;
        String s1 = "Hello World";
        String ans= "";
        for(int i=0;i<s1.length();i++)
        {
            boolean flag=true;
            while (flag)
            {
                counter++;
                char c =rand();
                if(c==s1.charAt(i))
                {
                    ans+=c;
                    flag=false;
                    System.out.println(ans);
                    continue;
                }
                System.out.println(ans+c);
            }
        }
        System.out.println("No of guesses "+counter);
    }
    static char rand()
    {
        char a=(char)((Math.random()*91)+32);
        return a;
    }
}
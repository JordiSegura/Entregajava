import java.io.*;
 
class f
{
    public static void main (String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
 
        System.out.println ("Introduzca un Numero: ");
        String nu = br.readLine ();
        int n = Integer.parseInt (nu);
 
        for (int i = 1 ; i <= n ; i++)
            if (n % i == 0)
                System.out.println (i);
    }
}
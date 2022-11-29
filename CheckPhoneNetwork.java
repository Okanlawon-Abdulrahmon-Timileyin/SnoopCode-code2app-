import java.util.*;

public class CheckPhoneNetwork extends NetworkProviders{
    private static String tel;


    public static void main ( String[] args ){

    Scanner input = new Scanner ( System.in );
    System.out.println ( "Enter a Nigeria phone number" );
    tel = input.nextLine ( );

    NetworkProviders providers = new NetworkProviders ( );
    providers.intializeList ( );
    System.out.println(providers.getNetworkName(tel));


    }
}

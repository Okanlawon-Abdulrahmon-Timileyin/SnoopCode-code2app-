import java.util.*;

public class NetworkProviders{

    public static ArrayList < String > mtnVisafone = new ArrayList < String > ( );
    public static ArrayList < String > mtn = new ArrayList < String > ( );
    public static ArrayList < String > airtel = new ArrayList < String > ( );
    public static ArrayList < String > glo = new ArrayList < String > ( );
    public static ArrayList < String > moblie9 = new ArrayList < String > ( );
    public static ArrayList < String > smile = new ArrayList < String > ( );
    public static ArrayList < String > multilinks = new ArrayList < String > ( );
    public static ArrayList < String > starcomms = new ArrayList < String > ( );
    public static ArrayList < String > zoomMobile = new ArrayList < String > ( );
    public static ArrayList < String > mtel = new ArrayList < String > ( );


    public static String networkPrefix, networkName;
    public static int i;
    public static char firstDigit;

    public void intializeList ( ){
    mtnVisafone.add ( "07025" );
    mtnVisafone.add ( "07026" );
    mtnVisafone.add ( "0704" );

    mtn.add ( "0703" );
    mtn.add ( "0706" );
    mtn.add ( "0803" );
    mtn.add ( "0806" );
    mtn.add ( "0810" );
    mtn.add ( "0813" );
    mtn.add ( "0814" );
    mtn.add ( "0816" );
    mtn.add ( "0903" );
    mtn.add ( "0906" );
    mtn.add ( "0906" );
    mtn.add ( "0913" );
    mtn.add ( "0916" );

    airtel.add ( "0701" );
    airtel.add ( "0708" );
    airtel.add ( "0808" );
    airtel.add ( "0812" );
    airtel.add ( "0901" );
    airtel.add ( "0902" );
    airtel.add ( "0904" );
    airtel.add ( "0912" );

    glo.add ( "0705" );
    glo.add ( "0805" );
    glo.add ( "0811" );
    glo.add ( "0815" );
    glo.add ( "0905" );
    glo.add ( "0915" );

    moblie9.add ( "0809" );
    moblie9.add ( "0817" );
    moblie9.add ( "0819" );
    moblie9.add ( "0909" );
    moblie9.add ( "0908" );

    smile.add ( "07020" );

    multilinks.add ( "07027" );
    multilinks.add ( "0709" );

    starcomms.add ( "07028" );
    starcomms.add ( "07029" );
    starcomms.add ( "0819" );

    zoomMobile.add ( "0707" );

    mtel.add ( "0804" );

    }


    public String getNetworkName(String phone){
    phone = phone.trim();

    if(phone.startsWith("+234")){
    phone = phone.substring(4);
    if(phone.startsWith("0")){
    phone = phone;
    } else {
    phone = "0"+phone;
    }
    }

    if(phone.isEmpty()){

    }

    for (i = 0; i < mtnVisafone.size(); i++){
    networkPrefix = mtnVisafone.get ( i );
    if ( phone.startsWith(networkPrefix) ){
    networkName = "Mtn NG (formerly visafone)";
    break;
    }
    }

    for (i = 0; i < mtn.size(); i++){
    networkPrefix = mtn.get ( i );
    if ( phone.startsWith(networkPrefix) ){
    networkName = "Mtn NG";
    break;
    }
    }

    for (i = 0; i < airtel.size(); i++){
    networkPrefix = airtel.get ( i );
    if ( phone.startsWith(networkPrefix) ){
    networkName = "Airtel NG";
    break;
    }
    }

    for (i = 0; i < moblie9.size(); i++){
    networkPrefix = moblie9.get ( i );
    if ( phone.startsWith(networkPrefix) ){
    networkName = "9Mobile NG";
    break;
    }
    }


    for (i = 0; i < glo.size(); i++){
    networkPrefix = glo.get ( i );
    if ( phone.startsWith(networkPrefix) )
    {
    networkName = "Glo NG";
    break;
    }
    }


    for (i = 0; i < smile.size(); i++){
    networkPrefix = smile.get ( i );
    if ( phone.startsWith(networkPrefix) ){
    networkName = "Smile";
    break;
    }
    }

    for (i = 0; i < multilinks.size(); i++){
    networkPrefix = multilinks.get(i);
    if(phone.startsWith(networkPrefix)){ 
    networkName = "Multilinks";
    break;
    }
    }

    for (i = 0; i < starcomms.size(); i++){
    networkPrefix = starcomms.get(i);
    if(phone.startsWith(networkPrefix)){ 
    networkName = "Starcomms";
    break;
    }
    }

    for (i = 0; i < zoomMobile.size(); i++){
    networkPrefix = zoomMobile.get(i);
    if(phone.startsWith(networkPrefix)){ 
    networkName = "Zoom Mobile";
    break;
    }
    }

    for (i = 0; i < mtel.size(); i++){
    networkPrefix = mtel.get(i);
    if(phone.startsWith(networkPrefix)){ 
    networkName = "Mtel";
    break;
    }
    }

    if(networkName == null){
    networkName = "invalid phone number";
    }
    return networkName;
    }
}


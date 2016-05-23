package part2.lection13;
import java.net.*;

public class WhoAmI {

	public static void main(String[] args) throws UnknownHostException{
		if (args.length !=1){
			System.err.println("Використання: WhoAmI MachineName");
			System.exit(1);
		}
		InetAddress a = InetAddress.getByName(args[0]);
		System.out.println(a);
	}
}

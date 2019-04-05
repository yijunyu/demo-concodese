import java.util.Arrays;

import uk.ac.open.crc.intt.IdentifierNameTokeniser;
import uk.ac.open.crc.intt.IdentifierNameTokeniserFactory;

import static java.lang.System.out;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public final class Example
{
	public static void main(String[] args)
	{
		IdentifierNameTokeniserFactory factory = new IdentifierNameTokeniserFactory();
		
		factory.setSeparatorCharacters("._$");
		
		IdentifierNameTokeniser tokeniser = factory.create();
		
		try {
			Process p = Runtime.getRuntime().exec("fast -i -p " + args[0] + " /tmp/t.pb");

			BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
			BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));
			String s;
			System.out.println("{");
			while ((s = stdInput.readLine()) != null) {
				System.out.print("\"");
				String [] tokens = s.split(" ");
				System.out.print(tokens[1]);
				System.out.println("\": {");
				int n = tokens.length;
				for (int i = 2; i < n; i++) {
					String t = tokens[i].substring(0, tokens[i].indexOf("("));
					System.out.println("\"" + t + "\": \"" + tokeniser.tokenise(t)[0] + "\",");
				}
				System.out.println("}");
			}
			System.out.println("}");
		} catch (IOException ex) {
		}
	}
}

package day26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;

public class Demo2Client {
	public static void main(String[] args) {
		Socket socket = null;
		OutputStreamWriter writeOut = null;
		BufferedReader  readIn = null;
		BufferedReader in = null;
		try {
			socket = new Socket(InetAddress.getLocalHost(), 9999);
			writeOut = new OutputStreamWriter(socket.getOutputStream());
			readIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			in = new BufferedReader(new InputStreamReader(System.in));
			while (true) {
				System.out.println("«Î—°‘Òπ¶ƒ‹£∫(A)◊¢≤·        (B)µ«¬º        (Q)ÕÀ≥ˆ");
				String option = in.readLine();
				if ("a".equalsIgnoreCase(option)) {
					selection(writeOut, readIn, in, option);
				} else if ("b".equalsIgnoreCase(option)) {
					selection(writeOut, readIn, in, option);
				} else if ("q".equalsIgnoreCase(option)) {
					System.out.println("ÕÀ≥ˆœµÕ≥£°");
					System.exit(0);
				} else {
					System.out.println(" ‰»Î¥ÌŒÛ£°");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
				readIn.close();
				writeOut.close();
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}

	public static void selection(OutputStreamWriter writeOut,
			BufferedReader readIn, BufferedReader in, String option)
			throws IOException {
		System.out.println("«Î ‰»Î’ ∫≈£∫");
		String username = in.readLine();
		System.out.println("«Î ‰»Î√‹¬Î£∫");
		String password = in.readLine();
		String info = option+" "+username+" "+password+"\r\n";
		writeOut.write(info);
		writeOut.flush();
		
		String message = readIn.readLine();
		System.out.println(message);
	}
}

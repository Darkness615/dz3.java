

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class dz3 {
	private static String USER_NAME;
	private static int CLIENT_ID;

	static Map<String, String> cens = new HashMap<>();

	static {

	}

	public static void main(String[] args) throws IOException {

		// работаем с censMessage далее
	}

	private static String isCens(String message) {
		return cens.getOrDefault(message, message);
	}

	private static void startChart(int clientId, BufferedReader reader) {
		String fileName = prepareFileName(clientId);
		readLastMSG(clientId, fileName);
	}

	private static void readLastMSG(int clientId, String fileName) {

	}

	private static String prepareFileName(int clientId) {

	}

	private static int getUserId(String username) {
		return 1234;
	}

	private static boolean authUser(String USER_NAME) {
		return true;
	}
}

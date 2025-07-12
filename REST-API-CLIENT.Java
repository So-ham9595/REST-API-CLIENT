import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;
import java.util.Scanner;

public class WeatherApp {
    private static final String API_KEY = "3d7fb16c207db3d967da15d27c1dd21f"; 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter city name: ");
        String city = scanner.nextLine();
        scanner.close();

        String urlString = "https://api.openweathermap.org/data/2.5/weather?q=" + city +
                "&appid=" + API_KEY + "&units=metric";

        try {
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuilder responseContent = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                responseContent.append(inputLine);
            }
            in.close();

            JSONObject obj = new JSONObject(responseContent.toString());
            JSONObject main = obj.getJSONObject("main");
            JSONObject wind = obj.getJSONObject("wind");

            System.out.println("\n--- Weather Report for " + city.toUpperCase() + " ---");
            System.out.println("Temperature: " + main.getDouble("temp") + "°C");
            System.out.println("Feels Like: " + main.getDouble("feels_like") + "°C");
            System.out.println("Humidity: " + main.getInt("humidity") + "%");
            System.out.println("Wind Speed: " + wind.getDouble("speed") + " m/s");
            System.out.println("Condition: " + obj.getJSONArray("weather").getJSONObject(0).getString("description"));

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

# REST-API-CLIENT
COMPANY: CODETECH IT SOLUTIONS

NAME: Soham Santosh Salunkhe

Intern ID :CITS0D507

DOMAIN: JAVA PROGRAMMING

BATCH DURATION: 4 Weeks from
 June  17th  2025  to July 14th, 2025.

MENTOR NAME: NEELA SANTHOSH


The Java WeatherApp is a simple yet practical console-based application that retrieves real-time weather information for any city entered by the user. It uses the OpenWeatherMap API to fetch current weather data such as temperature, humidity, wind speed, and weather conditions. The application is implemented using standard Java networking and I/O classes, and it parses JSON responses using the org.json library. This project effectively demonstrates how to integrate an external web API into a Java program, making it a great learning experience for beginners in both Java development and working with RESTful APIs.

When the user runs the program, they are prompted to enter the name of a city. In the output shown, the user enters “pune”, and the application converts the input to uppercase for display purposes in the final report. The program constructs a URL with the given city name, the OpenWeatherMap API key, and additional parameters (like units=metric) to request data in Celsius. It opens a connection to the API using HttpURLConnection and reads the response using a BufferedReader. The response comes in JSON format, which the program parses using the JSONObject class from the external json-20230618.jar library.

The information extracted from the API includes the actual temperature, the “feels like” temperature, the humidity level, wind speed, and a short description of the weather condition (in this case, “broken clouds”). The results are then printed in a user-friendly format to the console. This process demonstrates the basic flow of a real-world API interaction: sending a request, handling the response, parsing structured data, and presenting it to the user.

In the provided screenshot, the application is compiled using the javac command with the -cp (classpath) flag, which includes the JSON library. A warning appears about deprecated APIs, which is common and not critical for this program's functionality. After compilation, the program is executed using the java command with the same classpath setting. The application runs smoothly and provides an accurate weather report for Pune, showing that the HTTP request, JSON parsing, and output formatting are working as expected.

This project is ideal for students or developers who want to practice API consumption in Java and get comfortable using external libraries. It introduces key programming concepts like working with URLs, handling exceptions, using streams, and parsing JSON. It also emphasizes proper use of Java classes and object-oriented structure. The app can be extended further by adding support for forecasts, country code filters, or a GUI interface using Swing or JavaFX.

In summary, the Java WeatherApp is a well-rounded beginner project that demonstrates how to build a functional, real-time weather application using an external API and Java’s core features. It provides a hands-on understanding of HTTP communication, JSON data handling, and user interaction, making it a valuable mini-project for both learning and demonstration purposes.

# OUTPUT
![Image](https://github.com/user-attachments/assets/1a8aa0e0-24ba-4772-8e3b-5986a34c4611)

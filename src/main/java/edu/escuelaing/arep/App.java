package edu.escuelaing.arep;

import static spark.Spark.get;
import static spark.Spark.port;
public class App
{
    public static void main( String[] args ) {
        port(getPort());
        get("/converter", ((request, response) -> {
            Double num = Double.parseDouble(request.queryParams("value"));
            return Converter.Convert(num);
        }));

    }
    
    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }

}
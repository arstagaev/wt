package com.revolve44.windturbine1;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Mushtaq on 05-11-2018.
 */
public class WeatherResponse {

    @SerializedName("coord")
    public Coord coord;
    @SerializedName("sys")
    public Sys sys;
    //    @SerializedName("weather")
//    public ArrayList<Weather> weather = new ArrayList<Weather>();
    @SerializedName("main")
    public Main main;
    @SerializedName("wind")
    public Wind wind;
    @SerializedName("rain")
    public Rain rain;
    @SerializedName("clouds")
    public Clouds clouds;
    @SerializedName("dt")
    public float dt;
    @SerializedName("id")
    public int id;
    @SerializedName("name")
    public String name;
    @SerializedName("cod")
    public float cod;
    @SerializedName("temp")
    public float temp;
    // test \/
    @SerializedName("Weather")
    public weather weather;
    @SerializedName("timezone")
    public long timezone;

}

class weather {
    @SerializedName("id")
    public int id;
    @SerializedName("main")
    public String main;
    @SerializedName("description")
    public String description;
    @SerializedName("icon")
    public String icon;
}

class Clouds {
    @SerializedName("all")
    public float all;
}

class Rain {
    @SerializedName("3h")
    public float h3;
}

class Wind {
    @SerializedName("speed")
    public float speed;
    @SerializedName("deg")
    public float deg;
}

class Main {
    @SerializedName("temp")
    public float temp;
    @SerializedName("humidity")
    public float humidity;
    @SerializedName("pressure")
    public float pressure;
    @SerializedName("temp_min")
    public float temp_min;
    @SerializedName("temp_max")
    public float temp_max;
}

class Sys {
    @SerializedName("country")
    public String country;
    @SerializedName("sunrise")
    public long sunrise;
    @SerializedName("sunset")
    public long sunset;
}

class Coord {
    @SerializedName("lon")
    public float lon;
    @SerializedName("lat")
    public float lat;
}

class Timezone {
    @SerializedName("timezone")
    public float timezone;
}

class Sunrise {
    @SerializedName("sunrise")
    public float sunrise;
}

class Sunset {
    @SerializedName("sunset")
    public float sunset;
}
//public class WeatherResponse {
//
//    @SerializedName("coord")
//    public Coord coord;
//    @SerializedName("sys")
//    public Sys sys;
//    @SerializedName("weather")
//    public ArrayList<Weather> weather = new ArrayList<Weather>();
//    @SerializedName("main")
//    public Main main;
//    @SerializedName("wind")
//    public Wind wind;
//    //    @SerializedName("rain")
////    public Rain rain;
//    @SerializedName("clouds")
//    public Clouds clouds;
//    @SerializedName("dt")
//    public float dt;
//    @SerializedName("id")
//    public int id;
//    @SerializedName("name")
//    public String name;
//    @SerializedName("cod")
//    public float cod;
//    @SerializedName("temp")
//    public float temp;
//
//}
//
//class Weather {
//    @SerializedName("id")
//    public int id;
//    @SerializedName("main")
//    public String main;
//    @SerializedName("description")
//    public String description;
//    @SerializedName("icon")
//    public String icon;
//}
//
//class Clouds {
//    @SerializedName("all")
//    public float all;
//}
//
//class Rain {
//    @SerializedName("3h")
//    public float h3;
//}
//
//class Wind {
//    @SerializedName("speed")
//    public float speed;
//    @SerializedName("deg")
//    public float deg;
//}
//
//class Main {
//    @SerializedName("temp")
//    public float temp;
//    @SerializedName("humidity")
//    public float humidity;
//    @SerializedName("pressure")
//    public float pressure;
//    @SerializedName("temp_min")
//    public float temp_min;
//    @SerializedName("temp_max")
//    public float temp_max;
//
//
//}
//
//class Sys {
//    @SerializedName("country")
//    public String country;
//    @SerializedName("sunrise")
//    public long sunrise;
//    @SerializedName("sunset")
//    public long sunset;
//}
//
//class Coord {
//    @SerializedName("lon")
//    public float lon;
//    @SerializedName("lat")
//    public float lat;
//}

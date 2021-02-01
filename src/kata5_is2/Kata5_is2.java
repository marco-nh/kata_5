
package kata5_is2;
import java.sql.*;

public class Kata5_is2 {


    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        PeopleLoader peopleLoader = new SqlitePeopleReader();
        Histogram<String> histogram = new Histogram();
        
        for(Person p : peopleLoader.load()){
            histogram.increment(p.getEmailDomain());
        }
        
        HistogramDisplay histogramDisplay = new HistogramDisplay("Prueba", histogram);
        histogramDisplay.execute();
    }
    
}

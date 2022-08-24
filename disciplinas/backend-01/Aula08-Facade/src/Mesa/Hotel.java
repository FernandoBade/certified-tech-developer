package Mesa;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Hotel {

    public String buscarHotel(String destino, LocalDate dataPartida, LocalDate dataRetorno){
        List<String> hoteis = Arrays.asList("Hotel 1", "Hotel 2", "Hotel 3");
        Random r = new Random();
        return hoteis.get(r.nextInt(hoteis.size()));
    }
}


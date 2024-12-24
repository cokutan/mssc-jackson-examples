package guru.springframework.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.ActiveProfiles;


@JsonTest
@ActiveProfiles("kebabcase")
class BeerDtoTest {
    @Autowired
    ObjectMapper objectMapper;

    @Test
    public void testBeerDto() throws JsonProcessingException {
        BeerDto beerDto = BeerDto.builder().beerName("cagla").beerStyle("boynuegri").build();
        String convertValue = objectMapper.writeValueAsString(beerDto);
        System.out.println(convertValue);
    }
}
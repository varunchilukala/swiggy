package counrtyDemo;

public class TestCountry {
    public static void main(String[] args) {

        Country country=new Country();
        country.countryname="india";
        country.language="hindi";
        country.state= country.state;

        State state=new State();
        state.statename="tg";
        state.language="telugu";
        state.country=country;



    }
}

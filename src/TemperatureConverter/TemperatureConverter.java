package TemperatureConverter;
/*
Zadanie 3
Stwórz klasę enum TemperatureConvert ze stałymi C_F , C_K , K_C , F_C , F_K ,
K_F . Enum powinien zawierać konstruktor przyjmujący trzy parametry:jednostkę temperatury na wejściu
jednostkę temperatury na wyjściu
instancję interfejsu Converter (z metodą float convert(float tempIn) ) -
instancja ta powinna de nować niezbędne obliczenia w celu konwersji
temperatury
Dodatkowo enum TemperatureConvert powinien zawierać metodę statyczną
convertTemperature , która przyjmuje następujące parametry:
jednostkę temperatury na wejściu
jednostkę temperatury na wyjściu
wartość temperatury
Metoda ta powinna zwracać skonwertowaną wartość. Do znalezienia
odpowiedniej stałej należy skorzystać z metody values()
 */


public enum TemperatureConverter {

    C_F('C', 'F', new Converter() {
        @Override
        public float convert(float tempIN) {
            return (float)(tempIN*1.8)+32;
        }
    }),
    C_K('C', 'K', new Converter() {
        @Override
        public float convert(float tempIN) {
            return (float)(tempIN+273.15);
        }
    }),
    K_C('K', 'C', new Converter() {
        @Override
        public float convert(float tempIN) {
            return (float) (tempIN-273.15);
        }
    }),
    F_C('F', 'C', new Converter() {
        @Override
        public float convert(float tempIN) {
            return (tempIN-32)*5/9;
        }
    }),
    F_K('F', 'K', new Converter() {
        @Override
        public float convert(float tempIN) {
            return (float)((tempIN*5/9)+459.67);
        }
    });

    private char input;
    private char output;
    private Converter converter;

    TemperatureConverter(char input, char output, Converter converter) {
        this.input = input;
        this.output = output;
        this.converter = converter;
    }
    public static float temperatureConverter(char in, char out, float tempIN){
        float convertedTemperature = 0;
        for (TemperatureConverter values : TemperatureConverter.values()) {
            if (values.input==in&&values.output==out){
                convertedTemperature =values.converter.convert(tempIN);
            }

        }
        return convertedTemperature;
    }
}

public record Monedas(String base_code,
                      String target_code,
                      double conversion_rate,
                      double conversion_result) {
    public String toString(){
        return String.format("Conversion de %s a %s: $%.2f %s",
                base_code, target_code, conversion_result, target_code);
    }
}

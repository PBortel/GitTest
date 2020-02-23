public class StringUtilis {
    static String prepareString (String stringToCheck) {
        return stringToCheck
                .replaceAll(",", "")
                .replaceAll(" ", "")
                .replaceAll("\\.", "")
                .toLowerCase();
     }
}

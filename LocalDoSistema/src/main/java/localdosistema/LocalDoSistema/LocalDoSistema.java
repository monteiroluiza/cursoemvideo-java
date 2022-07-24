package localdosistema.LocalDoSistema;

import java.util.Locale;

public class LocalDoSistema {
    public static void main(String[] args) {
        Locale loc = Locale.getDefault();
        System.out.println("O idioma do sistema é:");
        System.out.println(loc.getDisplayLanguage());
    }
}

package resolucaodatela.ResolucaoDaTela;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoDaTela {
    public static void main(String[] args) {
        Toolkit resolucao = Toolkit.getDefaultToolkit();
        Dimension d = resolucao.getScreenSize();
        System.out.println("A resolução da sua tela é:");
        System.out.println(d.width + "x" + d.height);
    }
}

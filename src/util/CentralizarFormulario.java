package util;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

public class CentralizarFormulario {

    public static void centralizaJanelaInterna(JInternalFrame janela, JDesktopPane desktop) {
        //FUNÇÃO CENTRALIZAR JANELA
        int lDesk = desktop.getWidth();   //PEGA LARGURA DA DESTOP
        int aDesk =  desktop.getHeight() -90;  //PEGA ALTURA DA DESTOP
        int lIFrame = janela.getWidth();
        int aIFrame = janela.getHeight();
        janela.setLocation(lDesk / 2 - lIFrame / 2, aDesk / 2 - aIFrame / 2);
        desktop.add(janela);
        janela.setVisible(true);

    }

}

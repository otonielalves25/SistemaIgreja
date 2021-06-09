package impressao;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import dao.MembroDao;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Membro;

/**
 *
 * @author Tony
 */
public class Impressao {

    public static void imprimirListaMembro() throws FileNotFoundException {

        MembroDao membroDao = new MembroDao();
        Document doc = new Document();
        ArrayList<Membro> listagem = membroDao.getListagem("");

        String nomeDoPdf = "Relatorio.pdf";  // nome que vai gerar
        try {
            PdfWriter.getInstance(doc, new FileOutputStream(nomeDoPdf));
            doc.open();  // abre para escrever
            Paragraph p = new Paragraph("Relatorio de Membros - " + new SimpleDateFormat("dd/MM/yyyy").format(new Date())); //titulo
            p.setAlignment(1);  // 0=left - 1=center - 2=right
            doc.add(p);

            p = new Paragraph(" "); //titulo

            doc.add(p);

            PdfPTable table = new PdfPTable(5); // cria table e colunas

            //LARGURA DAS COLUNAS
            table.setWidths(new int[]{30, 80, 80, 80,80}); // Largura das colunas
            doc.add(table);

            PdfPCell cel1 = new PdfPCell(new Paragraph("CODIGO"));
            PdfPCell cel2 = new PdfPCell(new Paragraph("NOME"));
            PdfPCell cel3 = new PdfPCell(new Paragraph("SOBRENOME"));
            PdfPCell cel4 = new PdfPCell(new Paragraph("SOBRENOME"));
            PdfPCell cel5 = new PdfPCell(new Paragraph("SOBRENOME"));

            table.addCell(cel1);
            table.addCell(cel2);
            table.addCell(cel3);
            table.addCell(cel4);
            table.addCell(cel5);

            doc.add(table); // adiciona a table

            doc.close();	//fecha o arquivo depois de escrito
            Desktop.getDesktop().open(new File(nomeDoPdf)); // abre pdf

        } catch (DocumentException ex) {
            Logger.getLogger(Impressao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Impressao.class.getName()).log(Level.SEVERE, null, ex);
        }
        doc.open();  // abre para escrever

    }

}

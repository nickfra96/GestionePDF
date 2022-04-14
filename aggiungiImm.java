
package it.francesco.progetti.gestorePDF;

import java.io.FileOutputStream;
import java.net.URL;

import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class aggiungiImm {
	public static void main(String[] args) {
		Document documento = new Document(); 
		try
		{
			PdfWriter writer = PdfWriter.getInstance(documento, new FileOutputStream("PDFimm.pdf"));
			documento.open();
			documento.add(new Paragraph("Immagine example"));

			Image image1 = Image.getInstance("1.png");
			image1.scaleAbsolute(200, 200);

			documento.add(image1);

			documento.close();
			writer.close();
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}

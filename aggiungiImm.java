
package it.francesco.progetti.gestorePDF;

import java.io.FileOutputStream;

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

			Image immagine = Image.getInstance("1.png");
			immagine.scaleAbsolute(100, 100);

			documento.add(immagine);

			documento.close();
			writer.close();
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}

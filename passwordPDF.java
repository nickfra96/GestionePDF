package it.francesco.progetti.passwordPDF;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Date;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class passwordPDF{
	private static String UTENTE_PSW = "password";
	private static String PSW_PROPRETARIO = "psw";

	public static void main(String[] args) {
		try 
		{
			OutputStream file = new FileOutputStream(new File("PDFpassword.pdf"));
			Document documento = new Document();
			PdfWriter writer = PdfWriter.getInstance(documento, file);

			writer.setEncryption(UTENTE_PSW.getBytes(),
					PSW_PROPRETARIO.getBytes(), PdfWriter.ALLOW_PRINTING,
					PdfWriter.ENCRYPTION_AES_128);

			documento.open();
			documento.add(new Paragraph("PDF protetto da psw!"));
			documento.close();
			file.close();

		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}

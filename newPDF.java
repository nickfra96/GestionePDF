package it.francesco.progetti.gestorePDF;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class newPDF
{
   public static void main(String[] args)
   {
      Document documento = new Document();
      try
      {
         PdfWriter writer = PdfWriter.getInstance(documento, new FileOutputStream("test.pdf"));
         documento.open();
         documento.add(new Paragraph("Ciao questo è un pdf."));
         documento.close();
         writer.close();
      } catch (DocumentException e)
      {
         e.printStackTrace();
      } catch (FileNotFoundException e)
      {
         e.printStackTrace();
      }
   }
}

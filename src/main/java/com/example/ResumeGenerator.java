package com.example;

import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

import java.io.File;

public class ResumeGenerator {
    public static void main(String[] args) {
        String dest = "resume.pdf";
        try {
            PdfWriter writer = new PdfWriter(dest);
            PdfDocument pdf = new PdfDocument(writer);
            Document document = new Document(pdf);

            document.add(new Paragraph("N Ashok Reddy").setBold().setFontSize(20));
            document.add(new Paragraph("Email: ashok@example.com | Phone: +91-9876543210"));
            document.add(new Paragraph("LinkedIn: linkedin.com/in/ashok | GitHub: github.com/ashok"));
            document.add(new Paragraph("\nEducation")
                    .setBold().setFontSize(14));
            document.add(new Paragraph("B.Tech in Computer Science, XYZ University, 2016 - 2020\nCGPA: 8.5/10"));

            document.add(new Paragraph("\nSkills")
                    .setBold().setFontSize(14));
            document.add(new Paragraph("Languages: Java, Python, C++\nWeb: HTML, CSS, JS\nTools: Git, Maven\nFrameworks: Spring Boot, React"));

            document.add(new Paragraph("\nProjects")
                    .setBold().setFontSize(14));
            document.add(new Paragraph("1. Online Ticket Booking System\n   Spring Boot + React\n"
                    + "2. Portfolio Website\n   HTML, CSS, JS"));

            document.add(new Paragraph("\nExperience")
                    .setBold().setFontSize(14));
            document.add(new Paragraph("Intern, ABC Software\nJune 2022 - Aug 2022\nBuilt internal tools using Python + Flask"));

            document.close();
            System.out.println("Resume PDF created at: " + dest);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

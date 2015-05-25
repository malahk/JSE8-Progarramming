package ua.oracle.academy;

public class MarkDownParserMain {

	public static void main(String[] args) 
	{
		System.out.println(MarkDownParser.getHTMLStart(""));	
		System.out.println(MarkDownParser.createHeader("##Header line"));
		System.out.println(MarkDownParser.getHTMLEnd(""));
		System.out.println(MarkDownParser.parseURL("Line with link [Link to google](https://www.google.com) in center"));// TODO Auto-generated method stub
		System.out.println(MarkDownParser.parseEmphasi2("Simple line *with* em"));
		System.out.println(MarkDownParser.parseStrong("Simple **line** with strong"));
	}

}

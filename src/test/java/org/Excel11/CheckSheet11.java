package org.Excel11;

import java.io.IOException;

public class CheckSheet11 extends ExcelSheet11 {
	public static void main(String[] args) throws IOException {
		creteexcelsheet(0, 0, "Sl.No");
		createrow(0, 1, "Student Name");
		createrow(0, 2, "Coures Name");
		createcell(1, 0, "1");
		createrow(1, 1, "Ramesh");
		createrow(1, 2, "EEE");
		createcell(2, 0, "2");
		createrow(2, 1, "Ramani");
		createrow(2, 2, "ECE");
		createcell(3, 0, "3");
		createrow(3, 1, "Shabadeesh");
		createrow(3, 2, "Mech Engg");
		createcell(4, 0, "4");
		createrow(4, 1, "Yoshritha");
		createrow(4, 2, "CSE");
		createcell(5, 0, "5");
		createrow(5, 1, "Bhupathi");
		createrow(5, 2, "MBA");
		createcell(6, 0, "6");
		createrow(6, 1, "Srithar");
		createrow(6, 2, "CSE");
		createcell(7, 0, "7");
		createrow(7, 1, "Simbu");
		createrow(7, 2, "DME");
		createcell(8, 0, "8");
		createrow(8, 1, "Hemesh");
		createrow(8, 2, "ECE");
		createcell(9, 0, "9");
		createrow(9, 1, "Eniyan");
		createrow(9, 2, "CE");
		createcell(10, 0, "10");
		createrow(10, 1, "Venba");
		createrow(10, 2, "CSE");
	}

}

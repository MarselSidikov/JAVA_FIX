package ru.ivmiit;

import com.diogonunes.jcdp.color.ColoredPrinter;
import com.diogonunes.jcdp.color.api.Ansi.BColor;
import com.diogonunes.jcdp.color.api.Ansi.FColor;
import com.diogonunes.jcdp.color.api.Ansi.Attribute;

class Program {
	public static void main(String[] args) {
		ColoredPrinter cp = new ColoredPrinter.Builder(1, false)
                        .foreground(FColor.WHITE).background(BColor.BLUE)   //setting format
                        .build();

        cp.setAttribute(Attribute.REVERSE);
		cp.println("Hello!");
		cp.clear();
	}
}